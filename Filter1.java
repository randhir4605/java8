package com.java8;

import java.util.List;
import java.util.Optional;

public class Filter1 {

	public static void main(String[] args) {
		List<String> nameList = List.of("Abhishek","Mohan","Bablu","Tumpa","Rohan");
		boolean isBabluFound=nameList.stream().anyMatch(name->name.equalsIgnoreCase("Bablu"));
		System.out.println(isBabluFound);
		
		List<Integer> evenList = List.of(2,4,8,10,16,22);
		boolean isAllNumbersAreEven=evenList.stream().allMatch(num->num%2==0);
		System.out.println(isAllNumbersAreEven);
		
		List<Integer> numbers = List.of(1,5,6,5,8,43,80,33,2,1,6);
		Optional<Integer> firstNum = numbers.stream().findFirst();
		System.out.println(firstNum.get());
		Optional<Integer> firstEven = numbers.stream().filter(num->num%2==0).findFirst();
		System.out.println(firstEven.get());
		
		Optional<Integer> anyNum=numbers.stream().findAny();
		System.out.println(anyNum.get());
		Optional<Integer> anyNumGreaterThanTen=numbers.stream().filter(num->num>10).findAny();
		System.out.println(anyNumGreaterThanTen.get());
	}
}
