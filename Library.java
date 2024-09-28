package com.loosecoupling;

public class Library {

	BookLibrary b;
	
	Library( BookLibrary b)
	{
	  this.b = b;
	}
	
	public void show()
	{
		System.out.println("I have collection of books and magazines");
		b.read();
	}

}
