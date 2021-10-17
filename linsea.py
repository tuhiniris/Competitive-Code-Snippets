n=int(input())
y=int (input())
x=list (map (int, input().split()))
for i in range (len(x)):
	if y<=x[i]:
		s=i-1
		x1=x[:s]
	if s+1==len(x):
		x2=x[s]
	else:
		x2=x[s:]
		c=0
	for j in x1:
		c=c+j S=C
		for z in range (len(x2)-1):
			if y>x2[z]:
				a=x2[z]
			else:
				a=y
				s=s+a
print (s+x[-1])
