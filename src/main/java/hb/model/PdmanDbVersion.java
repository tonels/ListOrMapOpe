package hb.model;


public class PdmanDbVersion {

  private String dbVersion;
  private String versionDesc;
  private String createdTime;


  public String getDbVersion() {
    return dbVersion;
  }

  public void setDbVersion(String dbVersion) {
    this.dbVersion = dbVersion;
  }


  public String getVersionDesc() {
    return versionDesc;
  }

  public void setVersionDesc(String versionDesc) {
    this.versionDesc = versionDesc;
  }


  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

}
