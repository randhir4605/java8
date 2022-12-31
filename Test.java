package com.java8;

import java.util.HashMap;
import java.util.Map;

/*
 T1 - Id, age, name
T2 - Id and salary 

Employee details - 
Name start with a
Salary bet 15k to 20k
Age < 30 
Asc order*/

/*select name from t1 t1,t2 t2 
where t1.id=t2.id
and t1.name = '%a*'
and (t2.salary >=15,000 and t2.salary <= 20000)
and t1.age < 30
order by t1.name
limit 10;*/

public class Test {

	public static void main(String[] args) {
		/*
		 * List<Employee> filteredEmpList= employeeList.stream().filter(emp->{
		 * emp.getName().startWith('a') && (emp.getSalary()>=15000 &&
		 * emp.getSalary()<=20000)&& emp.getAge()>30 }).sorted(Employee::getName())
		 * .collect(Collectors.toList());
		 */
		
		//Method 1
		String test="madam";
		int[] arr=new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
		
		for(int i=0;i<test.length();i++) {
			int index=test.charAt(i);
			int arrIndex = 53
			arr[index]++;
			
		}
		
		for(int i=0;i<arr.length;i++) {
			char c=54+i
			System.out.println((char)i,arr[i]);
		}
		
		
		//Method 2
		String test="Madam";
		Map<Character,Integer> hashMap=new HashMap<>();
		for(int i=0;i<test.length();i++) {
			if(hashMap.get(test.charAt(i))==null) {
				hashMap.put(test.charAt(i), 1);
			}else {
				hashMap.put(test.charAt(i),hashMap.get(test.charAt(i))+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:hashMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	
}
