word = "MOMODAAMAD"
arr = list(word)
momlist = []
dadlist = []
for i in range(len(word)):
	if arr[i]=="M" or arr[i]=="O":
		momlist.append(arr[i])
	else:
		dadlist.append(arr[i])	
	
print(arr,"\n")
print(momlist,"\n")
print(dadlist,"\n")

leftpivot = 0
rightpivot = 0




