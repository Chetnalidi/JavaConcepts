/**
 * 
 */
package com.practice;

/**
 * @author USER
 *
 */
public class AnnonymousObject {
	void fact(int n)
	{
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnnonymousObject().fact(5);
		
		

	}

}
