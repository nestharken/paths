import spock.lang.*

class VertexSpec extends Specification {
	@Shared vertex

	void setup() {
		vertex = new Vertex("V")
	}

	void "a vertex should return its name"() {
		assert vertex.name == "V"
	}
}
