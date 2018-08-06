package com.practice;

public class StaticExample {
	int id;
	static String name ="Ram";
	static void change()
	{
		name ="shyam";
	}

	public StaticExample(int id) {
		super();
		this.id = id;
	}
	void display()
	{
		System.out.println("id"+id+"name"+name);
	}
    static void calculate(int x)
    {
    	int cube = x*x*x;
    	System.out.println(cube);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample.change();
		StaticExample s1 =new StaticExample(1);
		s1.display();
		StaticExample.calculate(3);

	}

}
