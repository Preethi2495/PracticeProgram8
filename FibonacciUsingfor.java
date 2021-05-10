package fibonacciseries;

public class FibonacciUsingfor {
	
	public static void main(String[] args) 
	{
		// Set it to the number of elements you want 
		
		 int maxNumber = 10; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
		  System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
		  
		  //loop
		  
		  int i=1;
		  while(i <= maxNumber)
	        {
			  /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
	            System.out.print(previousNumber+" ");
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	            i++;
	        }
	}

}
