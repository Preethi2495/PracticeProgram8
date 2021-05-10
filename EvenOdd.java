package Java8Features;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {
	
	 public static void main(String[] args) {
	     List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,10,33,45,67,78,98);
	     numbers.stream().filter(n -> n % 2 != 0)
	     .forEach(System.out::println);
	   }

}
