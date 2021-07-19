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
		print("Destination Vertex Distance from all vertex")
		for i in range(V):
			print("{} \t\t {}".format(i, dist[i]))

# Driver code
if __name__ == "__main__":

	# create the graph given in above figure
	V = 5
	g = Graph(V)

	# adding edges in reverse direction
	g.addEdgeRev(0, 2, 1)
	g.addEdgeRev(0, 4, 5)
	g.addEdgeRev(1, 4, 1)
	g.addEdgeRev(2, 0, 10)
	g.addEdgeRev(2, 3, 5)
	g.addEdgeRev(3, 1, 1)
	g.addEdgeRev(4, 0, 5)
	g.addEdgeRev(4, 2, 100)
	g.addEdgeRev(4, 3, 5)

	g.shortestPath(0)

# This code is contributed by sanjeev2552
