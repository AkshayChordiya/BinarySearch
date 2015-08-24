package com.aky.algorithm;

import java.util.Arrays;

/**
* Custom code for binary search using 
* ternary operator
* Complexity: O(log n)
*
* @author Akshay Chordiya
* @since 24-05-2015
**/
public class BinarySearch {
	
	public int binarySearch(int[] inputArr, int key, int start, int end) {
        return start <= end ? search(inputArr, key, start, end) : -1;
    }

	private int search(int[] inputArr, int key, int start, int end) {
		int mid = (start + end) / 2;
		return key == inputArr[mid] 
				? mid 
				: key < inputArr[mid] 
						? binarySearch(inputArr, key, start, mid - 1) 
						: binarySearch(inputArr, key, mid + 1, end);
	}
  
    public static void main(String[] args) {
    	int start = 0, end;
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(arr);
        end = arr.length - 1;
    	BinarySearch mbs = new BinarySearch();
        System.out.println("Key's position: " + mbs.binarySearch(arr, 6, start, end));
    }

}
