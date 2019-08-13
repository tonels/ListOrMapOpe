package hb.model;


public class GroupNode {

  private Long nodeId;
  private String nodeType;
  private String nodeName;
  private String description;
  private String urlName;
  private String nodeUrl;
  private String createdBy;
  private java.time.LocalDateTime createdTime;
  private String updatedBy;
  private java.time.LocalDateTime updatedTime;


  public Long getNodeId() {
    return nodeId;
  }

  public void setNodeId(Long nodeId) {
    this.nodeId = nodeId;
  }


  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }


  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getUrlName() {
    return urlName;
  }

  public void setUrlName(String urlName) {
    this.urlName = urlName;
  }


  public String getNodeUrl() {
    return nodeUrl;
  }

  public void setNodeUrl(String nodeUrl) {
    this.nodeUrl = nodeUrl;
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

}
