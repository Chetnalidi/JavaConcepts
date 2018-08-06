package com.practice;

public class SubClass extends SuperClass{
	SubClass()
	{
		this(5);
		System.out.println("hii");

	}
	SubClass(int x)
	{
		System.out.println("hii...");

	}
	@SuppressWarnings("unused")
	public void method(){
		System.out.println("hello");
	}
	public static void main(String args[])
	{
		/*SubClass sub = new SubClass();*/
	try{
		int x =5/0;
		
	}catch(Exception e){
		String s= e.getMessage();
		System.out.println(s);
	}
	System.out.println("hello");

}
}
