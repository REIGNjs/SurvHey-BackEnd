package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.QuestionResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Results
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-27T16:32:59.103Z[GMT]")


public class Results   {
  @JsonProperty("survey_id")
  private Long surveyId = null;

  @JsonProperty("questionResults")
  @Valid
  private List<QuestionResult> questionResults = null;

  public Results surveyId(Long surveyId) {
    this.surveyId = surveyId;
    return this;
  }

  /**
   * Get surveyId
   * @return surveyId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Long getSurveyId() {
    return surveyId;
  }

  public void setSurveyId(Long surveyId) {
    this.surveyId = surveyId;
  }

  public Results questionResults(List<QuestionResult> questionResults) {
    this.questionResults = questionResults;
    return this;
  }

  public Results addQuestionResultsItem(QuestionResult questionResultsItem) {
    if (this.questionResults == null) {
      this.questionResults = new ArrayList<QuestionResult>();
    }
    this.questionResults.add(questionResultsItem);
    return this;
  }

  /**
   * Get questionResults
   * @return questionResults
   **/
  @Schema(description = "")
      @Valid
    public List<QuestionResult> getQuestionResults() {
    return questionResults;
  }

  public void setQuestionResults(List<QuestionResult> questionResults) {
    this.questionResults = questionResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Results results = (Results) o;
    return Objects.equals(this.surveyId, results.surveyId) &&
        Objects.equals(this.questionResults, results.questionResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyId, questionResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Results {\n");
    
    sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
    sb.append("    questionResults: ").append(toIndentedString(questionResults)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
