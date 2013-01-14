package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testsNormalName() 
	{
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}
	@Test
	public void testsNormalSpaced() 
	{
		Person p = new Person();
		String input = " Dereck Robert Yssirt ";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}
	@Test
	public void testsNormalLongSpace() 
	{
		Person p = new Person();
		String input = "Dereck  Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}

}


/** 
 *
import org.junit.*;
import static org.junit.Assert.*;
public class PersonTest {
@Test
public void testsNormalName() {
Person p = new Person();
String input = "Dereck Robert Yssirt";
String output = p.getInitials(input);
String expected = "DRY";
assertEquals(output, expected);
}
}
 * 
 * 
 * 
 * 
 * 
 * */
