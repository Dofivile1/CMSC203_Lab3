import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	private GradeBook grade1;
	private GradeBook grade2;

	@BeforeEach
	void setUp() throws Exception {
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		grade1.addScore(10.0);
		grade1.addScore(20.0);


		grade2.addScore(30.0);
		grade2.addScore(40.0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1=null;
		grade2=null;
	}

	@Test
	void testAddScore() {
		assertTrue(grade1.toString().equals("10.0 20.0 "));
		assertTrue(grade2.toString().equals("30.0 40.0 "));
		
		assertEquals(grade1.getScoreSize(),2);
		assertEquals(grade2.getScoreSize(),2);
	}

	@Test
	void testSum() {
		assertEquals(grade1.sum(),30.0);
		assertEquals(grade2.sum(),70.0);
		
	}

	@Test
	void testMinimum() {
		assertEquals(grade1.minimum(),10.0);
		assertEquals(grade2.minimum(),30.0);
	}

	@Test
	void testFinalScore() {
		assertEquals(grade1.finalScore(),20.0);
		assertEquals(grade2.finalScore(),40.0);
	}

	@Test
	void testGetScoreSize() {
	
	}

	@Test
	void testToString() {
		
	}

}
