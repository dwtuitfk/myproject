package com.grade.dao.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.grade.dao.StudentsDao;
import com.grade.entity.Students;

public class StudentsDaoImpl extends HibernateDaoSupport implements StudentsDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Students> getAllStudents() {
		// 查询所有学生信息
		String hql ="select s from Students s left join fetch s.grade";
		return (List<Students>)this.getHibernateTemplate().find(hql);
	}

	@Override
	public Students getStudents(Integer xh) {
		// 查询单条学生信息
		return this.getHibernateTemplate().get(Students.class, xh);
	}

	@Override
	public void addStudents(Students students) {
		// 添加学生信息
		this.getHibernateTemplate().save(students);
	}

	@Override
	public void delStudents(Integer xh) {
		// 删除学生信息
		Students students = (Students)this.getHibernateTemplate().load(Students.class, xh);
		this.getHibernateTemplate().delete(students);
	}

	@Override
	public void updateStudents(Students students) {
		// 修改学生信息
		this.getHibernateTemplate().update(students);
	
	}
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentsDao studentsDao=(StudentsDao)ct.getBean("studentsDao"); 
		System.out.println(studentsDao.getAllStudents().size());
		System.out.println(studentsDao.getStudents(56).getName());
	}
}
