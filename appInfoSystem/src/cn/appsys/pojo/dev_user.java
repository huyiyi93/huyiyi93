package cn.appsys.pojo;

import java.util.Date;

//�������û���
public class dev_user {
private int id;
private String devCode;
private String devName;
private String devPassword;
private String devEmail;
private int createBy;
private Date creationDate;
private int modifyBy;
private Date modifyDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDevCode() {
	return devCode;
}
public void setDevCode(String devCode) {
	this.devCode = devCode;
}
public String getDevName() {
	return devName;
}
public void setDevName(String devName) {
	this.devName = devName;
}
public String getDevPassword() {
	return devPassword;
}
public void setDevPassword(String devPassword) {
	this.devPassword = devPassword;
}
public String getDevEmail() {
	return devEmail;
}
public void setDevEmail(String devEmail) {
	this.devEmail = devEmail;
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

}
