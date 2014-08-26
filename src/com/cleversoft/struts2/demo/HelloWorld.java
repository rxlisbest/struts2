package com.cleversoft.struts2.demo;

import com.opensymphony.xwork2.Action;

public class HelloWorld implements Action
{
    public String execute() throws Exception {
    return "success";
    }
}