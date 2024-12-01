package com.abstarction;
interface Shapes{
	final double PI=3.141;
	final double R=2.5;
	public void CircumAreaCircle();
}
public class Circlee implements Shapes{

	@Override
	public void CircumAreaCircle() {
		System.out.println("The area of the circle is "+(PI*R*R));
		System.out.println("The circumference of the circle is "+(2*PI*R));
		
	}

}
