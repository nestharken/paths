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
		path = new Path()
		path.edges.add(edgeAB)
		path.edges.add(edgeBC)
	}

	def "a path should return the correct total distance"() {
		when:
			setup()
		then:
			path.distance == 8
	}

	def "a path should return the correct vertices"() {
		when:
			setup()
		then:
			path.vertices == [vertexA, vertexB, vertexC]
	}
}
