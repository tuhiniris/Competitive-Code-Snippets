arr = []

def isgolden(s):
	word = list(s) #Count for >=3 letters
	letters = list(set(word)) #Count for 2 letters but ordered
	if((len(word)>=3) and (len(letters)==2) and (((word.count(letters[0])>len(word)//3) and (word.count(letters[1])==(len(word))-word.count(letters[0]))) or ((word.count(letters[1])>len(word)//3) and (word.count(letters[0])==(len(word))-word.count(letters[1]))))):
		return True
	else:
		return False	
		

def printAllSubstrings(s, n):
	for i in range(n):
		temp=""
		for j in range(i,n):
			temp+=s[j]
			arr.append(temp)

s = str(input())
printAllSubstrings(s,len(s))
ans = 0
for i in range(len(arr)):
	x = (isgolden(arr[i]))
	print(x)
	if (x==True):
		ans = 1
		break
	
#print(arr)
	
if (ans==1):
	print(1)
else:
	print(0)	
