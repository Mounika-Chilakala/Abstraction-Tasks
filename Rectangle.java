package com.abstarction;
abstract class Shape{
	public abstract void calculateArea();
}
class Circle extends Shape{
	double radius;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public void calculateArea() {
		System.out.println("The area of the circle is "+(Math.PI*this.radius*this.radius));
		
	}
	
}
public class Rectangle extends Shape {
	double length;
	double width;
	

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}


	@Override
	public void calculateArea() {
		System.out.println("The area of the Rectangle is "+(this.length*this.width));
		
	}
	public static void main(String[] args) {
		Circle c=new Circle(2.4);
		c.calculateArea();
		Rectangle r=new Rectangle(4.5, 3);
		r.calculateArea();
	}

}
