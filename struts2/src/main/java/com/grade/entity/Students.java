package com.grade.entity;
// Generated 2019-1-10 21:50:43 by Hibernate Tools 3.5.0.Final

import java.util.Date;

/**
 * Students generated by hbm2java
 */
public class Students implements java.io.Serializable {

	private int xh;
	private Grade grade;
	private String name;
	private Integer age;
	private String sex;
	private Date birthday;
	private String address;
	private String tel;
	private Byte state;

	public Students() {
	}

	public Students(int xh, String name) {
		this.xh = xh;
		this.name = name;
	}

	public Students(int xh, Grade grade, String name, Integer age, String sex, Date birthday, String address,
			String tel, Byte state) {
		this.xh = xh;
		this.grade = grade;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.tel = tel;
		this.state = state;
	}

	public int getXh() {
		return this.xh;
	}

	public void setXh(int xh) {
		this.xh = xh;
	}

	public Grade getGrade() {
		return this.grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Byte getState() {
		return this.state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

}
