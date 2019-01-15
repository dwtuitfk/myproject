package com.grade.dao.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.grade.dao.GradeDao;
import com.grade.entity.Grade;

public class GradeDaoImpl extends HibernateDaoSupport implements GradeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Grade> getAllGrade() {
		//查询
		String hql ="from Grade";
		return (List<Grade>)this.getHibernateTemplate().find(hql);
	}


	@Override
	public Grade getGrade(Integer gid) {
		//查询单条年级信息
		return this.getHibernateTemplate().get(Grade.class, gid);
	}


	@Override
	public void addGrade(Grade grade) {
		// 添加年级信息
		this.getHibernateTemplate().save(grade);
	}


	@Override
	public void delGrade(Integer gid) {
		// 删除年级信息
		Grade grade = (Grade)this.getHibernateTemplate().load(Grade.class, gid);
		this.getHibernateTemplate().delete(grade);
	}


	@Override
	public void updateGrade(Grade grade) {
		// 修改年级信息
		this.getHibernateTemplate().update(grade);
	}

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		GradeDao gradeDao=(GradeDao)ac.getBean("gradeDao");
		System.out.println(gradeDao.getAllGrade().size());
	}

}
