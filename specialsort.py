def stoogesort(arr, l, h):
	if l >= h:
		return
	if arr[l]>arr[h]:
		arr[l],arr[h]=arr[h],arr[l]
		
	if (h-l+1>2):
		t = (h-l + 1)//3
		stoogesort(arr,l,(h-t))
		stoogesort(arr,l+t,(h))
		stoogesort(arr,l,(h-t))

arr = [9,7,2,1,3,5,1,11,20,21,56,79]
stoogesort(arr, 0, len(arr)-1)
print(*arr)
