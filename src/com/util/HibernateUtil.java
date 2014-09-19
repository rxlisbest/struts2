package com.util;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static Session openSession()
	{
		sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session;
	}
	public static void close(Session session)
	{
		if(session!=null)
		{
			session.close();
		}
	}
}