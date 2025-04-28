package DemoQA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set__ {

	public static void main(String[] args) {
	
		
			Set<Integer> as = new HashSet<>();  
			
			as.add(67);   //0
			as.add(78);  //1
			as.add(89);  //2
			as.add(90);
			as.add(91);
			
			
			//Not maintauned insertion order
			System.out.println("Set elements:" +as);    
			
			
		/*	for(int h : as) {
				
				System.out.println(h);
			}
			*/
			//By using iterator
			
			Iterator<Integer> itr = as.iterator();
			
			while(itr.hasNext()) {        
				
				System.out.println(itr.next());   
			}
			
			System.out.println(as.size());
			
			System.out.println(as.contains(90));
			
			
			
			
			//HashSet<Integer> as1 = new HashSet<>();   
			
			
		
		
		
		
		

	}

}
