package com.cloudgensys.training;


public class MyPojo {


		private  int ID;
		private String empName;
		private float empSalary;
		private boolean status;
		
		public  int getID() {
			return ID;
		}
		public  void setID(int id) {
			this.ID = id;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public float getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(float empSalary) {
			this.empSalary = empSalary;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
			
		MyPojo(int iD,String name,float salary,boolean status){
			ID = iD;
			this.empName = name;
			this.empSalary = salary;
			this.status = status ;
		}
}
