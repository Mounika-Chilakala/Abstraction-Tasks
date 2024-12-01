package com.abstarction;
abstract class Vehicles{
	public String make;
	public String model;
	public Vehicles(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
}
class Motorcycles extends Vehicles{	
public Motorcycles(String make, String model) {
	super(make, model);
}
public void displayInfo() {
	System.out.println("The Motorcycle make is:"+this.make);
	System.out.println("The Motorcycle model is:"+this.model);
}
	
}
public class Cars extends Vehicles{

	public Cars(String make, String model) {
		super(make, model);
		
	}
	public void displayInfo() {
		System.out.println("The Car make is:"+this.make);
		System.out.println("The Car model is:"+this.model);
	}
	public static void main(String[] args) {
		Motorcycles mc=new Motorcycles("Honda", "CBR500R");
		mc.displayInfo();
		Cars c=new Cars("BMW", "X5");
		c.displayInfo();
	}

}
