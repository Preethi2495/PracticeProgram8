package EvenOdd;

public class findPrime {
	 public static void main(String args[])
	    {
	        int arr[] = { 1, 2, 3, 4, 5, 6 };
	      
	        // Loop to find even, odd
	        for (int i = 0; i < arr.length; i++) {
	        	 if (arr[i] % 2 != 0)
	        		 System.out.println("odd number"+ arr[i]);	
	        }
			 
	    }
}
