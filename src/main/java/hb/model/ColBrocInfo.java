package hb.model;


public class ColBrocInfo {

  private Long brocInfoId;
  private String gkId;
  private Long groupId;
  private Long taskId;
  private Long assetId;
  private Long contentId;
  private String contentName;
  private Long programId;
  private String productName;
  private java.time.LocalDateTime startTime;
  private java.time.LocalDateTime endTime;
  private String operator;
  private String operatorName;
  private String nodeStatus;
  private java.time.LocalDateTime collectTime;


  public Long getBrocInfoId() {
    return brocInfoId;
  }

  public void setBrocInfoId(Long brocInfoId) {
    this.brocInfoId = brocInfoId;
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


  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }


  public Long getProgramId() {
    return programId;
  }

  public void setProgramId(Long programId) {
    this.programId = programId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
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
