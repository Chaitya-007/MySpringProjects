package com.springcore.ci;

public class Addition {
	private int x;
	private int y;
	
	public Addition(double a,double b)
	{
		this.x = (int) a;
		this.y = (int) b;
		System.out.println("This is double : double");
	}
	
	public Addition(int a,int b)
	{
		this.x = a;
		this.y = b;
		System.out.println("This is int : int");
	}
	public Addition(String a,String b)
	{
		this.x = Integer.parseInt(a);
		this.y = Integer.parseInt(b);
		System.out.println("This is String : String");
	}

	
	public int doSum()
	{
		System.out.println("Value of a : " + x);
		System.out.println("Value of b : " + y);
		return x + y;
	}
}
