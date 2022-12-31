package com.java8;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		List<String> listOfStr = List.of("23","20","27","28","29","29","30","30");
		listOfStr.stream().mapToInt(str->Integer.valueOf(str)).filter(num->num>20).sorted().collect(Collectors.toMap(e, e+2l));
		
		ExecutorService service = 
	}
}
