package com.java8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IterateAndGenerate {

	public static void main(String[] args) {
		/*
		 * Stream.iterate(0, n->n+1) .limit(10) .forEach(x->System.out.println(x));
		 */

		
		/*
		 * int sum=Stream.iterate(new int[] {0,1}, t-> new int[] {t[1],t[0]+t[1]})
		 * .limit(10) .mapToInt(arr->arr[0]) .sum(); System.out.println(sum);
		 */
		 

		
		IntStream.rangeClosed(1, 10).forEach(n -> System.out.println(n));
	}
}
