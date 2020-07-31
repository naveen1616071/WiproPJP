package com.wipro.service;

import com.wipro.bean.*;
import java.util.ArrayList;
import java.util.List;

import com.wipro.bean.EmployeeBean;

public class EmployeeService {
	private List<EmployeeBean> listEmp = new ArrayList<>();

	public boolean insertEmployee(EmployeeBean bean) {
		// System.out.println(listEmp);
		return listEmp.add(bean);

	}

	public String insertEmployeeByPosition(EmployeeBean Bean, int position) {

		if (listEmp.size() - 1 > position - 1) {
			listEmp.add(position - 1, Bean);
			return "Inserted Employee at position:" + position;
		} else {
			listEmp.add(Bean);
			return "Inserted Employee at end position" +listEmp.size();
		}
	}

	public List<EmployeeBean> fetchAllEmployees() {
		return listEmp;
	}

	public boolean deleteEmployeeByEmpID(int empID) {
		boolean flag = false;
		for (int i = 0; i < listEmp.size(); i++) {
			if (empID == listEmp.get(i).getEmpID()) {
				listEmp.remove(i);
				flag = true;
			}
		}
		return flag;
	}

	public boolean updateEmployeeByEmpID(EmployeeBean Bean) {

		boolean flag = false;
		for (int i = 0; i < listEmp.size(); i++) {
			if (Bean.getEmpID() == listEmp.get(i).getEmpID()) {
				listEmp.remove(i);
				listEmp.add(i, Bean);
				flag = true;
				break;
			}
		}
		return flag;
	}

}
