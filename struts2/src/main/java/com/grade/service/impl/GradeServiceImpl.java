package com.grade.service.impl;

import java.util.List;

import com.grade.dao.GradeDao;
import com.grade.entity.Grade;
import com.grade.service.GradeService;

public class GradeServiceImpl implements GradeService {
   private GradeDao gradeDao;
   
	public GradeDao getGradeDao() {
	return gradeDao;
}

public void setGradeDao(GradeDao gradeDao) {
	this.gradeDao = gradeDao;
}

	@Override
	public List<Grade> getAllGrade() {
		// 查询所有年级信息
		return gradeDao.getAllGrade();
	}

	@Override
	public Grade getGrade(Integer gid) {
		// 查询单条年级信息
		return gradeDao.getGrade(gid);
	}

	@Override
	public void addGrade(Grade grade) {
		// 添加年级信息
		gradeDao.addGrade(grade);
	}

	@Override
	public void delGrade(Integer gid) {
		// 删除年级信息
		gradeDao.delGrade(gid);
	}

	@Override
	public void updateGrade(Grade grade) {
		// 修改年级信息
		gradeDao.updateGrade(grade);
	}



}
