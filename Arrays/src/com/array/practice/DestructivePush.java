package com.array.practice;

import java.util.Scanner;

public class DestructivePush {

    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements one by one: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Stack st = new Stack(n);

        for(int i=0; i<n; i++){
            if( arr[i] == st.peek() ){
                st.pop();
            }else{
                st.push(arr[i]);
            }
        }
        for(int i=0; i <= st.currentPointer; i++){
            System.out.print(st.stack[i] + " ");
        }

    }
}

class Stack{
    int maxSize;
    int currentPointer;
    int[] stack;

    Stack(int size){
        this.maxSize = size;
        this.currentPointer = -1;
        stack = new int[size];
    }

   void push(int data){
       if(currentPointer >= maxSize-1){
           return;
       }
       stack[++currentPointer] = data;
        return;
    }

    int pop(){
        if(currentPointer <= -1){
            return -1;
        }
        return stack[currentPointer--];
        
    }

    int peek(){
        if(currentPointer <= -1){
            return -1;
        }
        return stack[currentPointer];
    }

     
}


