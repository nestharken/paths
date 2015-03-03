import spock.lang.*

class VertexSpec extends Specification {
	@Shared vertexA
	@Shared vertexB
	@Shared vertexC
	@Shared edgeAB
	@Shared edgeAC


	void setup() {
		vertexA = new Vertex("A")
		vertexB = new Vertex("B")
		vertexC = new Vertex("C")
		edgeAB = new Edge(first:vertexA, second: vertexB, distance: 3)
		edgeAC = new Edge(first:vertexA, second: vertexC, distance: 5)
		vertexA.edges.add(edgeAB)
		vertexA.edges.add(edgeAC)
	}

	def "a vertex should return its name"() {
		when:
			setup()
		then:
			vertexA.name == "A"
	}

	def "a vertex should return its edges"() {
		when:
			setup()
		then:
			vertexA.edges.contains(edgeAB)
			vertexA.edges.contains(edgeAC)
			vertexA.edges.size == 2
	}
}
