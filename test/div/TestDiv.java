package div;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDiv {

	@Test
	public void testDiv1() {
		assertEquals(4, Dividir.div(8,2));
	}


	@Test
	public void testDiv2() {
		assertEquals(1, Dividir.div(2,2));
	}

	
	@Test
	public void testDiv3() {
		assertEquals(10, Dividir.div(100, 10));
	}
}
