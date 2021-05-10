package Numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeAdd{  
public static void main(String args[]){  
 //Creating a List  
 List<Integer> list=new ArrayList<Integer>();  
 //Adding elements in the List  
 list.add(1);  
 list.add(3);  
 list.add(5); 
 list.add(7); 
 list.add(12); 
   	 
 int b = 0;
 for(int i=0;i<list.size();i++)
  {
      if(i%2==0){
       b= b+list.get(i);
  }
  }
System.out.println("The answer is" + b);
  System.out.println("Printing List: "+list);  
  
}  
}  