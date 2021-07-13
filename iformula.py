n = 3
k = 2
import math

arr = [i for i in range(1,n+1)]
print(arr)

# n(5) = 10, because 5 + floor(5/2) + floor(5/3) + floor (5/4) + 1
# https://oeis.org/A006218

logger = [i for i in range(k,n)]

incr = 0
for i in range(len(logger)):
	incr = incr + (math.floor(n//logger[i]))
	
print(incr+n+1)

'''
3
2
5
a(n) = Sum_{k=1..n} floor(n/k)
'''
