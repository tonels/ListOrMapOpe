package hb.model;


public class SpOperateLog {

  private Long id;
  private Long recordId;
  private String module;
  private String business;
  private String opType;
  private Long userId;
  private String userName;
  private String params;
  private java.time.LocalDateTime createTime;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getRecordId() {
    return recordId;
  }

  public void setRecordId(Long recordId) {
    this.recordId = recordId;
  }


  public String getModule() {
    return module;
  }

  public void setModule(String module) {
    this.module = module;
  }


  public String getBusiness() {
    return business;
  }

  public void setBusiness(String business) {
    this.business = business;
  }


  public String getOpType() {
    return opType;
  }

  public void setOpType(String opType) {
    this.opType = opType;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getParams() {
    return params;
  }

  public void setParams(String params) {
    this.params = params;
  }


  public java.time.LocalDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.time.LocalDateTime createTime) {
    this.createTime = createTime;
  }

}
