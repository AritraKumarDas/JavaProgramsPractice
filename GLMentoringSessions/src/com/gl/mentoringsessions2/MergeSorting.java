package com.gl.mentoringsessions2;

public class MergeSorting {

	public void mergeSort(int[] arr, int start, int end){
		if(start == end){
			return;
		}
		int mid = start + (end-start)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,end,mid);
	}

	public void merge(int[] arr, int start, int end, int mid){

		int len1 = mid-start+1;
		int len2 = end-mid;
		int[] leftArr = new int[len1];
		int[] rightArr = new int[len2];
		for(int i=0; i<len1; i++){
			leftArr[i] = arr[start+i];
		}
		for(int i=0; i<len2; i++){
			rightArr[i] = arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<len1 && j<len2){
			if(leftArr[i] < rightArr[j]){
				arr[k] = leftArr[i];
				i++;
				k++;
			}else{
				arr[k] = rightArr[j];
				j++;
				k++;
			}
		}

		while(i<len1){
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j<len2){
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

	public void display(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
