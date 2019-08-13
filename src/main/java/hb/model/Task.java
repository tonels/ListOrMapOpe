package hb.model;


public class Task {

  private Long taskId;
  private Long groupId;
  private String name;
  private String description;
  private String taskStatus;
  private String releaseStatus;
  private java.time.LocalDateTime plannedStartTime;
  private java.time.LocalDateTime plannedEndTime;
  private java.time.LocalDateTime actualStartTime;
  private java.time.LocalDateTime actualEndTime;
  private String createBy;
  private java.time.LocalDateTime createTime;
  private String updateBy;
  private java.time.LocalDateTime updateTime;
  private String isDelete;


  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }


  public String getReleaseStatus() {
    return releaseStatus;
  }

  public void setReleaseStatus(String releaseStatus) {
    this.releaseStatus = releaseStatus;
  }


  public java.time.LocalDateTime getPlannedStartTime() {
    return plannedStartTime;
  }

  public void setPlannedStartTime(java.time.LocalDateTime plannedStartTime) {
    this.plannedStartTime = plannedStartTime;
  }


  public java.time.LocalDateTime getPlannedEndTime() {
    return plannedEndTime;
  }

  public void setPlannedEndTime(java.time.LocalDateTime plannedEndTime) {
    this.plannedEndTime = plannedEndTime;
  }


  public java.time.LocalDateTime getActualStartTime() {
    return actualStartTime;
  }

  public void setActualStartTime(java.time.LocalDateTime actualStartTime) {
    this.actualStartTime = actualStartTime;
  }


  public java.time.LocalDateTime getActualEndTime() {
    return actualEndTime;
  }

  public void setActualEndTime(java.time.LocalDateTime actualEndTime) {
    this.actualEndTime = actualEndTime;
  }


  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public java.time.LocalDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.time.LocalDateTime createTime) {
    this.createTime = createTime;
  }


  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }


  public java.time.LocalDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.time.LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }

}
