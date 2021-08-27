class SpiralView :
	def spiral(self, data, startRow, startCol, endRow, endCol, element) :
		i = startCol
		while (i <= endCol and element > 0) :
			element -= 1
			print(" ", data[startRow][i], end = "")
			i += 1
		
		i = startRow + 1
		while (i <= endRow and element > 0) :
			element -= 1
			print(" ", data[i][endCol], end = "")
			i += 1
		
		i = endCol - 1
		while (i >= startCol and element > 0) :
			element -= 1
			print(" ", data[endRow][i], end = "")
			i -= 1
		
		i = endRow - 1
		while (i > startRow and element > 0) :
			element -= 1
			print(" ", data[i][startRow], end = "")
			i -= 1
		
		if (startRow + 1 <= endRow - 1 and element > 0) :
			self.spiral(data, startRow + 1, startCol + 1, 
						endRow - 1, endCol - 1, element)
		
	
task = SpiralView()
matrix = [
    [1, 2, 3, 4, 5, 6],
    [22, 23, 24, 25, 26, 7],
    [21, 36, 37, 38, 27, 8],
    [20, 35, 42, 39, 28, 9],
    [19, 34, 41, 40, 29, 10],
    [18, 33, 32, 31, 30, 11],
    [17, 16, 15, 14, 13, 12]
]
row = len(matrix)
col = len(matrix[0])
element = row * col
task.spiral(matrix, 0, 0, row - 1, col - 1, element)

