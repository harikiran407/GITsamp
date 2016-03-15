package com.cloudgensys.training;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
	
	
		public static void main(String args[]){
			
		List<MyPojo> emps = new ArrayList<MyPojo>();
		emps.add(new MyPojo(1,"name1",10000,true));
		emps.add(new MyPojo(2,"name2",20000,true));
		emps.add(new MyPojo(3,"name3",30000,true));
		
		for ( MyPojo e : emps)
		{
			System.out.println("\t e id "+ e.getID()+"\t name"+ e.getEmpName()+"\t salary"+e.getEmpSalary()+"\t status"+e.isStatus() );
		}
	}

}
