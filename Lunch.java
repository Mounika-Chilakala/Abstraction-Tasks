package com.abstarction;
abstract class Meal{
	public final void prepareMeal() {
		cooking();
		plating();
		serving();
	}
	protected abstract void cooking();
	protected abstract void plating();
	protected abstract void serving();
}
class Breakfast extends Meal{

	@Override
	protected void cooking() {
		System.out.println("cooking of dosa and chutney.");
		
	}

	@Override
	protected void plating() {
		System.out.println("Plating the breakfast as dosa and chutney.");
		
	}

	@Override
	protected void serving() {
		System.out.println("Serving the breakfast with water.");
		
	}
	
}
public class Lunch extends Meal{

	@Override
	protected void cooking() {
		System.out.println("Cooking of Fish curry and white rice.");
		
	}

	@Override
	protected void plating() {
		System.out.println("Plating the fish curry and rice separately.");
		
	}

	@Override
	protected void serving() {
		System.out.println("Serving the tasty tasty fish curry with rice and water bottle.");
		
	}
	public static void main(String[] args) {
		Breakfast bf=new Breakfast();
		bf.prepareMeal();
		Lunch lu=new Lunch();
		lu.prepareMeal();
	}

}
