import static org.junit.Assert.*;

import org.junit.Test;

public class IterativeTest {

	@Test
	public void test() {
		Iterative test= new Iterative();
		float[][] a ={{1,2,3},{1,2,3}};
		float[][] b={{1,1},{2,2},{3,3}};
		float[][] c={{14,14},{14,14}};
		
		assertEquals(c,test.multiply(a, b));
	}
	
	@Test
	public void test1(){
		Iterative test=new Iterative();
		float[][] a ={{1,2,3},{1,2,3}};
		float[][] b={{1,1},{2,2}};
		assertNull(test.multiply(a, b));
	}

}
