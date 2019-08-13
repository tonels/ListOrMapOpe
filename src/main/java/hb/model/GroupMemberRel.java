package hb.model;


public class GroupMemberRel {

  private Long groupMemberId;
  private Long groupId;
  private Long memberId;
  private String memberName;
  private String operRole;
  private String memberPost;
  private String createdBy;
  private java.time.LocalDateTime createdTime;
  private String updatedBy;
  private java.time.LocalDateTime updatedTime;
  private String isDeleted;


  public Long getGroupMemberId() {
    return groupMemberId;
  }

  public void setGroupMemberId(Long groupMemberId) {
    this.groupMemberId = groupMemberId;
  }


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public Long getMemberId() {
    return memberId;
  }

  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }


  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }


  public String getOperRole() {
    return operRole;
  }

  public void setOperRole(String operRole) {
    this.operRole = operRole;
  }


  public String getMemberPost() {
    return memberPost;
  }

  public void setMemberPost(String memberPost) {
    this.memberPost = memberPost;
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
