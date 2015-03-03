import spock.lang.*

class VertexSpec extends Specification {
	@Shared vertexA
	@Shared vertexB
	@Shared vertexC
	@Shared vertexD
	@Shared edgeAB
	@Shared edgeAC
	@Shared edgeBD

	void setup() {
		vertexA = new Vertex("A")
		vertexB = new Vertex("B")
		vertexC = new Vertex("C")
		vertexD = new Vertex("D")
		edgeAB = new Edge(first:vertexA, second: vertexB, distance: 3)
		edgeAC = new Edge(first:vertexA, second: vertexC, distance: 5)
		edgeBD = new Edge(first:vertexB, second: vertexD, distance: 6)
		vertexA.edges.add(edgeAB)
		vertexB.edges.add(edgeAB)
		vertexA.edges.add(edgeAC)
		vertexC.edges.add(edgeAC)
		vertexB.edges.add(edgeBD)
		vertexD.edges.add(edgeBD)
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

	def "a vertex should be able to find a path"() {
		when:
			setup()
			def foundPath = vertexA.findPathTo(vertexD)
		then:
			foundPath.edges == [edgeAB, edgeBD]
	}
}
