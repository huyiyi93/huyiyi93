package cn.appsys.pojo;

import java.util.Date;
//��̨�û���
public class backend_user {
private int id;
private String userCode;
private String userName;
private int userType;
private int createBy;
private Date creationDate;
private int modifyBy;
private Date modifyDate;
private String userPassword;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserCode() {
	return userCode;
}
public void setUserCode(String userCode) {
	this.userCode = userCode;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getUserType() {
	return userType;
}
public void setUserType(int userType) {
	this.userType = userType;
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
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}

}
