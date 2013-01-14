package tests;

public class Person {

	/**
	 * The method getInitials(String) has a bug! If you introduce 
	 * a name with more than one space between words, it throws an exception.
	 * Create a class that contains the method getInitials(String) 
	 * as described in the notes. Create also the test
	 * class as described in the notes. Then follow the “find bugs once” 
	 * algorithm: reproduce the bug manually, reproduce the bug programmatically
	 * by adding a new test to the testing class, then fix 
	 * the bug and check that all tests pass.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		String fullname = "Alice  Lewisa";
		System.out.println(" " + person.getInitials(fullname));
	}
	
	public String getInitials(String fullName) {
		String result = "";
		fullName = fullName.trim();
		String[] words = fullName.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			//System.out.println(words[i].length());
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
		}
		return result;
	}
}
