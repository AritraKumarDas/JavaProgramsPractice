package com.array.practice;

import java.util.Scanner;

public class ArrayRotationDeletion {

    public static void operation1(int[] a){
        int size = a.length;
        int item = a[0];
        for(int i=1; i<size; i++){
            a[i-1] = a[i];
        }
        a[size-1] = item;
    }

//     public static void operation2(int[] a, int[] b){
//         int size = a.length;
//         int newSize = size-1;
//         int[] new_A = new int[newSize];
//         int[] new_B = new int[newSize];
//         for(int i=0; i<newSize; i++){
//             new_A[i] = a[i+1];
//             new_B[i] = b[i+1];
//         }
//         a=new_A;
//         b=new_B;
//
//
//
//    }

    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arrays: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter " + n + " elements of first array one by one: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter " + n + " elements of second array  one by one: ");
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        int opCount = 0;
        while(a.length > 0){
        	System.out.println("Array size: " + a.length);
            if(a[0] == b[0]){
//                operation2(a,b);
            	 int size = a.length;
                 int newSize = size-1;
                 int[] new_A = new int[newSize];
                 int[] new_B = new int[newSize];
                 for(int i=0; i<newSize; i++){
                     new_A[i] = a[i+1];
                     new_B[i] = b[i+1];
                 }
                 a=new_A;
                 b=new_B;
                opCount++ ;
            }else{
                operation1(a);
                opCount++ ;
            }

        }
        System.out.println("No of operations: " + opCount);
    }
}

