package com.action;

import org.apache.struts2.ServletActionContext;

import com.dao.PersonDAO;
import com.dao.impl.PersonDAOImpl;
import com.model.Person;
import com.opensymphony.xwork2.ActionSupport;
import com.util.HibernateUtil;

public class PersonAction extends ActionSupport {
	
	public String showPerson() throws Exception{
		PersonDAO personDAO=new PersonDAOImpl();
		Integer id=1;
		//System.out.println(111);
		Person person=personDAO.showPerson(id);
		ServletActionContext.getRequest().setAttribute("person", person);
		return SUCCESS;
	}
}