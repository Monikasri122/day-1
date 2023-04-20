package com.example.day1;

public class json1 {
private int eid;
public json1(int eid, String name, int age) {
	super();
	this.eid = eid;
	this.name = name;
	this.age = age;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
private String name;
private int age;

}
