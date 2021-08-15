//https://sites.google.com/a/iemcal.com/cs504d-oop/labs

/*
DecimalFormat f = new DecimalFormat("#0.00");
double sum = nums.stream()
.mapToDouble(a -> a)
.sum();
System.out.println(sum);
*/

/*
list.add()
list.get(index)
list.set(index,ValuetoChange)
list.remove(index)
list.size()
list.contains(value)
Collections.sort(list)
*/


import java.util.*;
import java.text.DecimalFormat;

public class FibStyle {
	
static HashMap<Long,Long> memo = new HashMap<>();

	long fib(long n){
		if (n==1){
			return 1;
		}
		else if(n==0){
			return 0;
		}
		else{		
		if (memo.containsKey(n)){
			return memo.get(n);
		}
		else{
			memo.put(n,fib(n-1)+fib(n-2));
			return memo.get(n);
		}
	}
		
	}
	
	public static void main (String[] args) {
		FibStyle test = new FibStyle();
		System.out.println(test.fib(10));
		
}
}

