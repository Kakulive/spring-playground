package com.spring.playground.springbasics;

import com.spring.playground.springbasics.algorithms.BinarySearchImpl;
import com.spring.playground.springbasics.algorithms.BubbleSortAlgorithm;
import com.spring.playground.springbasics.algorithms.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		final var binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);

		SpringApplication.run(SpringBasicsApplication.class, args);
	}

}
