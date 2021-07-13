// 7

import java.util.*;

public class Infosys3 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String mmm= sc.next();
		String mmm2= mmm.replaceAll("D","");
		String str= mmm2.replaceAll("A","");
		String ppp2= mmm.replaceAll("M","");
		String str2= ppp2.replaceAll("O","");
         
		String []arr= str.split("");
		String []arr2= str2.split("");
		
		int n= str.length();
		int i=0, j=1, a=0, b=0, y=0;
		
		String item= "M";
		while(i<n && j<n)
		{
			if(item.equals("M"))
			{
				
			if(arr[i].equals(item) || arr[j].equals(item))
			{
				if(arr[i].equals(item) && !arr[j].equals(item))
				{
                      
					if(j<n-1)
					{
				
						j++;
					}
					else
					{
						i++;
						j=i+1;
					}
				}
				else if(!arr[i].equals(item) && arr[j].equals(item))
				{
					i++; j++;
				}
				else if(arr[i].equals(item) && arr[j].equals(item))
				{
					item= "O";
					a=i; b=j;
				    if(j==n-1 && i!=j)
				    {
						i++;
						j=i+1;
					}
					else if(j<n-1)
					{
						j++;
					}
					 
				}
				}
			
			else if(!arr[i].equals(item) && !arr[j].equals(item))
			{
				i++; j++;
			}
				
			}
		else if(item.equals("O"))
		{
			int x=0;
			for(int w=a+1; w<b; w++)
			{
				if(arr[w].equals("O"))
				{
				x++;
			}
			}
			y= x+y;
			item= "M";

			
		}
		
			
		}
		 i=0; j=1; a=0; b=0;
		 int z=0;
		 n=str2.length();
		 
		 item= "D";
		while(i<n && j<n)
		{
			if(item.equals("D"))
			{
				
			if(arr2[i].equals(item) || arr2[j].equals(item))
			{
				if(arr2[i].equals(item) && !arr2[j].equals(item))
				{
                      
					if(j<n-1)
					{
				
						j++;
					}
					else
					{
						i++;
						j=i+1;
					}
				}
				else if(!arr2[i].equals(item) && arr2[j].equals(item))
				{
					i++; j++;
				}
				else if(arr2[i].equals(item) && arr2[j].equals(item))
				{
					item= "A";
					a=i; b=j;
				    if(j==n-1 && i!=j)
				    {
						i++;
						j=i+1;
					}
					else if(j<n-1)
					{
						j++;
					}
					 
				}
				}
			
			else if(!arr2[i].equals(item) && !arr2[j].equals(item))
			{
				i++; j++;
			}
				
			}
		else if(item.equals("A"))
		{
			int x=0;
			for(int w=a+1; w<b; w++)
			{
				if(arr2[w].equals("A"))
				{
				x++;
			}
			}
			z= x+z;
			item= "D";

			
		}
		
			
		}
			System.out.println(y+z);
		
	}
}
