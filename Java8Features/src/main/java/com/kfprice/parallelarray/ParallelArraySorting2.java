package com.kfprice.parallelarray;

import java.util.Arrays;

public class ParallelArraySorting2 {

	public static void main(String[] args) {
		
		int[] arr = {5,8,1,0,6,9,50,-3};
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		Arrays.parallelSort(arr,0,4);
		System.out.println("\nArray elements after sorting");
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		

	}

}
