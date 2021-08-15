memo = {1:1,0:0}

def fib(n):
	if n not in memo:
		memo[n] = fib(n-1)+fib(n-2)
		return memo[n]
	else:
		return memo[n]

print(fib(1
0))
print(memo)
