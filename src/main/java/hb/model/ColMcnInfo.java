package hb.model;


public class ColMcnInfo {

  private Long mcnInfoId;
  private Long showId;
  private String disposeChannel;
  private String applyChannel;
  private String url;
  private java.time.LocalDateTime startTime;
  private java.time.LocalDateTime endTime;
  private String operator;
  private String operatorName;
  private String nodeStatus;
  private java.time.LocalDateTime collectTime;


  public Long getMcnInfoId() {
    return mcnInfoId;
  }

  public void setMcnInfoId(Long mcnInfoId) {
    this.mcnInfoId = mcnInfoId;
  }


  public Long getShowId() {
    return showId;
  }

  public void setShowId(Long showId) {
    this.showId = showId;
  }


  public String getDisposeChannel() {
    return disposeChannel;
  }

  public void setDisposeChannel(String disposeChannel) {
    this.disposeChannel = disposeChannel;
  }


  public String getApplyChannel() {
    return applyChannel;
  }

  public void setApplyChannel(String applyChannel) {
    this.applyChannel = applyChannel;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
