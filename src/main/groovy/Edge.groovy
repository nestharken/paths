class Edge {
	int distance
	Vertex first
	Vertex second

	def other(vertex) {
		if (vertex == first) {
			return second
		} else if (vertex == second) {
			return first
		} else {
			return null
		}
	}
}
