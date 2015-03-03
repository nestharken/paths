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

	def "an edge should return its distance"() {
		when:
			setup()
		then:
			edge.distance == 10
	}

	def "an edge should return its vertices"() {
		when:
			setup()
		then:
			edge.first == vertexA
			edge.second == vertexB
	}
}
