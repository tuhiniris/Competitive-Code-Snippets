public class test
{	
	static int ans = 0;	
	public static void subSequences(int[] result,int start, int count, int n, int k)
	{
		if (count == k)
		{
			ans++;
		}
		else if (count >= k)
		{
			return;
		}
		else
		{
			for (int i = start; i <= n; ++i)
			{
				// Collect elements 
				result[count] = i;
				if (count == 0 || 
                    (count > 0 && (result[count] % result[count - 1]) == 0))
				{
					subSequences(result, i, count + 1, n, k);
				}
			}
		}
	}
	// Handles the request to find resultant subsequences
	public static void findSequence(int n, int k)
	{
		if (n <= 0)
		{
			return;
		}
		// Auxiliary array which is collect result
		int[] result = new int[k];
		subSequences(result,1,0,n,k);
	}
	public static void main(String[] args)
	{
		int n = 3;
		int k = 5;		
		findSequence(n,k);
		System.out.println(ans%10000);
	}
}
