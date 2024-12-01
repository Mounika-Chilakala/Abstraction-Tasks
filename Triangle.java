package com.abstarction;
interface Shapee{
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
}
class Cirlee implements Shapee{
	double r;
	

	public Cirlee(double r) {
		super();
		this.r = r;
	}

	@Override
	public void calculateArea() {
		System.out.println("The area of the circle:"+(Math.PI*r*r));
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("The perimeter of the circle:"+(2*Math.PI*r));
		
	}
	
}
class Rectanglee implements Shapee{
	double length;
	double width;
	

	public Rectanglee(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public void calculateArea() {
		System.out.println("The area of the Rectangle:"+(length*width));
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("The perimeter of the Rectangle:"+(2*(length+width)));
		
	}
	
}
public class Triangle implements Shapee{
	double a;
	double b;
	double c;
	double h;
	

	public Triangle(double a, double b, double c, double h) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of the Triangle:"+(1/2*b*h));
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("The perimeter of the Triangle:"+(a+b+c));
		
	}
	public static void main(String[] args) {
		Cirlee crl=new Cirlee(4);
		crl.calculateArea();
		crl.calculatePerimeter();
		Rectanglee rect=new Rectanglee(4.5, 3.7);
		rect.calculateArea();
		rect.calculatePerimeter();
		Triangle trg=new Triangle(2.3,3, 1.9, 5);
		trg.calculateArea();
		trg.calculatePerimeter();
	}

}
