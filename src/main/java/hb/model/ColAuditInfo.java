package hb.model;


public class ColAuditInfo {

  private Long auditInfoId;
  private Long groupId;
  private Long taskId;
  private Long mediaId;
  private String auditStatus;
  private String auditSubmitStatus;
  private java.time.LocalDateTime startTime;
  private java.time.LocalDateTime endTime;
  private String operator;
  private String operatorName;
  private String nodeStatus;
  private java.time.LocalDateTime collectTime;


  public Long getAuditInfoId() {
    return auditInfoId;
  }

  public void setAuditInfoId(Long auditInfoId) {
    this.auditInfoId = auditInfoId;
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


  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }


  public String getAuditStatus() {
    return auditStatus;
  }

  public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
  }


  public String getAuditSubmitStatus() {
    return auditSubmitStatus;
  }

  public void setAuditSubmitStatus(String auditSubmitStatus) {
    this.auditSubmitStatus = auditSubmitStatus;
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
