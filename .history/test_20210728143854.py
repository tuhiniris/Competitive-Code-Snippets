def printLexicographicOrder(str, result=""):
	if len(result) == len(str):
		print(result, end=' ')
		return
	for c in str:
		printLexicographicOrder(str, result + c)

def findLexicographic(str):
	c = sorted(list(str))
	printLexicographicOrder(c)



str = "123"
findLexicographic(str)
