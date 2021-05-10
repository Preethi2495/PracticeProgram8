package fibonacciseries;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapElements {
	  public static void main(String[] args) throws Exception {
		  
		  String [] firstArr = {"Hello","World","Happy","Coding"};
	        System.out.println(" before swapping : "+Arrays.toString(firstArr));
	        List<String> a = Arrays.asList(firstArr);
	        Collections.swap(a,0,2);
	        System.out.println("after swapping : "+Arrays.toString(firstArr));
	    }
	}