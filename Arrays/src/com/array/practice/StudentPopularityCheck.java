package com.array.practice;

import java.util.Scanner;

public class StudentPopularityCheck {

    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students in class: ");
        int n = sc.nextInt();
        String[] vals = new String[n]; 
        System.out.println("Enter popularity index in 1 & 0 strings one by one: ");
        for(int i=0; i<n; i++){
            vals[i] = sc.next();
            System.out.println(vals[i]);
        }
        
        int[][] arr = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                arr[i][j] = vals[i].charAt(j) - '0';
            }
        }
        
        int popolarityValue = -1;
        int popularityIndex = -1;
        // int[] popularity = new int[n];
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int k=0; k<n; k++){
                if(i==k){
                    continue;
                }
                sum += arr[k][i];
            }
            for(int j=0; j<n; j++){
                if(i==j){
                    continue;
                }
                sum -= arr[i][j];
            }

            if(sum > popolarityValue){
                popolarityValue = sum;
                popularityIndex = i;
            }
        }
        System.out.print("Most Popular Student: " + popularityIndex);


    }
}

