package cn.appsys.pojo;

import java.util.Date;

//APP版本信息表
public class app_version {
private int id;
private int appId;
private String versionNo;
private String versionInfo;
private int publishStatus;
private String downloadLink;
private double versionSize;
private int createBy;
private Date creationDate;
private int modifyBy;
private Date modifyDate;
private String apkLocPath;
private String apkFileName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAppId() {
	return appId;
}
public void setAppId(int appId) {
	this.appId = appId;
}
public String getVersionNo() {
	return versionNo;
}
public void setVersionNo(String versionNo) {
	this.versionNo = versionNo;
}
public String getVersionInfo() {
	return versionInfo;
}
public void setVersionInfo(String versionInfo) {
	this.versionInfo = versionInfo;
}
public int getPublishStatus() {
	return publishStatus;
}
public void setPublishStatus(int publishStatus) {
	this.publishStatus = publishStatus;
}
public String getDownloadLink() {
	return downloadLink;
}
public void setDownloadLink(String downloadLink) {
	this.downloadLink = downloadLink;
}
public double getVersionSize() {
	return versionSize;
}
public void setVersionSize(double versionSize) {
	this.versionSize = versionSize;
}
public int getCreateBy() {
	return createBy;
}
public void setCreateBy(int createBy) {
	this.createBy = createBy;
}
public Date getCreationDate() {
	return creationDate;
}
public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}
public int getModifyBy() {
	return modifyBy;
}
public void setModifyBy(int modifyBy) {
	this.modifyBy = modifyBy;
}
public Date getModifyDate() {
	return modifyDate;
}
public void setModifyDate(Date modifyDate) {
	this.modifyDate = modifyDate;
}
public String getApkLocPath() {
	return apkLocPath;
}
public void setApkLocPath(String apkLocPath) {
	this.apkLocPath = apkLocPath;
}
public String getApkFileName() {
	return apkFileName;
}
public void setApkFileName(String apkFileName) {
	this.apkFileName = apkFileName;
}

}
