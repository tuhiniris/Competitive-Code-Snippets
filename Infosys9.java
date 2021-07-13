import java.util.*;

public class Infosys9 {
   static int r, t=0, m=0, e=0, v=0, q=0;
	static long x=0, g=0;
		public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.next();

		String []arr= str.split("");
		int n= str.length();
		int i=0, j=1, a=0, b=0;
		long y=0;
		
		String item= "M";
		while(i<n && j<n)
		{
			if(item.equals("M"))
			{
				
			if(arr[i].equals(item) || arr[j].equals(item))
			{
				if(arr[i].equals(item) && !arr[j].equals(item))
				{
                      
					if(j<n-1L)
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
			
			if(a==t && m+1!=b)
			{
				r=m+1;
				
			}
			else {
				r=a+1;
			 x=0;
		 }
			for(int w= r; w<b; w++)
			{
				if(arr[w].equals("O"))
				{
				x++;
			}
			 t=a;  m=b;
			}
			y= x+y;
			item= "M";

			
		}
		
			
		}
		 i=0; j=1; a=0; b=0;
		 long z=0;
		 item= "D";
		while(i<n && j<n)
		{
			if(item.equals("D"))
			{
				
			if(arr[i].equals(item) || arr[j].equals(item))
			{
				if(arr[i].equals(item) && !arr[j].equals(item))
				{
                      
					if(j<n-1L)
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
				    if(j==n-1L && i!=j)
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
			if(a==e && q+1!=b)
			{
				v=q+1;
				
			}
			else {
				v=a+1;
			 g=0;
		 }
			
			for(int w=v; w<b; w++)
			{
				if(arr[w].equals("A"))
				{
				g++;
			}
			 e=a;  q=b;
			}
			z= g+z;
			item= "D";

			
		}
		
			
		}
			System.out.println(y+z);
		
	}
}
