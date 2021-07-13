// 11

import java.util.*;
public class Infosys4{

public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String str= sc.next();
		String []strSplit= str.split("");
		ArrayList <String> list = new ArrayList <String>(
		 Arrays.asList(strSplit));
		 
		 ListIterator <String> itr= list.listIterator();
		 int count=0;
		 ArrayList <String> list2 = new ArrayList <String>();
		
		 while(itr.hasNext())
		 {
			 String dd= itr.next();
			 if(dd.equals("D") || dd.equals("A") )
			 {
				 
				 itr.remove();
				 list2.add(dd);
			 }
		 }
		 ListIterator <String> it= list.listIterator();
		   ListIterator <String> tr= list2.listIterator();
		   System.out.println(list2);
		   System.out.println(list);
		 while(it.hasNext())
		 {
		     String fv= it.next();
			 if(fv.equals("M"))
			 {
				int i= it.nextIndex(); 
				for(int j=i; j<list.size(); j++)
				 {
					 if(list.get(j).equals("O"))
					 {
						 
						 int w= j+1;
					//	for(int w=j+1; w<list.size(); w++ )
						while(w<list.size())
						 {
							 if(list.get(w).equals("M"))
							 {
								 count++;
							 }
							w++;
						 }
					 }
				 } 
			 }
		
		 }
		 int cont=0;
		  while(tr.hasNext())
		 {
		     String jb= tr.next();
			 if(jb.equals("D"))
			 {
				int y= tr.nextIndex(); 
				
				for(int p=y; p<list2.size(); p++)
				 {
					 if(list2.get(p).equals("A"))
					 {
						 int v= p+1;
					//	for(int w=j+1; w<list.size(); w++ )
						while(v<list2.size())
						 {
							 if(list2.get(v).equals("D"))
							 {
								 cont++;
							 }
							v++;
						 }
					 }
				 } 
			 }
		
		 }

		System.out.println(count+cont);
	}
}
