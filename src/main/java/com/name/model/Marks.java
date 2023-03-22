package com.name.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="springmarks")
public class Marks {
	@Id
private Integer id;
private String  name;
private Integer s1,s2,s3;
private Integer total;
private String grade;
private Double per;
public Marks() {
	super();
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getS1() {
	return s1;
}
public void setS1(Integer s1) {
	this.s1 = s1;
}
public Integer getS2() {
	return s2;
}
public void setS2(Integer s2) {
	this.s2 = s2;
}
public Integer getS3() {
	return s3;
}
public void setS3(Integer s3) {
	this.s3 = s3;
}
public Integer getTotal() {
	return total;
}
public void setTotal(Integer total) {
	this.total = total;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public Double getPer() {
	return per;
}
public void setPer(Double per) {
	this.per = per;
}
@Override
public String toString() {
	return "Marks [id=" + id + ", name=" + name + ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", total=" + total
			+ ", grade=" + grade + ", per=" + per + "]";
}


}
