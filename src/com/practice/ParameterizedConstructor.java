package com.practice;

public class ParameterizedConstructor {
	int id;
	String name;
	public ParameterizedConstructor(int i,String n)
	{
		id =i;
		name = n;
	}
	void displayName()
	{
		System.out.println(id+" " +name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor p =new ParameterizedConstructor(10, "Ram");
		p.displayName();

	}

}
