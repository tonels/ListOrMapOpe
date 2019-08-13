package hb.model;


public class ColSyncInfo {

  private Long syncInfoId;
  private String gkId;
  private Long groupId;
  private Long taskId;
  private Long assetId;
  private String syncStatus;
  private String syncTaskStatus;
  private java.time.LocalDateTime startTime;
  private java.time.LocalDateTime endTime;
  private String operator;
  private String operatorName;
  private String nodeStatus;
  private java.time.LocalDateTime collectTime;


  public Long getSyncInfoId() {
    return syncInfoId;
  }

  public void setSyncInfoId(Long syncInfoId) {
    this.syncInfoId = syncInfoId;
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


  public String getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
  }


  public String getSyncTaskStatus() {
    return syncTaskStatus;
  }

  public void setSyncTaskStatus(String syncTaskStatus) {
    this.syncTaskStatus = syncTaskStatus;
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


  public String getNodeStatus() {
    return nodeStatus;
  }

  public void setNodeStatus(String nodeStatus) {
    this.nodeStatus = nodeStatus;
  }


  public java.time.LocalDateTime getCollectTime() {
    return collectTime;
  }

  public void setCollectTime(java.time.LocalDateTime collectTime) {
    this.collectTime = collectTime;
  }

}
