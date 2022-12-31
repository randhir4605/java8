package com.java8;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public 
	
	select e1.emp_name as 'Employee Name',e2.emp_name as 'Manager Name' from Employee e1, Employee e2 where e1.empId = e2.managerId

	Select e.name e.city from Employee e
	group by e.city
	having e.city='Bengaluru';
	
	select * from employee 
}
