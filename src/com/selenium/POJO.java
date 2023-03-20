package com.selenium;

public class POJO {
	
	private String empName;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	private int empId;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public static void main(String[] args) {
		
		POJO obj = new POJO();
		
		obj.setEmpName("Victor");
		String employeeName = obj.getEmpName();
		System.out.println("Employee Name: "+employeeName);
		
		obj.setEmpId(12345);
		int employeeId = obj.getEmpId();
		System.out.println("Employee Id: "+employeeId);		
		
	}	

}
