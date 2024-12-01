package com.abstarction;
abstract class Animal{
	String name;
	String sound;
	
	public Animal(String name, String sound) {
		super();
		this.name = name;
		this.sound = sound;
	}

	public abstract void makeSound();
}
class Dog extends Animal{

	
	public Dog(String name, String sound) {
		super(name, sound);
		
	}

	@Override
	public void makeSound() {
		System.out.println(this.name +" is a animal and it sounds "+this.sound);
		
	}
	
	
}
public class Cat extends Animal{

	public Cat(String name, String sound) {
		super(name, sound);
		
	}

	@Override
	public void makeSound() {
		System.out.println(this.name+" is a animal and it sounds "+this.sound);
		
	}
	public static void main(String[] args) {
		Dog d=new Dog("dog", "bow bow");
		d.makeSound();
		Cat c=new Cat("cat", "meow meow");
		c.makeSound();
	}

}
