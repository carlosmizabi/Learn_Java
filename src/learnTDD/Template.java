package learnTDD;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;


public class Template {
	
	private Map<String, String> variables;
	private String templateText;
	
	public Template(String templateText)
	{
		// Creates a HashMap with two strings
		//
		this.variables = new HashMap<String, String>();
		this.templateText = templateText;
	}
	
	public void set(String name, String value)
	{
		// add the values to the HashMap
		//
		this.variables.put(name, value);
	}

	public String evaluate()
	{
		String result = replaceVariables();
		checkForMissingValues(result);
		return result;
	}
	
	private String replaceVariables()
	{
		String result = templateText;
		for(Entry<String, String> entry: variables.entrySet())
		{
			String regex = "\\$\\{" + entry.getKey() + "\\}";
			result = result.replaceAll(regex, entry.getValue());
		}
		return result;
	}
	
	private void checkForMissingValues(String result)
	{
		if (result.matches(".*\\$\\{.+\\}.*"))
		{
			throw new MissingValueException(result);
		}
	}
}
