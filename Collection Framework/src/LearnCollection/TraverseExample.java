package LearnCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
				
				//For Each Loop
				
				for(String str:names)
				{
					System.out.print(str+"\t"+str.length()+"\t");
					StringBuffer br = new StringBuffer(str);
					System.out.println(br.reverse());
				}
				
				System.out.println("****************************");
				
				//traversing Using Itertor 
				
				//forward traversal
				
				Iterator<String> itr = names.iterator();
				
				while(itr.hasNext())
				{
					String next = itr.next();
					System.out.println(next);
				}
				
				//backword Travarsal of ListIterator Of Collection
				
				System.out.println("*******************************");
				
				ListIterator<String> lst = names.listIterator(names.size());
				while(lst.hasPrevious())
				{
					String previous = lst.previous();
					System.out.println(previous);
				}
				
				
				System.out.println("************** For Each *****************");
				
				names.forEach(e ->{
				System.out.println(e);
				});
				
				
	}

}
