package com.cloudgensys.training;

public class OrderOfnSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float start =System.nanoTime();
		for(int i=1;i<100;i++){
		for(int j=1;j<100;j++)
		{
			System.out.println("Iteration:" +j);
			
		}
		float total =System.nanoTime()-start ;
		System.out.println("Total Excution time is" +total);
	}
	}

}