package com.learning.rest.learningrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl3 {

	@Autowired()
	SortAlgo sortAlgo;

	//Neither setter nor constructor injection
	
	public int search(int[] intArray, int numberToSearch)
	{
		// implement the sorting logic
		// bubble sort algo
		//BubbleSortAlgo bsa = new BubbleSortAlgo();
		int[] sortedArray  = sortAlgo.sort(intArray);
		System.out.println("Sorting Algo Used: "+sortAlgo);
		
		// search the array
		return 3;
	}
	
}
