x = list(str(input()))
x.sort()
flag = 0
while(flag == 0):
	if x[0]=='0':
		x.pop(0)
	else:
		flag = 1


print("".join(x))			
