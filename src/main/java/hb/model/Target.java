package hb.model;


public class Target {

  private Long targetId;
  private String description;
  private String processingMethod;
  private String createdBy;
  private java.time.LocalDateTime createdTime;
  private String updatedBy;
  private java.time.LocalDateTime updatedTime;
  private String isDeleted;


  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getProcessingMethod() {
    return processingMethod;
  }

  public void setProcessingMethod(String processingMethod) {
    this.processingMethod = processingMethod;
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
