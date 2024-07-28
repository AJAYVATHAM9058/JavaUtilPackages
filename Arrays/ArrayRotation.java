package Arrays;
//Java Program to rotate the array elements 

import java.util.*;
public class ArrayRotation {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements of array ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int []temp = new int[n];
		int k = 0; //for temp array
		//taking array elements using Random
		Random rn = new Random();
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(1,100);
		}
		System.out.println("Array Elements are : "+Arrays.toString(arr));
		
		System.out.println("Enter no. of times to rotate array ");
		int rotation = sc.nextInt();
		
		//if rotation is greater than length of the array
		if(rotation > arr.length) {
			rotation = rotation % arr.length;
		}
		
		//storing n-d elements 
		for(int i=rotation;i<n;i++) {
			temp[k++] = arr[i];
		}
		
		//storing remaining elements
		for(int i = 0;i<rotation;i++) {
			temp[k++] = arr[i];
		}
		
		//copying temp array elements into original array
		for(int i=0;i<n;i++) {
			arr[i] = temp[i];
		}
		
		//After rotating the array
		System.out.println("After rotating the array elements : "+Arrays.toString(arr));
		
		
		
	}

}
