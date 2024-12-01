package com.abstarction;
interface Drawable{
	public void draw();
}
class Rectangles implements Drawable{

	@Override
	public void draw() {
		System.out.println("Rectangle has length and width");
		
	}
	
}
public class Circles implements Drawable{

	@Override
	public void draw() {
		System.out.println("Circle has Radius");
		
	}
	public static void main(String[] args) {
		Rectangles r=new Rectangles();
		r.draw();
		Circles c=new Circles();
		c.draw();
	}

}
