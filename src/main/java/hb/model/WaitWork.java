package hb.model;


public class WaitWork {

  private Long waitId;
  private Long groupId;
  private Long assetId;
  private String assetName;
  private String videoName;
  private Long nodeId;
  private Long bizId;
  private String bizStatus;
  private Long userId;


  public Long getWaitId() {
    return waitId;
  }

  public void setWaitId(Long waitId) {
    this.waitId = waitId;
  }


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public Long getAssetId() {
    return assetId;
  }

  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public String getVideoName() {
    return videoName;
  }

  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }


  public Long getNodeId() {
    return nodeId;
  }

  public void setNodeId(Long nodeId) {
    this.nodeId = nodeId;
  }


  public Long getBizId() {
    return bizId;
  }

  public void setBizId(Long bizId) {
    this.bizId = bizId;
  }


  public String getBizStatus() {
    return bizStatus;
  }

  public void setBizStatus(String bizStatus) {
    this.bizStatus = bizStatus;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

}
