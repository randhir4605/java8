package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.util.comparator.Comparators;

public class Test2
	{
	    public class Product
	    {
	        public String Id;
	        public String Name;
	        public String Category;
	        public double Price;
	        public int CountOfSoldItems;
			public String getId() {
				return Id;
			}
			public void setId(String id) {
				Id = id;
			}
			public String getName() {
				return Name;
			}
			public void setName(String name) {
				Name = name;
			}
			public String getCategory() {
				return Category;
			}
			public void setCategory(String category) {
				Category = category;
			}
			public double getPrice() {
				return Price;
			}
			public void setPrice(double price) {
				Price = price;
			}
			public int getCountOfSoldItems() {
				return CountOfSoldItems;
			}
			public void setCountOfSoldItems(int countOfSoldItems) {
				CountOfSoldItems = countOfSoldItems;
			}
	        
	        
	    }

	    // Below method will return the top 5 sold products based on the arguments passed
	    public static List<Product> GetTop5SoldProducts(List<Product> products, double minPrice, double maxPrice, String category) {
	        List<Product> filteredList=new ArrayList<>();
	    	for(Product p:products) {
	    		if(p.getCategory().equalsIgnoreCase(category) && p.getPrice()>minPrice && p.getPrice()<maxPrice) {
	    			filteredList.add(p);
	    		}
	    	}
	    	
	    	Collections.sort(filteredList, Comparator.comparing(Product::getCountOfSoldItems,Comparator.reverseOrder()));
	    	List<Product> topProducts=new ArrayList<>();
	    	for(int i=0;i<5;i++) {
	    		topProducts.add(filteredList.get(i));
	    	}
	    	return topProducts;
	    }
	    
	    
	}


Assume below scenario
1. An organization is having multiple departments
2. Organization is having multiple employees
3. An employee can play one or multiple roles in the same or various departments

Here is the table structure for the above scenario

employee(eid, ename, salary)
department(did, dname)
empdept(eid, did, role)

Write down the query to select the employee count of the department along with the department name. Please make sure that the result should contain departments with no employees.

