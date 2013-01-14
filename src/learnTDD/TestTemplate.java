package learnTDD;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*; 


public class TestTemplate {

	private Template template;
	
	@Before
	public void setUp() throws Exception
	{
		template = new Template("${one}, ${two}, ${three}");
		template.set("one", "1");
		template.set("two", "2");
		template.set("three", "3");
	}
	
	@Test
	public void multipleVariables() throws Exception
	{
		assertTemplateEvaluatesTo("1, 2, 3");
	}
	
	@Test
	public void unknownVariablesAreIgnored() throws Exception
	{
		template.set("doesnotexist", "whatever");
		assertTemplateEvaluatesTo("1, 2, 3");
	}
	
	@Test
	public void missingValueRaisesException() throws Exception
	{
		try 
		{
			new Template("${foo}").evaluate();
			fail("evaluate() should throw and exception if "
					+ "a variable was left without a value!");
		} catch (MissingValueException expected) {
			assertEquals("No value for ${foo}",
					expected.getMessage());
		}
	}
	
	private void assertTemplateEvaluatesTo(String expected)
	{
		assertEquals(expected, template.evaluate());
	}
	
}


