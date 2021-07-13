// 30+

import java.util.*;
public class Infosys5{

public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String str= sc.next();
		String []strSplit= str.split("");
		ArrayList <String> list = new ArrayList <String>(
		 Arrays.asList(strSplit));
		 ListIterator <String> it= list.listIterator();
		 int count=0;
		 while(it.hasNext())
		 {
		     String fv= it.next();
			 if(fv.equals("M")||fv.equals("D"))
			 {
				int i= it.nextIndex(); 
				
				for(int j=i; j<list.size(); j++)
				 {
					 if(fv.equals("M") && list.get(j).equals("O")||fv.equals("D") && list.get(j).equals("A"))
					 {
						 int w= j+1;
					//	for(int w=j+1; w<list.size(); w++ )
						while(w<list.size())
						 {
							 if(fv.equals("M") && list.get(w).equals("M") || fv.equals("D") && list.get(w).equals("D"))
							 {
								 count++;
							 }
							w++;
						 }
					 }
				 } 
			 }
		
		 }

		System.out.println(count);
	}
}
