import java.util.*;
import java.text.DecimalFormat;

public class PNJ3 {

	public static boolean checkprime(int n){
		boolean flag = true;
		for(int i=2;i<=n;i++){
			if((n%i==0) && (i!=1) && (i!=n)){
				flag = false;
				break;
			}
		}
		return flag;
	}	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for(int i=2;i<=n;i++){
			if(checkprime(i)){
				System.out.print(i+" ");
			}
		}
			
	}	
}
