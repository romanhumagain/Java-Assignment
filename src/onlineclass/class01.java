package onlineclass;
import java.util.ArrayList;
public class class01 {

	public static void main(String[] args) {
	/*int nums[] = new int[5];
	nums[0]=9;
	nums[1]=10;
	nums[2]=15;
	nums[3]=80;
	nums[-1] = 9;
	nums[5]= 23;
	
	System.out.println(nums[1]);
	System.out.println(nums[-1]);*/
		
		
		// arraylist can store multiple  values of any type where an array can store multiple value of similar type
		/*ArrayList alist = new ArrayList();
		
		boolean result = alist.add(90);
		System.out.println(result);
		result = alist.add(10);
		System.out.println(result);
		result = alist.add(69);
		System.out.println(result);
		System.out.println(alist);
		
		*/
		
		// clearing all the content of arraylist
		/*ArrayList alist= new ArrayList();  
		alist.add(89);
		alist.add(88);
		alist.add(85);
		alist.add(82);
		System.out.println(alist);
alist.clear();  // It removes all the listed items
System.out.println(alist);
*/ 
		
		/*boolean std = stdlist.add(6969);
		System.out.println(std);
		 std = stdlist.add("Roman Humagain");
		System.out.println(std);
		std = stdlist.add("Bhaktapur");
		System.out.println(std);
		 std = stdlist.add("romanhumagain@gmail.com");
		System.out.println(std);
		System.out.println(stdlist); */
		
		
		

		
		/*
		
//getting an individual element
ArrayList list = new ArrayList();
list.add(56);
list.add(78);
list.add(89);
list.add(45);
System.out.println(list);
Object obj = list.get(2);
System.out.println(obj);
		*/


//removing an element
		
		
		
		/*alist.add(36);
		alist.add(39);
		alist.add(37);
		alist.add(35);
		alist.add(33);
		System.out.println(alist);
		
		alist.remove(3);
		System.out.println(alist);*/
		
		
		/*//setting new value
		ArrayList alist = new ArrayList();
		alist.add(36);
		alist.add(39);
		alist.add(37);
		alist.add(35);
		alist.add(33);
		System.out.println(alist);
		Object obj =alist.set(3, 5656);
		System.out.println(obj);
		System.out.println(alist);
		*/
		
		
		
		/*//list of an element
		ArrayList alist = new ArrayList();
		alist.add(36);
		alist.add(39);
		alist.add(37);
		alist.add(35);
		alist.add(33);
		int ln = alist.size();
		System.out.println(ln);
		*/
		
		
		//create an object of an arraylist type
		
		ArrayList alist = new ArrayList();
		alist.add(8);
		alist.add(4);
		alist.add(3);
		alist.add(8);
		alist.add(6);
		System.out.println(alist);
		
		//printing the size of an array
		
		Object ln = alist.size();
		System.out.println("size " +ln);
		
		//updating value 3 by 9
		Object up = alist.set(3 ,9);
		//System.out.println("updated  value " +up);
		System.out.println("updated value "+alist);
		
		Object ind = alist.get(2);
		System.out.println(ind);
		
		
		//removing value 6 from arraylist
		
		Object rem = alist.remove(4);
		System.out.println(alist);
		
		
		 alist.clear();
		 System.out.println(alist);
	}

	}
	


