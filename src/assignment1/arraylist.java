package assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("ashwa");
		a.add("saideep");
		a.add("shashi");
		a.add("ashwa");
	    Set<String> s = new HashSet<>();
	    
	    for(String name : a)
	    {
	    	if(s.add(name)==false)
	    	System.out.println(name);
	    }
	}
}
