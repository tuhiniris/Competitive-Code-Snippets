def facto(n):
	if n==1 or n==2:
		return n
	else:
		return n*facto(n-1)	
		
print(facto(10))
