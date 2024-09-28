package com.loosecoupling;

public class Car 
{
  Engine e;
  
  Car(Engine e)
  {
	 this.e = e;
  }
  
  public void move()
  {
	  System.out.println("Car move with");
	  e.show();
  }
}
