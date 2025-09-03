package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void myCustomInit()
	{
		System.out.println("Inside init method");
	}
	
	public void myCustomDestroy()
	{
		System.out.println("Inside destroy method");
		
	}

}
