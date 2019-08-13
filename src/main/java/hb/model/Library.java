package hb.model;


public class Library {

  private Long libraryId;
  private Long libraryTypeId;
  private String question;
  private String answer;
  private String releaseStatus;
  private java.time.LocalDateTime releaseTime;
  private String createBy;
  private java.time.LocalDateTime createTime;
  private String updateBy;
  private java.time.LocalDateTime updateTime;
  private String isDelete;


  public Long getLibraryId() {
    return libraryId;
  }

  public void setLibraryId(Long libraryId) {
    this.libraryId = libraryId;
  }


  public Long getLibraryTypeId() {
    return libraryTypeId;
  }

  public void setLibraryTypeId(Long libraryTypeId) {
    this.libraryTypeId = libraryTypeId;
  }


  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }


  public String getReleaseStatus() {
    return releaseStatus;
  }

  public void setReleaseStatus(String releaseStatus) {
    this.releaseStatus = releaseStatus;
  }


  public java.time.LocalDateTime getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(java.time.LocalDateTime releaseTime) {
    this.releaseTime = releaseTime;
  }


  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public java.time.LocalDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.time.LocalDateTime createTime) {
    this.createTime = createTime;
  }


  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }


  public java.time.LocalDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.time.LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }

}
