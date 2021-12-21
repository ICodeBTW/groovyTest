package groovyTest;
import groovyTest.ParseTemplate;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemplateTest {

	@Test
	public void test() {
		int[] myNum = {10, 20, 30, 40};
		int[] yourNum = {10, 20, 30, 40};
		assertArrayEquals(myNum,yourNum);
	}

}
