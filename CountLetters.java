package StringConcepts;

import java.util.HashMap;

public class CountLetters {
	
	 public static void main(String argu[]) {

	 String s = "Preeethilikhitha";
	 
//convert to char
	 char[] c = s.toCharArray();
	 //key value pair
	 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
			 for(char c1 : c) {
			 if(map.containsKey(c1)) 
			 {
			 map.put(c1,map.get(c1)+1);
			 }
			 else {
			 map.put(c1, 1);
			 }
			 }
			 map.forEach((k,v)->{
				 System.out.println(k+":"+v);
			 });
			 }
			 }