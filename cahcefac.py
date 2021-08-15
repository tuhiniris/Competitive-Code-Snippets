memo = {}

def factorial(n):
	if n<=1:
		return 1
	else:
		if n not in memo:
			memo[n] = n*factorial(n-1)
			return memo[n]
		else:
			return memo[n]	

print(factorial(50))
print(memo)
