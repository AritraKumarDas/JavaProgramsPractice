package com.gl.prob1;

import java.util.PriorityQueue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building: ");
		int totalFloors = sc.nextInt();
		int[] arr = new int[totalFloors];
		for (int i = 0; i < totalFloors; i++) {
			System.out.println("Enter the floor size given on day " + (i + 1) + ": ");
			int floorSize = sc.nextInt();
			if(floorSize >=1 && floorSize <= totalFloors) {
				
				arr[i] = floorSize ;
			}else {
				System.out.println("Invalid floor size! Try again..");
				i--;
			
			}
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

		int seek = totalFloors;

		System.out.println("The order of construction is as follows: "); 
		for (int i = 0; i < totalFloors; i++) {
			System.out.print("DAY " + (i + 1) + "=> ");
			pq.add(arr[i]);

			while (!pq.isEmpty() && seek == pq.peek()) {
				System.out.print(pq.poll() + " ");
				seek--;
			}
			System.out.println();

		}

		sc.close();

	}

}
