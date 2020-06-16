package com.tatvasoft.dao;

import com.tatvasoft.model.TblEmployee;

public interface TblEmployeeDAO {

	public void listEmployee(TblEmployee tblemp);		
	public Integer addEmployee(TblEmployee  tblemp);
	public void updateEmployee(TblEmployee tblemp);
	public void deleteEmployee(Integer userid);
	public TblEmployee getEmployeedetails(Integer userid);
}
