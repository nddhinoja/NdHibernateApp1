package com.tatvasoft.dao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tatvasoft.model.TblEmployee;

public class TblEmployeeDAOImpl implements TblEmployeeDAO {

private static SessionFactory sessionfactory = new Configuration().configure("/persistance/hibernate.cfg.xml").buildSessionFactory();
	public  Integer  addEmployee(TblEmployee tblemployee) {
		Session session = sessionfactory.openSession();
		Transaction tranc = null;
		try{
			tranc = session.beginTransaction();
			
			session.save(tblemployee);
			tranc.commit();

			return 1;
		}
		catch(HibernateException ex){
			if(tranc != null){
				tranc.rollback();
				System.out.println("Error:"+ex);
			}
			return 0;
		}

		finally{
			session.close();
		}

	}

	public void deleteEmployee(Integer userid){
		
		
		Session session = sessionfactory.openSession();
		Transaction tranc = null;
		try{
			tranc = session.beginTransaction();
			TblEmployee tblemployee1 = (TblEmployee) session.get(TblEmployee.class, userid);
			session.delete(tblemployee1);
			tranc.commit();
		}

		catch(HibernateException ex){

			System.out.println("Exception genereted" + ex);
		}
		finally{

			session.close();	
		}

	}

	public void updateEmployee(TblEmployee tblemp1){

		Session session = sessionfactory.openSession();
		Transaction tranc = null;
		try{
			tranc = session.beginTransaction();
			TblEmployee tblemployee = (TblEmployee) session.get(TblEmployee.class, tblemp1.getUserid());
			tblemployee.setUsername(tblemp1.getUsername());
			tblemployee.setFirstname(tblemp1.getFirstname());
			tblemployee.setLastname(tblemp1.getLastname());
			tblemployee.setPassword(tblemp1.getPassword());
			tblemployee.setDateofbirth(tblemp1.getDateofbirth());
			tblemployee.setEmailaddress(tblemp1.getEmailaddress());
			tblemployee.setMobilenumber(tblemp1.getMobilenumber());
			tblemployee.setActive(tblemp1.getActive());
			session.saveOrUpdate(tblemployee);
			tranc.commit();
			
		}
		catch(HibernateException hex){

			if(tranc!=null)
				tranc.rollback();
			System.out.println("Exception genereted" + hex);
		}
		finally{
			session.close();
		}
	}
	
	@Override
	public void listEmployee(TblEmployee tblemp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblEmployee getEmployeedetails(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
