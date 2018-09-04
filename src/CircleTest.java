import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTest {

	@Test
	public void testRadius() {
		double epsilon = 1e-10;
		assertEquals("Circle.radius returned incorrect result", 0.0,Circle.radius(5,5,5,5), epsilon);
		assertEquals("Circle.radius returned incorrect result", 5, Circle.radius(3,4,0,0), epsilon);
		assertEquals("Circle.radius returned incorrect result", 13.19669493661197, Circle.radius(5.0285,1.055,5.24,14.25), epsilon);
		assertEquals("Circle.radius returned incorrect result", 63.97655820689325, Circle.radius(0,47,58,20), epsilon);
	}
	
}