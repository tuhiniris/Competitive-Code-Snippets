# MEMO :

# Log(math.log)
# Factorial
# Prime - Sieve of Erastosthenis
# Itertools,Functools,Collections,Re
# List Slow,Tuple Fast,Deque Fast Appends
# Set Operations - Union,Intersection...
# Search for "N" efficient code python
# log,ceil,floor,pow,abs,sqrt,gcd,round
# itertools - permutation,combination
# functools
# Time Complexity <<  Deque

# My CP Template

import sys
from collections import deque,defaultdict
from functools import wraps
from itertools import permutations

def inp():  # Single Input
	return(int(sys.stdin.readline()))

def sinp():  # STR Single Input
	return(str(sys.stdin.readline().strip()))	    
	
def invr():  # Multi Input Integers
	return(map(int,sys.stdin.readline().split()))
	
def mapper():  # Multi Input Strings
	return(map(str,sys.stdin.readline().split()))

def inlist():	 
	return(deque(map(int,sys.stdin.readline().split())))
	# reverse,appendleft,popleft

def memoize(function):    
    memo = {}        
    @wraps(function)
    def wrapper(*args):
        #print(memo)
        # add the new key to dict if it doesn't exist already  
        if args not in memo:
            memo[args] = function(*args)
        return memo[args]
    return wrapper

def def_value():
    return False

memo = defaultdict(def_value)
####################################################################

N,E = map(int,input().split())
for i in range(E):
	U,V,T = map(int,input().split())
	memo[(U),(V)]=T
R = int(input())
resturant = []
for i in range(R):
	resturant.append(int(input()))
	

print(memo)

		

####################################################################


'''
3 2
1 2 6
2 3 4
1
3

10
4
0


'''


####################################################################
# Output to File :
#sys.stdout = orig_stdout
#f.close()
