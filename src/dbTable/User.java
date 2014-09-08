package dbTable;

import java.io.Serializable;

public class User implements Serializable {
 
 private int user_id;
 private String user_name;
 private String user_password;
 private int user_type;
 
 public User(){
 }
 
 public User(int user_id,String user_name, String user_password, int user_type){
  this.user_id=user_id;
  this.user_name=user_name;
  this.user_password=user_password;
  this.user_type=user_type;
 }
 
 public int getUser_id(){
  return this.user_id;
 }
 public void setUser_id(int user_id){
  this.user_id=user_id;
 }
 
 public String getUser_name(){
  return this.user_name;
 }
 public void setUser_name(String user_name){
  this.user_name=user_name;
 }
 
 public String getUser_password(){
  return this.user_password;
 }
 public void setUser_password(String user_password){
  this.user_password=user_password;
 }
 
 public int getUser_type(){
  return this.user_type;
 }
 public void setUser_type(int user_type){
  this.user_type=user_type;
 }
 
}