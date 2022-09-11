package com.masai.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7);

		List<Integer>squareList=list
				                    .stream()
				                    .map(s->(s*s))
				                    .collect(Collectors.toList());
		
		for(Integer integer:list) {
			System.out.println(integer);
		}
		for(Integer square :squareList) {
			System.out.println(square);
		}
		
		
	}

}
