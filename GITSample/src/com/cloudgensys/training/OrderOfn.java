package com.cloudgensys.training;

public class OrderOfn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float start =System.nanoTime();
		for(int j=0;j<100;j++)
		{
			System.out.println("Iteration:" +j);
			
		}
		float total =System.nanoTime()-start ;
		System.out.println("Total Excution time is" +total);
	}

}
