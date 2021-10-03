import java.util.*;
import java.text.DecimalFormat;

public class PNJ2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int[] energies = new int[N];
		for(int i=0;i<N;i++){
			energies[i] = sc.nextInt();
		}
		testEnergy(N,energies);
		sc.close();	
}

	private static void testEnergy(int N, int[]energies){
		int counts = 0;
		int flag = 1;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<N;i++){
			arr.add(energies[i]);
		}
		//System.out.println(arr);
		try{
		while(flag==1){			
			try{
			for(int i=0;i<arr.size();i++){
				if(arr.get(i+1)>arr.get(i)){
					arr.remove(i+1);
				}
			//System.out.println(arr);	
			}
		}
		catch(Exception e){
				for(int i=0;i<arr.size();i++){
					if(arr.get(i+1)>arr.get(i)){
						arr.remove(i+1);
				}
			//System.out.println(arr);	
			}
			counts++;
		}
		finally{
			counts++;
		}			
		}
	}
	catch(Exception e){
		flag = 0;
	}
	finally{
		System.out.println(counts-1);
	}		
	}
}


/*
7
10 4 22 9 5 11 8
*/
