package hb.model;


import java.time.LocalDateTime;

public class ColVideo {

  private Long produceId;
  private String gkId;
  private Long assetId;
  private String videoId;
  private String videoName;
  private String produceStatus;
  private String produceReason;
  private LocalDateTime produceStartTime;
  private LocalDateTime produceEndTime;
  private String publishStatus;
  private String publishReason;
  private LocalDateTime publishStartTime;
  private LocalDateTime publishEndTime;
  private String operator;
  private String operatorName;
  private String nodeStatus;
  private LocalDateTime collectTime;


  public Long getProduceId() {
    return produceId;
  }

  public void setProduceId(Long produceId) {
    this.produceId = produceId;
  }


  public String getGkId() {
    return gkId;
  }

  public void setGkId(String gkId) {
    this.gkId = gkId;
  }


  public Long getAssetId() {
    return assetId;
  }

  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public String getVideoName() {
    return videoName;
  }

  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }


  public String getProduceStatus() {
    return produceStatus;
  }

  public void setProduceStatus(String produceStatus) {
    this.produceStatus = produceStatus;
  }


  public String getProduceReason() {
    return produceReason;
  }

  public void setProduceReason(String produceReason) {
    this.produceReason = produceReason;
  }


  public LocalDateTime getProduceStartTime() {
    return produceStartTime;
  }

  public void setProduceStartTime(LocalDateTime produceStartTime) {
    this.produceStartTime = produceStartTime;
  }


  public LocalDateTime getProduceEndTime() {
    return produceEndTime;
  }

  public void setProduceEndTime(LocalDateTime produceEndTime) {
    this.produceEndTime = produceEndTime;
  }


  public String getPublishStatus() {
    return publishStatus;
  }

  public void setPublishStatus(String publishStatus) {
    this.publishStatus = publishStatus;
  }


  public String getPublishReason() {
    return publishReason;
  }

  public void setPublishReason(String publishReason) {
    this.publishReason = publishReason;
  }


  public LocalDateTime getPublishStartTime() {
    return publishStartTime;
  }

  public void setPublishStartTime(LocalDateTime publishStartTime) {
    this.publishStartTime = publishStartTime;
  }


  public LocalDateTime getPublishEndTime() {
    return publishEndTime;
  }

  public void setPublishEndTime(LocalDateTime publishEndTime) {
    this.publishEndTime = publishEndTime;
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


  public LocalDateTime getCollectTime() {
    return collectTime;
  }

  public void setCollectTime(LocalDateTime collectTime) {
    this.collectTime = collectTime;
  }

}
