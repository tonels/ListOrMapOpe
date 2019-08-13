package hb.model;


public class TaskTargetRel {

  private Long taskTargetId;
  private Long taskId;
  private Long targetId;
  private String targetValue;
  private String weightPoints;
  private String createdBy;
  private java.time.LocalDateTime createdTime;
  private String updatedBy;
  private java.time.LocalDateTime updatedTime;
  private String isDeleted;


  public Long getTaskTargetId() {
    return taskTargetId;
  }

  public void setTaskTargetId(Long taskTargetId) {
    this.taskTargetId = taskTargetId;
  }


  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }


  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }


  public String getTargetValue() {
    return targetValue;
  }

  public void setTargetValue(String targetValue) {
    this.targetValue = targetValue;
  }


  public String getWeightPoints() {
    return weightPoints;
  }

  public void setWeightPoints(String weightPoints) {
    this.weightPoints = weightPoints;
  }


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public java.time.LocalDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(java.time.LocalDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  public java.time.LocalDateTime getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(java.time.LocalDateTime updatedTime) {
    this.updatedTime = updatedTime;
  }


  public String getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(String isDeleted) {
    this.isDeleted = isDeleted;
  }

}
