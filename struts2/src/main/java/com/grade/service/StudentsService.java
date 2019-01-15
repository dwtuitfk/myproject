package com.grade.service;

import java.util.List;

import com.grade.entity.Students;

public interface StudentsService {
	
	//查询所有学生信息
	public List<Students>getAllStudents();
	//查询单条学生信息
	public Students getStudents(Integer xh);
	//新增学生信息
	public void addStudents(Students students);
	//删除学生信息
	public void delStudents(Integer xh);
	//修改学生信息
	public void updateStudents(Students students);

}