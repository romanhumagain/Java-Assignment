package ARRAY;

import java.util.ArrayList;

public class arrayList01 {

	public static void main(String[] args) {
		
		//declaring array
		
		int nums[] = new int[5];
		 nums[0] = 9;
		 nums[1] = 7;
		 nums[2] = 5;
		 nums[3] = 8;
		 nums[4] = 2;
		 
		 /*
		 //System.out.println(nums[3]);
		
		 
		 //creating object of arraylist
		 ArrayList alist = new ArrayList();
		 
		 //updating removing getting an element
		 
		 //1 updating
		Object obj =  alist.remove(3);
		 System.out.println(obj);*/
		 
		 ArrayList list = new ArrayList();
		 list.add(56);
		 list.add(78);
		 list.add(89);
		 list.add(45);
		 System.out.println(list);
		 Object obj = list.get(3);
		 System.out.println(obj);
		 
		  list.remove(2);
		 System.out.println(list);
		 
		 list.set(1, 46);
		 System.out.println(list);
		 
		 
		 list.add(67);
		 System.out.println(list);
		 
		 list.clear();
		 System.out.println(list);
		 
		 list.add(34);
		 list.add(04);
		 list.add(94);
		 list.add(84);
		 
		 System.out.println(list);
		 
		Object length =  list.size();
		 System.out.println(length);
		 
		 
		 boolean result =  list.add(3);
		 
		 System.out.println(result);
		 System.out.println(list);

	}

}
