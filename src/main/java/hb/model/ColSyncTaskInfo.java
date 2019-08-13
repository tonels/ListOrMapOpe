package hb.model;


public class ColSyncTaskInfo {

  private Long syncTaskInfoId;
  private String gkId;
  private Long groupId;
  private Long taskId;
  private Long assetId;
  private Long contentId;
  private java.time.LocalDateTime startTime;
  private java.time.LocalDateTime endTime;
  private String operator;
  private String operatorName;
  private String syncTaskStatus;
  private java.time.LocalDateTime syncTaskEndTime;


  public Long getSyncTaskInfoId() {
    return syncTaskInfoId;
  }

  public void setSyncTaskInfoId(Long syncTaskInfoId) {
    this.syncTaskInfoId = syncTaskInfoId;
  }


  public String getGkId() {
    return gkId;
  }

  public void setGkId(String gkId) {
    this.gkId = gkId;
  }


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }


  public Long getAssetId() {
    return assetId;
  }

  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public Long getContentId() {
    return contentId;
  }

  public void setContentId(Long contentId) {
    this.contentId = contentId;
  }


  public java.time.LocalDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(java.time.LocalDateTime startTime) {
    this.startTime = startTime;
  }


  public java.time.LocalDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(java.time.LocalDateTime endTime) {
    this.endTime = endTime;
  }


  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  public String getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
  }


  public String getSyncTaskStatus() {
    return syncTaskStatus;
  }

  public void setSyncTaskStatus(String syncTaskStatus) {
    this.syncTaskStatus = syncTaskStatus;
  }


  public java.time.LocalDateTime getSyncTaskEndTime() {
    return syncTaskEndTime;
  }

  public void setSyncTaskEndTime(java.time.LocalDateTime syncTaskEndTime) {
    this.syncTaskEndTime = syncTaskEndTime;
  }

}
