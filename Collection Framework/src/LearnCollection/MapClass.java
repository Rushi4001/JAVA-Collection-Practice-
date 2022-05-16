package LearnCollection;

import java.util.HashMap;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> courses = new HashMap<String, Integer>();
		
		//adding Element
		courses.put("Core Java", 4000);
		courses.put("Basics Python", 3000);
		courses.put("Spring ", 4000);
		courses.put("Android", 4000);
		
		System.out.println(courses);
		
		System.out.println(courses.get("Core Java"));
		
	}
		
	    
}
