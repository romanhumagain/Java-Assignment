package practice;

public class function {
//factorial of a number
	
	//creating method
	 public static void factorial(int n) {
		
		 int fact=1;
		 for(int i=n; i>=1; i--) {
				fact*=i;
			}
		 System.out.println(fact);
		  }
	public static void main(String [] args) {
		int n=5;
		factorial(n);
		
		
		
	}
	
	}
	
	
	

