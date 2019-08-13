package hb.model;


public class GroupGk {

  private Long groupGkId;
  private Long groupId;
  private String gkId;
  private String pid;
  private String description;
  private String createdBy;
  private java.time.LocalDateTime createdTime;
  private String updatedBy;
  private java.time.LocalDateTime updatedTime;
  private String isDeleted;


  public Long getGroupGkId() {
    return groupGkId;
  }

  public void setGroupGkId(Long groupGkId) {
    this.groupGkId = groupGkId;
  }


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public String getGkId() {
    return gkId;
  }

  public void setGkId(String gkId) {
    this.gkId = gkId;
  }


  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
