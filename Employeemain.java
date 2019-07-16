package com.cap.lab13.pl;

import java.util.*;
import com.cap.lab13.bean.Employee;
import com.cap.lab13.dao.EmployeerRepository;
import com.cap.lab13.service.EmployeeService;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService es=new EmployeeService();
		List<Employee>elist=EmployeerRepository.getEmployees();
		
		System.out.println("sum of salary of all Employees is:"+es.getSumOfSalary(elist));
		
		System.out.println("================================================");
		System.out.println(" "+"Employees without Department :");
		List<Employee> e1=es.getEmployeeWithOutDepartment(elist);
		for(Employee employee:e1) {
			System.out.println(employee);
		}
		System.out.println();
		System.out.println("================================================");
		System.out.println(" "+"Employees without Manager :");
		List<Employee> e3=es.getEmployeeWithoutManager(elist);
		for(Employee employee:e3) {
			System.out.println(employee);
		}
		System.out.println();
		System.out.println("================================================");
		System.out.println(" "+"Salary Increment details :");
		List<String> e2=es.getSalIncdetails(elist);
		for(String sal:e2) {
			System.out.println(sal);
		}
		System.out.println();
		System.out.println("================================================");
		System.out.println(" "+"Employees List sorted by name :");
		List<Employee> e4=es.sortByName(elist);
		for(Employee employee:e4) {
			System.out.println(employee);
		}
		System.out.println();
		System.out.println("================================================");
		System.out.println(" "+"Employees List sorted by Employee ID :");
		List<Employee> e5=es.sortByEmployeeId(elist);
		for(Employee employee:e5) {
			System.out.println(employee);
		}
		System.out.println();
		System.out.println("================================================");
		System.out.println(" "+"Employees List sorted by Department ID :");
		List<Employee> e6=es.sortByDept(elist);
		for(Employee employee:e6) {
			System.out.println(employee);
		}
		
		
	}

}