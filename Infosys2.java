// 14

import java.util.*;

public class Infosys2 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.next();

		String []arr= str.split("");
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
		 item= "D";
		while(i<n && j<n)
		{
			if(item.equals("D"))
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
			
			else if(!arr[i].equals(item) && !arr[j].equals(item))
			{
				i++; j++;
			}
				
			}
		else if(item.equals("A"))
		{
			int x=0;
			for(int w=a+1; w<b; w++)
			{
				if(arr[w].equals("A"))
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
