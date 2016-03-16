package com.cloudgensys.training;

import java.util.Scanner;

public class Prime {


	
	    public boolean isPrimeNumber(int a)
	    {
	        for(int i=2; i<=a; i++)
	        {
	            if(a% i == 0)
	            {
	                return false;
	            }
	        }
	        return true;
	    }
	     
  public static void main(String a[]){
	  
	  Prime ob = new Prime();
	  Scanner sc = new Scanner(System.in);
	  int number = sc.nextInt();
	  float start =System.nanoTime();
	  boolean k = ob.isPrimeNumber(number);
	  if ( k )
	  {
		  System.out.println("Given number is not Prime Number");
	  }
	  else
	  {
		  System.out.println("Given number is  a Prime Number");
	  }
	  float total =System.nanoTime()-start ;
		System.out.println("Total Excution time is" +total);
  }
  
}

	 