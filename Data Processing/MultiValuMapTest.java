package Unity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MultiValuMapTest {
	@Test
	public void valuesCheckTest(){
		MultiValueMap mvp = new MultiValueMap();
		mvp.add("1", "1");
		mvp.add("1", "2");
		mvp.add("1", "4");
		mvp.add("2", "1");
		mvp.print();
	}
	
	@Test
	public void nullValuesCheckTest(){
		MultiValueMap mvp = new MultiValueMap();
		mvp.add(null, null);
		mvp.add("1", "2");
		mvp.add("1", "4");
		mvp.add("2", "1");
		mvp.print();
	}
}
