import spock.lang.*

class PathSpec extends Specification {

	@Shared vertexA
	@Shared vertexB
	@Shared vertexC
	@Shared edgeAB
	@Shared edgeBC
	@Shared path

	void setup() {
		vertexA = new Vertex("A")
		vertexB = new Vertex("B")
		vertexC = new Vertex("C")
		edgeAB = new Edge(first:vertexA, second: vertexB, distance: 3)
		edgeBC = new Edge(first:vertexB, second: vertexC, distance: 5)
		path.edges.add(edgeAB)
		path.edges.add(edgeBC)
	}

	void "a path should return the correct total distance"() {
		assert path.distance == 8
	}

	void "a path should return the correct vertices"() {
		assert path.vertices == [vertexA, vertexB, vertexC]
	}
}
