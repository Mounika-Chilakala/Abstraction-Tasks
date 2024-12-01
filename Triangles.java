package com.abstarction;

import java.util.Scanner;

abstract class Shap{
	public abstract void calculateArea();
}
class Circl extends Shap{
	double radius;
	

	public Circl(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public void calculateArea() {
		System.out.println("Area of the Circle:"+(Math.PI*radius*radius));
		
	}
	
}
class Rectangl extends Shap{
	double length;
	double width;
	

	public Rectangl(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}


	@Override
	public void calculateArea() {
		System.out.println("The area of the Rectangle:"+(length*width));
		
	}
	
}
public class Triangles extends Shap{
	double base;
	double height;
	

	public Triangles(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}


	@Override
	public void calculateArea() {
		System.out.println("The area of the Triangle:"+(1/2*base*height));
		
	}
	public static void main(String[] args) {
		Shap[] shapes=new Shap[3];
		shapes[0]=new Circl(4);
		shapes[1]=new Rectangl(2.3, 3.4);
		shapes[2]=new Triangles(4, 6);
		for(int i=0;i<shapes.length;i++) {
			shapes[i].calculateArea();
		}
	}

}
