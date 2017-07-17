package Unity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StringReverseTest {
	@Test
	public void nullCheckTest(){
		String str = null;
		stringReverse sr = new stringReverse();
		assertEquals(sr.reverseString(str), null);
	}
	
	@Test
	public void lengthZeroCheckTest(){
		String str = "";
		stringReverse sr = new stringReverse();
		assertEquals(sr.reverseString(str), "");
	}
	
	@Test
	public void stringReverseCheckTest(){
		String str = "abc";
		stringReverse sr = new stringReverse();
		assertEquals(sr.reverseString(str), "cba");
	}
	
	@Test
	public void stringWithSpacesCheckTest(){
		String str = "abc d";
		stringReverse sr = new stringReverse();
		assertEquals(sr.reverseString(str), "d cba");
	}
}
