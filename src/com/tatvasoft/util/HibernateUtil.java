package com.tatvasoft.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {

	private static SessionFactory sessionfactory = buildsessionfactory();

	private static SessionFactory buildsessionfactory(){

		try{
			return new Configuration().configure("/persistance/hibernate.cfg.xml").buildSessionFactory();
		}
		catch(Throwable hex){
			System.err.println("Initial SessionFactory creation failed." + hex);
			throw new ExceptionInInitializerError(hex);			
		}

	}

	public  static SessionFactory getSessionFactory() {

		return sessionfactory;
	}


}
