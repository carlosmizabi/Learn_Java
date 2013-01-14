package learnTDD;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTemplatePerformance {

	// Ommited the setUp() for creating a 100-word template
	// with 20 variables and populating it with approximately
	// 15-character values
	
	@Test
	public void templateWith100WordsAnd20Variables() throws Exception
	{
		long expected = 200L;
		long time = System.currentTimeMillis();
		//template.evaluate();
		time = System.currentTimeMillis() - time;
		assertTrue("Rendering the template took " + time
				+ "ms while the target was " + expected +
				"ms", time <= expected);
	}

}
