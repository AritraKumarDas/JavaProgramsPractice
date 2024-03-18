package com.greatlearning.corejava;

import java.util.Arrays;

public class RadixSorting {
	
	public void radixSort(int[] arr) {
		int max = findMaximumNumber(arr);
		for(int e=1; max/e>0; e*=10) {
			countSort(arr,e);
		}
	}
	
	public void countSort(int[] arr, int e) {
		int size = arr.length;
		int[] count = new int[10];
		Arrays.fill(count, 0);
		int[] result = new int[size];
		for(int i=0;i<size;i++) {
			count[(arr[i]/e)%10]++;
		}
		
		for(int i=1;i<10;i++) {
			count[i]+=count[i-1];
		}
		
		for(int i=size-1;i>=0;i--) {
			result[count[(arr[i]/e)%10]-1] = arr[i];
			count[(arr[i]/e)%10]--;
		}
		
		for(int i=0;i<size;i++) {
			arr[i] = result[i];
		}
	}
	
	public int findMaximumNumber(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				max= arr[i];
			}
		}
		return max;
	}
	
	public void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		
		int[] arr = new int[]{241,36,985,9,411,23,100,35478,12,96,44,7854,663,1007};
		RadixSorting ob = new RadixSorting();
		System.out.println("Before Sorting ---->");
		ob.display(arr);
		ob.radixSort(arr);
		System.out.println("After Sorting ---->");
		ob.display(arr);

	}

}
