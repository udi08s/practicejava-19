package com.practice.easy;

public class ReverseTheArray {

	public static void main(String[] args) {
		
		int[] arr1= {10,20,30,40,50,60};
		
		int start=0;
		int end=arr1.length-1;
		int temp=0;
		
		System.out.println("Entered Array is:");
		
		for(int i : arr1) {
			System.out.println(i);
		}
		
		while(start<end) {
			temp=arr1[start];
			arr1[start]=arr1[end];
			arr1[end]=temp;
			start++;
			end--;
		}
		
		System.out.println("Reversed Array is:");
		
		for(int i : arr1) {
			System.out.println(i);
		}
		
		

	}

}
