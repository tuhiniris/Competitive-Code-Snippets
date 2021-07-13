def finder(test_list,k):
	if k in test_list:
		return(k)
	else:	
		min_val = min(filter(lambda i: i > k, test_list))	
		return(min_val)	

def summer(arr,k):
	diff = len(arr)-k
	newtemp = 0
	for i in range((len(arr)-diff)):
		newtemp+=arr[i]		
	return(newtemp)		


N,E = map(int,input().split())
startingpoint = [i for i in range(1,N+1)]
distances = []
times = []
for i in range(E):
	U,V,T = map(int,input().split())
	distances.append([U,V])
	times.append(T)

R = int(input())
points = list(map(int,input().split()))

#print(startingpoint)
#print(distances)
#print(times)
#print(points)


for i in range(len(startingpoint)):	
	destination = finder(points,startingpoint[i])
	#print("Reach : ",destination)
	
	ans = 0
	milestone = 0
	dun = []
	for j in range(len(distances)):		
		if (destination not in distances[j])and(startingpoint[i]!=distances[j][1]):
			#print("J is : ",j)
			ans+=times[j]
		elif (startingpoint[i]==distances[j][1]):
			ans=0	
		else:	
			dun.append(j)
	
	#print(dun)
	try:
		print(ans+(times[dun[-1]]))
	except:
		print(0)	
		


		
		

'''
3 2
1 2 6
2 3 4
1
3

10
4
0

3 2
1 2 6
2 3 4
2
3 2

10
4
0
'''
