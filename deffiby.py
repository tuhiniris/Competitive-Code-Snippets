def factorial(n):
    if n==0 or n==1:
        return n
    else:
        return n*factorial(n-1)

memo = {0:0,1:1}

def fibonacci(n):
    global memo
    if n in memo:
        return memo[n]
    else:
        memo[n] = fibonacci(n-1)+fibonacci(n-2)
        return memo[n]

def checkprime(n):
    flag = True
    for i in range(1,n+1):
        if n%i==0 and i!=1 and i!=n:
            flag = False
            break
    return flag    
        
print(factorial(5)) 
print(fibonacci(9))
print(checkprime(8))
