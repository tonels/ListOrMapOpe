package hb.model;


public class OperationalLog {

  private Long id;
  private Long operationType;
  private String operationService;
  private String sendParam;
  private String responseCode;
  private String responseResult;
  private String callbackResult;
  private String createdBy;
  private java.time.LocalDateTime createdTime;
  private String isDeleted;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getOperationType() {
    return operationType;
  }

  public void setOperationType(Long operationType) {
    this.operationType = operationType;
  }


  public String getOperationService() {
    return operationService;
  }

  public void setOperationService(String operationService) {
    this.operationService = operationService;
  }


  public String getSendParam() {
    return sendParam;
  }

  public void setSendParam(String sendParam) {
    this.sendParam = sendParam;
  }


  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }


  public String getResponseResult() {
    return responseResult;
  }

  public void setResponseResult(String responseResult) {
    this.responseResult = responseResult;
  }


  public String getCallbackResult() {
    return callbackResult;
  }

  public void setCallbackResult(String callbackResult) {
    this.callbackResult = callbackResult;
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


  public String getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(String isDeleted) {
    this.isDeleted = isDeleted;
  }

}
