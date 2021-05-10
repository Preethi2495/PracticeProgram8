package comparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		
		int[] arr= {1,5,3,4,5,2,9,6,3,1,2};
		//Array will accept primitive datatype
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list= new ArrayList<>();
		list.add(102);
		list.add(1050);
		list.add(1000);
		list.add(12);
		list.add(106);
		list.add(18);
		//sort collections 
		Collections.sort(list);
		System.out.println(list);
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(100,"ma",2000));
		emp.add(new Employee(20,"ab",2589));
		emp.add(new Employee(3235,"prty",3258));
		emp.add(new Employee(43,"preethi",20));
		
		//Collections.sort(emp);
		
		//Collections.sort(emp,Employee.idComp);
		Collections.sort(emp,new NameComparator());
		System.out.println(emp);
		
		
	}
}
