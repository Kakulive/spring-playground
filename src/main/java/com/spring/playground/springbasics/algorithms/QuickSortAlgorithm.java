package com.spring.playground.springbasics.algorithms;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        // Logic for Quick Sort
        return numbers;
    }
}