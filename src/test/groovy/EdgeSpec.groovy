import spock.lang.*

class EdgeSpec extends Specification {

	@Shared vertexA
	@Shared vertexB
	@Shared edge

	void setup() {
		vertexA = new Vertex("A")
		vertexB = new Vertex("B")
		edge = new Edge(distance:10, first:vertexA, second:vertexB)
	}

	void "an edge should return its distance"() {
		assert edge.distance == 10
	}

	void "an edge should return its vertices"() {
		assert edge.first == vertexA
		assert edge.second == vertexB
	}
}
