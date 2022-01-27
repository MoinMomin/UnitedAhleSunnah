package com.UnitedAhleSunnah.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int CatId;
	
private String name;
private Date date;
private String createdBy;
private String updatedBy;
private boolean isActive;
public int getCatId() {
	return CatId;
}
public void setCatId(int catId) {
	CatId = catId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getUpdatedBy() {
	return updatedBy;
}
public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
@Override
public String toString() {
	return "Category [CatId=" + CatId + ", name=" + name + ", date=" + date + ", createdBy=" + createdBy
			+ ", updatedBy=" + updatedBy + ", isActive=" + isActive + "]";
}

}
