package LabReport;

public class exeSix {

	public static void main(String[] args) {
		
		int a , b ,c;
		a=5;
		b=3;
		c=8;
		// && AND Operator
	    System.out.println((a > b) && (c > a));  // true
	    System.out.println((a > b) && (c < a));  // false

	    // || OR Operator
	    System.out.println((a < b) || (c > a));  // true
	    System.out.println((a > b) || (c < a));  // true
	    
	    

	    // ! Operator
	    System.out.println(!(a == b));  // true
	    System.out.println(!(a > b));  // false


	}

}
