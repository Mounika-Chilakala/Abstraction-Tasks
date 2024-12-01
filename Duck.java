package com.abstarction;
interface Flyable{
	public abstract void fly();
}
interface Swimmable{
	public abstract void swim();
}
public class Duck implements Flyable,Swimmable{

	@Override
	public void swim() {
		System.out.println("The duck can swim in the pond");
		
	}

	@Override
	public void fly() {
		System.out.println("The duck cant fly in the sky");
		
	}
	public static void main(String[] args) {
		Duck duck=new Duck();
		duck.fly();
		duck.swim();
	}

}
