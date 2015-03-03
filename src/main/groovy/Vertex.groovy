class Vertex {
	String name
	def edges = []

	Vertex(name) {
		this.name = name
	}

	def findPathTo(def destination, def previous = null) {
		def path
		for (edge in edges) {
			def other = edge.other(this)
			if (other == destination) {
				path = new Path()
			} else if (other != previous) {
				path = other.findPathTo(destination, this)
			}
			if (path != null) {
				path.edges = [edge] + path.edges
				return path
			}
		}
	}
}
