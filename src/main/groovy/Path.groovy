class Path {
	def edges = []

	def getDistance() {
		edges?.sum() ?: 0
	}
}
