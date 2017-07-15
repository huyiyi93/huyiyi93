package cn.appsys.pojo;

import java.util.Date;

//∑÷¿‡±Ì
public class appCategory {
private int id;
private String categoryCode;
private String categoryName;
private int parentId;
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
public String getCategoryCode() {
	return categoryCode;
}
public void setCategoryCode(String categoryCode) {
	this.categoryCode = categoryCode;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public int getParentId() {
	return parentId;
}
public void setParentId(int parentId) {
	this.parentId = parentId;
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
