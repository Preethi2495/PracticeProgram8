package EvenOdd;



public class Add {
    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int even = 0, odd = 0;
 
        // Loop to find even, odd sum
        for (int i = 0; i < arr.length; i++) {
        	 if (arr[i] % 2 == 0)
                 even += arr[i];
             else
                 odd += arr[i];
        	
        }
        System.out.println("Even   sum: " + even);
		  System.out.println("Odd   sum: " + odd);
		  
		 
    }
}
