package io.swagger.services;

import io.swagger.model.Submission;
import io.swagger.model.Survey;
import io.swagger.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class SubmissionService {

    @Autowired
    private SubmissionRepository submissionRepository;

    public Submission findByID(long ID){

        return submissionRepository.findById(ID);
    }

    public Submission createSubmission(Submission submission){
        Submission createdSubmission=submissionRepository.save(submission);
        submissionRepository.flush();
        return createdSubmission;

    }

    public List<Submission> findAllbySurveyID(long ID){
        return submissionRepository.findBysurveyId(ID);


    }

    public boolean checkIfExistBysurveyIDandIpAddress(long surveyID, String IPAdress){
        List <Submission> submissionList=submissionRepository.findBysurveyId(surveyID);
        Iterator <Submission>AllList = submissionList.iterator();
        Submission currentSet;

        while(AllList.hasNext()){
            currentSet=AllList.next();
            if(currentSet.getIpAddress()==IPAdress){
                return true;

            }

        }
        return false;

    }

}
