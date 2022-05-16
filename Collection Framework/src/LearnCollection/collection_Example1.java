package LearnCollection;
//import util package[all classes]

import java.util.*;


public class collection_Example1 {

	public static void main(String[] args) {
		
	/*
	 
	 creating collection 
	 
	 1) type safe - same type of elements(objects) are added to collection.
	 
	 2) untype safe - different types of elements added to collectiopn .
	 	
	 */
		
		
		//Type safe 
		System.out.println("Untype Safe Example -> ");
		
		//Creating object 
		ArrayList<String> names = new ArrayList<String>();
		
		//Add values
		names.add("Rushikesh");
		names.add("alok");
		names.add("sonal");
		names.add("pratiksha");
		names.add("Aditya");
		names.add("Rushikesh");  // duplicats are allowed
		
		// Print names
		System.out.println(names);
		
		// Print Indexed value
		System.out.println(names.get(0));
		System.out.println(names.get(4));
		
		//Untype safe 
		System.out.println("Untype Safe Example -> ");
		
		//Creating object 
		LinkedList list = new LinkedList();
		
		//Add values
		list.add("Sachin");
		list.add(99);
		list.add(456.789);
		list.add(true);
		
		//Print List
		System.out.println(list);
		
		//Remove Element 
		names.remove("Rushikesh");
		
		System.out.println(names);
		
		//size 
		System.out.println(names.size());
		
		//Check  item is there or not
		System.out.println(names.contains("Rushikesh"));
		
		//set 
		names.set(1, "Shiv");
		System.out.println(names);
		
		//Remove all Elements 
		//names.clear();
		
		Vector<String> vector = new Vector<String>();
		vector.addAll(names);
		
		System.out.println("ArrayList :->" +names);
		System.out.println("Vector :-> " +vector);
		
		System.out.println("***********************************");
		HashSet<Double> nms = new HashSet<Double>();
		nms.add(89.99);
		nms.add(789.99);
		nms.add(67.989);
		nms.add(64563.67);
		
		System.out.println(nms);
		
		
		TreeSet<Double> tset = new TreeSet<Double>();
		tset.addAll(nms);
		System.out.println(tset);
		
		
		
	}

}
