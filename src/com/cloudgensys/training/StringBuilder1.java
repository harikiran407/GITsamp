package com.cloudgensys.training;


public class StringBuilder1{



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		for(int i=0;i<=10000;i++)
		{
			sb.append(i+" "+ "\n");
		}
		System.out.println(sb);
	}

	

	

}
