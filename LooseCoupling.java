package com.loosecoupling;

public class LooseCoupling {

	public static void main(String[] args) {
	 
		Car c = new Car(new DiselEngine());
		c.move();

	}

}
