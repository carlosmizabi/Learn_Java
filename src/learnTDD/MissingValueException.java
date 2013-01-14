package learnTDD;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MissingValueException extends RuntimeException{

	public MissingValueException(String message)
	{
		super(message);
	}
	private void checkForMissingValues(String result)
	{
		Matcher m = Pattern.compile(".*\\$\\{.+\\}.*").matcher(result);
		if (m.find())
		{
			throw new MissingValueException("No value for " + m.group());
		}
	}
}