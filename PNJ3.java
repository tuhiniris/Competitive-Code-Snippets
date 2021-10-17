import java.util.*;
import java.text.DecimalFormat;

public class PNJ3 {

	PNJ3(int a,int b){
		System.out.println(a+b);
	}

	boolean checkprime(int n){
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
		PNJ3 hello = new PNJ3(0,0);
		int n = sc.nextInt();
		for(int i=2;i<=n;i++){
			if(hello.checkprime(i)){
				System.out.print(i+" ");
			}
		}			
	}	
}
