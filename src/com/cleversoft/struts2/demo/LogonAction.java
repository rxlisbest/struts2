package com.cleversoft.struts2.demo;
import java.util.Map;
import java.util.Date;  
import java.sql.*; 
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.Action;

public class LogonAction implements Action,SessionAware{
	
	private String username;
	private String password;
	private String msg;
	private Map session;
	
	public void setSession(Map session) {
		this.session = session;
    }
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getMsg(){
		return msg;
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}
	
	public String execute() throws Exception {
    	if("roy".equals(this.getUsername()) && "123".equals(this.getPassword())){
    		this.session.put("USER_NAME", "ROY");
    		String url = "jdbc:mysql://localhost:3306/";  
    	   String dbName = "test";  
    	   String driverName = "org.gjt.mm.mysql.Driver";  
    	   String userName = "test";  
    	   String password = "123";  
    	   Connection con=null; 
    	   Statement stmt=null;   
    	   try{
    		   Class.forName(driverName).newInstance();  
		      con=DriverManager.getConnection(url+dbName, userName, password);  
		      stmt=con.createStatement(); 
    	    }
    	   catch(Exception e){  
    		      System.out.println(e.getMessage());  
		    }
    	   String uname=getUsername();  
    	   String pwd=getPassword();  
    	   stmt = con.createStatement();  
    	   int val = stmt.executeUpdate("INSERT INTO t_user (name, password) VALUES ('"+uname+"','"+pwd+"')");
    	   //int val = 1;
    	   //System.out.println(uname);
    	   if(val==0){
    		   return "error";
    	    }
    	   else{
    		   return "success";
    	   }
    	}
    	else{
    		this.setMsg("123");
        	return "error";
    	}
     }
}
