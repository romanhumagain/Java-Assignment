package LabAssign;

public class Calculator {

	private int num1;
	private int num2;
	private int num3;
	
	public Calculator(){ // default constructor
		this.num1=0;
		this.num2=0;
		this.num3=0;
	}
	public Calculator(int num1, int num2) { //parameterized constructor
		this.num1=num1;
		this.num2=num2;
		this.num3=0;
	}
	//using getter
	public int getNum1() {
		return this.num1;
	}
	public int getNum2() {
		return this.num2;
	}
	public int getNum3() {
		return this.num3;
	}
	//using setter
	
	public void setNum1(int num1) {
		this.num1 = num1;
		
	}
	public void setNum2(int num2) {
		this.num2 = num2;
		
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	 //Using SUM Method
	public void sum() {
		this.num3= this.num1 + this.num2;
	}
	
	//using toString method
	public String toString() {
		return this.num1+ "," + this.num2 +","+this.num3; 
	}
	

}
