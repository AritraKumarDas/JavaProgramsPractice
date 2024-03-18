package com.greatlearning.corejava;

public class Area {

	final static float PI = 3.14f;

	static float findArea(float r) {
		return PI * r * r;
	}

	public static void main(String[] args) {

//		Area circle = new Area();

		System.out.println(findArea(5));
	}
}
