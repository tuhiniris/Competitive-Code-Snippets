from queue import PriorityQueue
INF = int(0x3f3f3f3f)

# This class represents a directed graph using
# adjacency list representation
class Graph:
	def __init__(self, V: int) -> None:

		self.V = V
		# No. of vertices

		# In a weighted graph, we need to store vertex
		# and weight pair for every edge
		self.adj = [[] for _ in range(V)]
	def addEdgeRev(self, u: int, v: int, w: int) -> None:
		self.adj[v].append((u, w))

	# Prints shortest distance from all vertex to
	# the given destination vertex
	def shortestPath(self, dest: int) -> None:

		# Create a priority queue to store vertices that
		# are being preprocessed. This is weird syntax in C++.
		# Refer below link for details of this syntax
		# https:# www.geeksforgeeks.org/implement-min-heap-using-stl/
		pq = PriorityQueue()

		# Create a vector for distances and initialize all
		# distances as infinite (INF)
		dist = [INF for _ in range(V)]

		# Insert destination itself in priority queue and initialize
		# its distance as 0.
		pq.put((0, dest))
		dist[dest] = 0

		# Looping till priority queue becomes empty (or all
		# distances are not finalized) */
		while not pq.empty():

			# The first vertex in pair is the minimum distance
			# vertex, extract it from priority queue.
			# vertex label is stored in second of pair (it
			# has to be done this way to keep the vertices
			# sorted distance (distance must be first item
			# in pair)
			u = pq.get()[1]

			# 'i' is used to get all adjacent vertices of a vertex
			for i in self.adj[u]:

				# Get vertex label and weight of current adjacent
				# of u.
				v = i[0]
				weight = i[1]

				# If there is shorted path to v through u.
				if (dist[v] > dist[u] + weight):
					
					# Updating distance of v
					dist[v] = dist[u] + weight
					pq.put((dist[v], v))

		# Print shortest distances stored in dist[]
		#print("Destination Vertex Distance from all vertex")
		answers = []
		for i in range(V):
			print(dist[i])




N,E = map(int,input().split())
V = N
g = Graph(V)
for i in range(E):
	U,V,T = map(int,input().split())
	g.addEdgeRev(U-1, V-1, T)

R = int(input())
points = []
for i in range(R):
	points.append(int(input()))
	
answers = []
for i in range(R):
	(g.shortestPath(sum(points)//len(points)-1))
#print(answers)

'''
3 2
1 2 6
2 3 4
1
3
'''
