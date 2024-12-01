package com.abstarction;
interface Vehicle{
	public abstract void start();
	public abstract void stop();
	default void honk() {
		System.out.println("The vehicle gives honk");
	}
}
class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("First the Car will be started.");
		
	}

	@Override
	public void stop() {
		System.out.println("Finally the Car will be stopped.");
		
	}

	
}
public class MotorCycle implements Vehicle{

	@Override
	public void start() {
		System.out.println("First the Motorcycle will be started.");
		
	}

	@Override
	public void stop() {
		System.out.println("Finally Motorcycle will be stopped.");
		
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.honk();
		c.stop();
		MotorCycle mc=new MotorCycle();
		mc.start();
		mc.honk();
		mc.stop();
	}

}
