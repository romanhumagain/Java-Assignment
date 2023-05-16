package LabReport;

public class exeThree {

	public static void main(String[] args) {
		 
		//declaring variables
	    byte byt; //primitive datatypes
		int num1;
		long num2;
		double fl;
		
		String str;  //non-primitive datatypes
		 int nums[];
		 
		 
		//assigning variables
		 byt = 36;
		 num1 = 69;
		 num2=23021176;
		 fl=36.8;
		
		 
		 str = "Roman Humagain";
		 
		 nums = new int[3];
		 nums[2] = 20;
		
		 double sum;
		 sum =fl+byt;
		 
		// Displaying the assigned values
		System.out.println("My name is " +str+". " +"I am "+nums[2]+" years old. "+"My University ID is "+num2+".");
	
        System.out.println("The Sum is "+sum);
	
	}

}
