package com.learning.rest.learningrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningrestApplication {
	
public static void main(String[] args) {
		
		//BinarySearchImpl binSrch = new BinarySearchImpl(new BubbleSortAlgo());
		
		
		ApplicationContext context= SpringApplication.run(LearningrestApplication.class, args);
		BinarySearchImpl binSrch = context.getBean(BinarySearchImpl.class);
		
		int[] inputArray = {3,4,7,5,6};
		int result = binSrch.search(inputArray, 4);
		System.out.println("Output result: "+result);
	}

}
