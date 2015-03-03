class Path {
	def edges = []

	def getDistance() {
		edges*.distance.sum() ?: 0
	}

	def getVertices() {
		if (edges.size() > 0) {
			return [edges[0].first] + edges[0..-1]*.second
		} else {
			return []
		}
	}
}
