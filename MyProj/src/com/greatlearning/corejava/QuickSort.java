package com.greatlearning.corejava;
import java.util.Scanner;

class QuickSort {

    public void quickSort(int[] arr, int low, int high){

        if(low < high){
            int p_index = partition(arr,low,high);
            quickSort(arr,low,p_index-1);
            quickSort(arr,p_index+1,high);

        }
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);

            }
        }
        swap(arr,i+1,high);
        return i+1;

    }

    public void swap(int[] arr, int i, int j){
        if(i!=j){
            arr[j] = arr[i] + arr[j];
            arr[i] = arr[j] - arr[i];
            arr[j] = arr[j] - arr[i];

        }

    }



    public void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

    }

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Array Size: ");
         int size = sc.nextInt();
        
        int[] arr = new int[size];
        
         for(int i=0; i<size;i++){
        	 System.out.println("Enter Array Element " + (i+1) + ": ");
             arr[i] = sc.nextInt();
         }
        QuickSort ob = new QuickSort();
        System.out.println("Before Sorting--->");
        ob.display(arr);
        ob.quickSort(arr,0,size-1);
        System.out.println("After Sorting--->");
        ob.display(arr);
        
        
    }
}