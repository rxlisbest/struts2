package com.cleversoft.struts2.demo;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.interceptor.SessionAware;

public class LoginAction implements Action{
	public String execute() throws Exception {
		//String msg = session.get("USER_NAME");
    	return "success";
     }
}
