package com.gl.mentoringsessions2;

public class ArrayRotate {
	
	public int[] rotateArray(int[] arr) {
		int mid = arr.length/2;
		int[] newArr = new int[arr.length];
		for(int i=0; i<mid; i++) {
			newArr[i] = arr[mid+i];
		}
		for(int i=0; i<mid; i++){
			newArr[mid+i] = arr[i];
		}
		
		return newArr;
	}

}



// 1234 5678