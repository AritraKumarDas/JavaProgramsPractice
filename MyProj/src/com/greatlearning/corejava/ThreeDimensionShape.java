package com.greatlearning.corejava;

public class ThreeDimensionShape {
	
	double width, height, depth;
	
	ThreeDimensionShape(){
		width =height=depth=0;
	}
	
	ThreeDimensionShape(double length){
		width =height=depth=length;
	}
	
	ThreeDimensionShape(double w, double h, double d){
		width = w;
		height=h;
		depth=d;
	}
	
	double volume() {
		return width*height*depth;
	}

	public static void main(String[] args) {
		
		ThreeDimensionShape c1 = new ThreeDimensionShape();
		ThreeDimensionShape c2 = new ThreeDimensionShape(3.1);
		ThreeDimensionShape c3 = new ThreeDimensionShape(2.5, 8.1, 9.3);
		
		System.out.println("Volume of Cube c1: " + c1.volume());
		System.out.println("Volume of Cube c2: " + c2.volume());
		System.out.println("Volume of Cube c3: " + c3.volume());
		

	}

}
