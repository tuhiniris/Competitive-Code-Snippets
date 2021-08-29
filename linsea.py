arr = [2,5,1,8,9,11]
key = 2
for i in range(len(arr)):
	for j in range(len(arr)):
		if (arr[j]==key):
			print("The Location is at Index :",j)
			break
	break
