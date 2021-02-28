drop schema if exists SurvHey_DB;
create schema SurvHey_DB;



create table SurvHey_DB.User
(
    E_Mail varchar(45) primary key,
    Password text not null
);

create table SurvHey_DB.Survey (
                                   Survey_ID bigint auto_increment primary key,
                                   E_Mail varchar(45) not null,
                                   Survey_Name text,
                                   Question_Text text,
                                   Answer_Mode varchar(5),
                                   foreign key (E_Mail) references SurvHey_DB.User(E_Mail) on update cascade on delete cascade
);



create table SurvHey_DB.Answer_Option (
                                          Answer_Option_ID bigint auto_increment primary key,
                                          Survey_ID bigint not null,
                                          Answer_Option text,
                                          foreign key (Survey_ID) references SurvHey_DB.Survey(Survey_ID) on update cascade on delete cascade
);


create table SurvHey_DB.Submission (
                                       Submission_ID bigint auto_increment primary key,
                                       Survey_ID bigint not null,
                                       IP_Adress text not null,
                                       Timestamp timestamp,
                                       foreign key (Survey_ID) references Survey(Survey_ID) on update cascade on delete cascade
);


create table SurvHey_DB.Question_Answer(
                                           Submission_ID bigint not null,
                                           Answer_Option_ID bigint not null,
                                           CONSTRAINT PK_Person PRIMARY KEY (Submission_ID,Answer_Option_ID),
                                           foreign key (Submission_ID) references SurvHey_DB.Submission(Submission_ID) on update cascade on delete cascade,
                                           foreign key (Answer_Option_ID) references SurvHey_DB.Answer_Option(Answer_Option_ID) on update cascade on delete cascade

);


//Testdata

insert into survhey_db.User(E_Mail,Password) values('Gur@ke.com','1234');
insert into survhey_db.User(E_Mail,Password) values('Ka@rotte.de','hallo');
insert into survhey_db.User(E_Mail,Password) values('Ban@ane.net','bye');
insert into survhey_db.User(E_Mail,Password) values('Ap@fel.info','start');