package com.dao.impl;

import org.hibernate.Transaction;
import com.dao.PersonDAO;
import com.model.Person;
import com.util.HibernateUtil;

public class PersonDAOImpl implements PersonDAO {

	@Override
	public void savePerson(Person person) {
		//开启session,与HttpSession完全没有任何关系，相当于一个数据库连接对象
		org.hibernate.Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		//开启事务
		try {
			//插入
			session.save(person);
			tx.commit();
		} catch (Exception ex) {
			if (null != tx) {
				tx.rollback();
				//失败回滚
			}

		} finally {
			//关闭session
			HibernateUtil.close(session);
		}

	}

	@Override
	public Person showPerson(Integer id) {
		
		org.hibernate.Session session = HibernateUtil.openSession();
		//get方法取出对象
		//Transaction tx = session.beginTransaction();        
		Person person = (Person) session.get(Person.class, id);  
      //tx.commit();
      //HibernateUtil.close(session);
		return person;
	}
}