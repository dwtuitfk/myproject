package com.grade.service.impl;

import java.util.List;

import com.grade.dao.StudentsDao;
import com.grade.entity.Students;
import com.grade.service.StudentsService;

public class StudentsServiceImpl implements StudentsService {

	private StudentsDao studentsDao;
	
	public StudentsDao getStudentsDao() {
		return studentsDao;
	}

	public void setStudentsDao(StudentsDao studentsDao) {
		this.studentsDao = studentsDao;
	}

	@Override
	public List<Students> getAllStudents() {
		//查询所有学生信息
		return studentsDao.getAllStudents();
	}

	@Override
	public Students getStudents(Integer xh) {
		// 查询单条学生信息
		return studentsDao.getStudents(xh);
	}

	@Override
	public void addStudents(Students students) {
		// 添加学生信息
		studentsDao.addStudents(students);
		
	}

	@Override
	public void delStudents(Integer xh) {
		// 删除学生信息
		studentsDao.delStudents(xh);
	}

	@Override
	public void updateStudents(Students students) {
		// 修改学生信息
		studentsDao.updateStudents(students);
	}



	
}
