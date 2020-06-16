package com.tatvasoft.controller;

import com.tatvasoft.dao.TblEmployeeDAO;
import com.tatvasoft.dao.TblEmployeeDAOImpl;
import com.tatvasoft.model.TblEmployee;

public class TblEmployeeControllerImpl implements TblEmployeeController {
	
	TblEmployeeDAOImpl tblemployeedao = new TblEmployeeDAOImpl();
	
//	TblEmployeeDAO tblemployeedao ;
//	public void setEmployeedao(TblEmployeeDAO tblempdao){
//		this.tblemployeedao = tblempdao;
//	}
	
	@Override
	public Integer addEmployee(TblEmployee tblemp) {
		
		return tblemployeedao.addEmployee(tblemp);
	}

	@Override
	public void updateEmployee(TblEmployee tblemp) {
		tblemployeedao.updateEmployee(tblemp);
		
	}

	@Override
	public void deleteEmployee(Integer id) {
		tblemployeedao.deleteEmployee(id);
	}

}
