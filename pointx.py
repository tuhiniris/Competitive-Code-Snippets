# Python3 implementation of SPFA
from collections import deque

# Graph is stored as vector of vector of pairs
# first element of pair store vertex
# second element of pair store weight
graph = [[] for _ in range(100000)]

# Function to add edges in the graph
# connecting a pair of vertex(frm) and weight
# to another vertex(to) in graph
def addEdge(frm, to, weight):

	graph[frm].append([to, weight])

# Function to prshortest distance from source
def print_distance(d, V):
	print("Vertex","\t","Distance from source")

	for i in range(1, V + 1):
		print(i,"\t",d[i])

# Function to compute the SPF algorithm
def shortestPathFaster(S, V):

	# Create array d to store shortest distance
	d = [10**9]*(V + 1)

	# Boolean array to check if vertex
	# is present in queue or not
	inQueue = [False]*(V + 1)

	d[S] = 0

	q = deque()
	q.append(S)
	inQueue[S] = True

	while (len(q) > 0):

		# Take the front vertex from Queue
		u = q.popleft()
		inQueue[u] = False

		# Relaxing all the adjacent edges of
		# vertex taken from the Queue
		for i in range(len(graph[u])):

			v = graph[u][i][0]
			weight = graph[u][i][1]

			if (d[v] > d[u] + weight):
				d[v] = d[u] + weight

				# Check if vertex v is in Queue or not
				# if not then append it into the Queue
				if (inQueue[v] == False):
					q.append(v)
					inQueue[v] = True

	# Print the result
	print_distance(d, V)

# Driver code
if __name__ == '__main__':
	V = 3
	S = 1  # See this, S=1 (10) , S=2 (4) , S=3 (0)

	# Connect vertex a to b with weight w
	# addEdge(a, b, w)

	addEdge(1, 2, 6)
	addEdge(2, 3, 4)

	# Calling shortestPathFaster function
	shortestPathFaster(S, V)

# This code is contributed by mohit kumar 29

'''

3 2
1 2 6
2 3 4
1
3

'''
