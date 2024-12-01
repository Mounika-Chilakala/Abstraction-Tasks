package com.abstarction;
abstract class Employee{
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public abstract void calculateBonus(double percentage);
}
class Manager extends Employee{

	public Manager(String name, double salary) {
		super(name, salary);
		
	}

	@Override
	public void calculateBonus(double percentage) {
		System.out.println("The bonus for Manager:"+(salary*percentage));
		
	}
	
}
public class Developer extends Employee{

	public Developer(String name, double salary) {
		super(name, salary);
		
	}

	@Override
	public void calculateBonus(double percentage) {
		System.out.println("The bonus for Developer:"+(salary*percentage));
		
	}
	public static void main(String[] args) {
		Manager mg=new Manager("Mounika", 30000);
		mg.calculateBonus(2.3);
		Developer dev=new Developer("Nani", 23000);
		dev.calculateBonus(1.5);
	}

}
