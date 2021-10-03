from copy import copy

word = list(str(input()))
other = word.copy()
other.reverse()

count = 0

for i in range(len(word)):
	if word[i]==other[i]:
		count+=1

print(count)


#alphxxdida		
	
