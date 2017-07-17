package Unity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FIFOTest {
	@Test
	public void nullValuesCheckTest(){
		FIFO<Integer> fifoObject = new FIFO<Integer>();
		fifoObject.enqueue(null);
		fifoObject.enqueue(null);
		assertEquals(fifoObject.dequeue(), null);
	}
	
	@Test
	public void isEmptyNullValuesCheckTest(){
		FIFO<Integer> fifoObject = new FIFO<Integer>();
		fifoObject.enqueue(null);
		fifoObject.enqueue(null);
		assertEquals(fifoObject.isEmpty(), false);
	}
	
	@Test
	public void dequeueCheckTest(){
		FIFO<Integer> fifoObject = new FIFO<Integer>();
		fifoObject.enqueue(1);
		fifoObject.enqueue(2);
		assertEquals(fifoObject.dequeue(), new Integer(1));
	}
}