package com.tatvasoft.controller;

import com.tatvasoft.model.TblEmployee;

public interface TblEmployeeController {

	public Integer addEmployee(TblEmployee tblemp);
	public  void updateEmployee(TblEmployee tblemp);
	public  void deleteEmployee(Integer id);
	
}
