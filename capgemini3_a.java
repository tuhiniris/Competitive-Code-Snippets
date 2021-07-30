/*
 * capgemini3.java
 * 
 * Copyright 2021 Kajal <Kajal@DESKTOP-MK9EA90>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.*;

public class capgemini3_a {
		static HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		static int i, j;
		static void funct(int arr[][], int arr2[], int x, int e)
		{
			list.put(x, 0);
			while(x!=1)
			{ for(i=0; i<e; i++)
			{
				if(arr[i][1]==x)
				{
					if(list.containsKey(arr[i][0]))
					{
						if(list.get(arr[i][0])>(arr2[i]+list.get(x)) )
						{
							list.put(arr[i][0], arr2[i]+list.get(x));
						}
						
					}
					else
					{
						list.put(arr[i][0], arr2[i]+list.get(x));
					}
				} 
				
			} x=x-1; 
			 }	
			 

		}
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
	 
		int e= sc.nextInt();
		int arr[][]= new int[e][2];
		int arr2[]= new int[e];
		for(i=0; i<e; i++)
		{
			for(j=0; j<2; j++)
			{
				arr[i][j]= sc.nextInt();
			}
			arr2[i]= sc.nextInt();
		}

		int r= sc.nextInt();
		int count=0;
		for(int w=0; w<r; w++)
		{
			
			int x= sc.nextInt();
			funct(arr, arr2, x, e);
		}
		for (Integer j : list.keySet()) 
		{
			System.out.println( j + " : " + list.get(j));
		}
	
	}
}

/*
5 6
1 2 1
1 4 1
1 3 2
3 4 1
4 5 1
2 5 2
3
1
*
4 3
1 2 6
2 3 4
3 4 5
3
1 2 4
*

8 7
1 2 1
2 3 1
3 4 2
4 5 1
5 6 1
6 11 2
11 16 7
4
1 6 11 16




*/
