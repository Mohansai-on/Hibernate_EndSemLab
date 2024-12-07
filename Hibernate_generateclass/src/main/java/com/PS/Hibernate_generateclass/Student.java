package com.PS.Hibernate_generateclass;

import jakarta.persistence.*;
@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

int sid;
String sname;
String sdept;
long sphone;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSdept() {
	return sdept;
}
public void setSdept(String sdept) {
	this.sdept = sdept;
}
public long getSphone() {
	return sphone;
}
public void setSphone(long sphone) {
	this.sphone = sphone;
}





}
