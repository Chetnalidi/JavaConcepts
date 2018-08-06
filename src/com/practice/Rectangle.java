package com.practice;

public class Rectangle {
	int length;
	int width;
	/*void insert(int l,int w)
	{
		l =length;
		w = width;
	}*/
	void calculation()
	{
		System.out.println("Area is" +length*width);
	}

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(),r2= new Rectangle();//creating 2 objects
		r1.setLength(100);
		r1.setWidth(10);
		r2.setLength(10);
		r2.setLength(50);
		r1.calculation();
		r2.calculation();
		
		
		

	}

}

