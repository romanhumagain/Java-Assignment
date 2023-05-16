package week3day2;

public class practice1 {

	public static void main(String[] args) {
	
		//printing elements of array
		int nums[] = {5,3,6,9,7,4}; //declared
		 /*int MAX = nums[0];
		for (int i=1; i<nums.length;i++) {
			if(MAX<nums[i])
				MAX=nums[i];
		}
		System.out.println("THE REQUIRED MAXIMUM NUMBER IS: "+MAX);
	*/
		
		//PRINTING MINIMUM ELEMENTS OF ARRAYS
	int MIN = nums[0];
	for(int i =1; i<nums.length;i++) {
		
		if(MIN>nums[i]) {
			MIN = nums[i];
		}
	}
	System.out.println("THE REQUIRED MAXIMUM NUMBER IS: "+MIN);
	int num1=9;
	boolean res = true ;
	for(int i=0; i<nums.length;i++) { 
	if(nums[i]==num1) {
	
	res=true;
	break;

	}
	
	}	
if(res==true) {
	System.out.println("found");
}
else
	System.out.println("not found");

	System.out.println("my name is roman humagain");
	}
	}


	

