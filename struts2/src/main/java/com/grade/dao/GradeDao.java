package com.grade.dao;

import java.util.List;

import com.grade.entity.Grade;


public interface GradeDao {
	
	//查询所有年级信息
	public List<Grade>getAllGrade();
	//查询单条年级信息
	public Grade getGrade(Integer gid);
	//新增年级信息
	public void addGrade(Grade grade);
	//删除年级信息
	public void delGrade(Integer gid);
	//修改年级信息
	public void updateGrade(Grade grade);
}