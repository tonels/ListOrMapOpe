package hb.model;


public class ColLocationInfo {

  private Long locationId;
  private String path;
  private String pathInfo;
  private Long pid;
  private Long assetId;
  private java.time.LocalDateTime executeTime;


  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public String getPathInfo() {
    return pathInfo;
  }

  public void setPathInfo(String pathInfo) {
    this.pathInfo = pathInfo;
  }


  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }


  public Long getAssetId() {
    return assetId;
  }

  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public java.time.LocalDateTime getExecuteTime() {
    return executeTime;
  }

  public void setExecuteTime(java.time.LocalDateTime executeTime) {
    this.executeTime = executeTime;
  }

}
