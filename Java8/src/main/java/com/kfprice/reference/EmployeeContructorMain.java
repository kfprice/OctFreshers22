package com.kfprice.reference;

public class EmployeeContructorMain {

	public static void main(String[] args) {

		EmployeeInterface employeeInterface = Employee::new;
		Employee employee = employeeInterface.getEmployee(20, "HCL ");
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getEmpName());

	}

}
