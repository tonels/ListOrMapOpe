package hb.model;


public class Member {

  private Long memberId;
  private String fromSystem;
  private Long userId;
  private String account;
  private String username;
  private String createdBy;
  private java.time.LocalDateTime createdTime;
  private String updatedBy;
  private java.time.LocalDateTime updatedTime;
  private String isDeleted;


  public Long getMemberId() {
    return memberId;
  }

  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }


  public String getFromSystem() {
    return fromSystem;
  }

  public void setFromSystem(String fromSystem) {
    this.fromSystem = fromSystem;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
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
