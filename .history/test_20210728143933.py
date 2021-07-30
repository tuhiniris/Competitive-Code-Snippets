arr = []
def printLexicographicOrder(str, result=""):
	if len(result) == len(str):
		arr.append(result)
		return
	for c in str:
		printLexicographicOrder(str, result + c)

def findLexicographic(str):
	c = sorted(list(str))
	printLexicographicOrder(c)



str = "123"
findLexicographic(str)
print(arr)
