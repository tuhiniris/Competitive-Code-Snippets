# Python3 program to implement the
# above approach

# Stores the factors of i-th
# element in v[i]
vp = [[] for i in range(2009)]

# Function to find all the
# factors of N
def finding_factors(n):
	
	i = 1
	a = 0
	
	global vp

	# Iterate upto sqrt(N)
	while (i * i <= n):
		if (n % i == 0):
			if (i * i == n):
				vp[n].append(i)
			else:
				vp[n].append(i)
				vp[n].append(int(n / i))
				
		i += 1

# Function to return the count of
# sequences of length K having
# all terms divisible by its
# preceding term
def countSeq(N, K):
	
	i = 0
	j = 0
	k = 0

	dp = [[0 for i in range(109)]
			for j in range(109)]

	for i in range(1, N + 1):
		
		# Calculate factors of i
		finding_factors(i)

		# Initialize dp[0][i] = 0: No
		# subsequence of length 0 ending
		# with i-th element exists
		dp[0][i] = 0
		
		# Initialize dp[0][i] = 1: Only 1
		# subsequence of length 1 ending
		# with i-th element exists
		dp[1][i] = 1

	# Iterate [2, K] to obtain sequences
	# of each length
	for i in range(2, K + 1):
		for j in range(1, N + 1):
			
			# Calculate sum of
			# all dp[i-1][vp[j][k]]
			Sum = 0

			for k in range(len(vp[j])):
				
				# vp[j][k] stores all factors
				# of j
				Sum += dp[i - 1][vp[j][k]]
				
			# Store the sum in A[i][j]
			dp[i][j] = Sum

	ans = 0
	for j in range(1, N + 1):
		
		# Sum of all dp[K][j] obtain all
		# K length sequences ending with j
		ans += dp[K][j]

	return ans

# Driver code
N = 5
K = 4

print(countSeq(N, K))
