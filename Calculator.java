package com.abstarction;
interface MathOperations{
	public abstract void calculate(int a,int b);
    public static void square(int a) {
    	System.out.println("The square of the number:"+(a*a));
    }

}
public class Calculator implements MathOperations{

	@Override
	public void calculate(int a, int b) {
		System.out.println("The addition of two numbers:"+(a+b));
		System.out.println("The substraction of two numbers:"+(a-b));
		System.out.println("The multiplication of two numbers:"+(a*b));
		System.out.println("The division of two numbers:"+(a/b));
		
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		MathOperations.square(4);
		cal.calculate(2, 5);
	}

}
