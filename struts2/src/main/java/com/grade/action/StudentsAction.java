package com.grade.action;


import java.text.DecimalFormat;
import java.util.List;

import com.grade.entity.Students;
import com.grade.service.StudentsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



	//创建StudentsAction(action类)继承ActionSupport接口
	public class StudentsAction extends ActionSupport {
	    
	    private static final long serialVersionUID = 1L;
	    
	    //声明service，但不给它创建具体的实现类的实例，
	    private StudentsService is = null;
	    //添加set()方法
	    public void setIs(StudentsService is) {
	        this.is = is;
	    }
	    
	    //编写execute()方法
	    public String execute() {
	        
	        //获取StudentsService实例，调用getAllStudents()方法
	        //将结果保存到List集合里
	        List<Students> list = is.getAllStudents();
	        
	        //将查询出来的结构集打印到控制台
	        System.out.println("结果集："+list.size());
	        
	        //获取Context上下文对象
	        ActionContext ac = ActionContext.getContext();
	        //将list集合添加到上下文对象里
	        ac.put("list", list);
	        
	        //返回一个字符串
	        return "success";
	    }
	    
	    //金额格式转换
	    public String formatDouble(double s){
	        DecimalFormat fmat=new DecimalFormat("\u00A4##.0"); 
	        return fmat.format(s);
	    }
	    
	}
