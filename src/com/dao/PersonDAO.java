package com.dao;
import com.model.Person;
public interface PersonDAO {
	public void savePerson(Person person);
	public Person showPerson(Integer id);
}