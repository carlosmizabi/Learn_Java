package mailServer;

import java.util.Scanner;

/*|********************************************************
/*| Class MailData                         
/*|*******************************************************/
class MailData {
	
	String from;
	String to;
	String message;
	
} /*|*********************/


/*|********************************************************
/*| Class MailServer                         
/*|*******************************************************/
public class MailServer {
	
	// Command line variables
	static String cmd = "";
	static String input = "";

	/*
	 * implements part of a mail server. A mail 
	 * server is a program that takes your emails 
	 * and then sends them to the appropriate recipient. 
	 * In this exercise, you will implement a simplified 
	 * version of the SMTP protocol that is
	 * used to send emails over the Internet.
	 */
	public static void main(String[] args) {
		
		
		// Welcome to My Mail Server!
		System.out.println("Welcome to My Mail Server!");
		
		// DISPLAY HELP MESSAGE
		HelpMessage();
		
		// START COMMAND LINE MENU
		CommandMenu();
	
	
	System.out.println("Thank you, and Goodbye! ");
	
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// CmdProcessor
	//////////////////////////////////////////////////////////
	public static void CmdProcessor(String commandLine){
		 
				
		// GET LENGTH OF INPUT 
		int length = commandLine.length();
		// NO : SENTINEL
		boolean sentinel = false;
		
		// GET COMMAND (COUNT UP TO THE ':' CHAR)
		int twoDots = 0;
		for (int i = 0; i < length; i++){
			twoDots++;
			char x = commandLine.charAt(i);
			if (x == ':'){
				sentinel = true;
				break;
			}
		}
		
		// GET COMMAND LINE
		String commandTemp = commandLine.substring(0, twoDots);
		String command = commandTemp.toUpperCase();
		String cmdINPUT = commandLine.substring(twoDots);
		
		// IS EMPTY? 
		int emptyINPUT = length - twoDots;
		
		// HOW MANY NON SPACE " " CHARS DOES IT HAS?
		int validChar = 0;
		for (int j = twoDots; j < length; j++){
			char p = commandLine.charAt(j);
			if (p != ' '){
				validChar++;
			}
		}
		
		// ASSIGN VALUES TO "GLOBAL" VARIABLES
		if (command.equals("QUIT") || command.equals("DATA:") || command.equals("HELP:")){
			cmd = command;
			input = "";
		}else if (emptyINPUT > 2 && validChar > 3 && sentinel == true){
			cmd = command;
			input = cmdINPUT;
		} else {
			cmd = "";
			input = "";
		}
		
		
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// CommandMenu 
	//////////////////////////////////////////////////////////
	public static void CommandMenu(){
		
		// INIT CONTAINERS
		MailData mailData = new MailData();
	
		System.out.println("Enter your Command:");
		
		Scanner in = new Scanner(System.in);
		
		
		boolean loop = true;
		int order = 1;
		while (loop == true){
			
			System.out.print(">>> ");
			
			// Get Command
			String commandLine = in.nextLine();
			// SEND THE LINE FOR PROCESSING
			CmdProcessor(commandLine);
			
			// if not empty and has more than five chars then proceed
			if (( !cmd.equals("") && !input.equals("") ) 
					|| ((cmd.equals("QUIT") || cmd.equals("DATA:") || cmd.equals("HELP:")) && input.equals("") )){
				
				// COMMAND OPTIONS
				if (cmd.equals("QUIT")) {
					loop = false;
					
				}else if(cmd.equals("MAIL FROM:") && order == 1){
					
					// Get and check Sender email
					mailData.from = MailChecker(input, cmd);
					// System.out.println("mailData FROM = " + mailData.to);
					order++;
					
				}else if (cmd.equals("MAIL TO:") && order == 2){
					
					// Get and check Sender email
					mailData.to = MailChecker(input, cmd);
					// System.out.println("mailData TO = " + mailData.to);
					order++;
				
				}else if (cmd.equals("DATA:") && order == 3){
					
					// Get the message
					mailData.message = MailMessage();
					
					System.out.println("Sending message...");
					System.out.println("MAIL FROM: " + mailData.from);
					System.out.println("MAIL TO: " + mailData.to);
					System.out.println(mailData.message);
					System.out.println("...done!");
					order = 1;
					
				}else if (cmd.equals("HELP:")){
					// SHOW THE HELP MENU
					HelpMessage();
				}else{
					System.out.println("Invalid Command!");
				}
			}else {
				System.out.println("Invalid Command!");
			}
		}
	
		
	} // \\\\\\\\\\\\\\\\\\\\\ //

	
	///////////////////////////////////////////////////////////
	// MailChecker 
	//////////////////////////////////////////////////////////
	public static String MailChecker(String mailTo, String which){
		
		// GET THE LENGTH OF RECEIVED VARIABLE
		int lengthX = mailTo.length();
		
		// INIT NEW CLEAN VERSION
		String newMailTo = "";
		// @ checker
		boolean at = false;
		
		// CLEAN FROM EXTRA SPACES and Check for '@'
		for (int i = 0; i < lengthX; i++){
			char x = mailTo.charAt(i);
			if (x != ' '){
				newMailTo += x;
			}
			if (x == '@'){
				at = true;
			}
			
		}
		// GET THE LENGTH OF CLEANED VARIABLE
		int lengthY = newMailTo.length();
		// CHECK @
		char first = newMailTo.charAt(0);
		// System.out.println("first char = " + first);
		char last = newMailTo.charAt(lengthY-1);
		// System.out.println("last char = " + last);
		
		if (first == '@' || last == '@' || at == false){
				System.out.println("Invalid email!  \n >> Retype Command with a valid email.");
				return null;
		}
		
		return newMailTo;
		
		
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// MailMessage
	//////////////////////////////////////////////////////////
	public static String MailMessage(){
		
		System.out.println("Type your message");
		System.out.println("When you are done write a line with one dot");
		
		Scanner in = new Scanner(System.in);
		String text = "";
		
		String line = "";
		while (true){
			System.out.println(">> ");
			line = in.nextLine();
			if (line.equals(".")){
				break;
			}
			text += line + "\n"; 
		}
		return text;
		
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// HelpMessage
	//////////////////////////////////////////////////////////
	public static void HelpMessage(){
		System.out.println( "\n _____________________________________________________________ " +
							"\n| To Send an Email you must type the                          |" +
							"\n| The following COMMANDS exactly, without the quotes          |" +
							"\n| and in the right order                                      |" +
							"\n|_____________________________________________________________|" +
							"\n| (1) \"MAIL FROM:\"  <email-address>                           |" +
							"\n|   >> then enter your valid email address, ex.:              |" + 
							"\n|   >> yourAdress@email.com                                   |" +
							"\n|_____________________________________________________________|" +
							"\n| (2) \"RPCT TO:\"  <email-address>                             |" +
							"\n|   >> then enter the recipients email address, ex.:          |" +
							"\n|   >> recipents@email.com                                    |" +
							"\n|_____________________________________________________________|" +
							"\n| (3) \"DATA:\"                                                 |" +
							"\n|   >> finally, write your message                            |" +
							"\n|_____________________________________________________________|" +
							"\n|  \"HELP:\"                                                    |" +
							"\n|   >> finally, write your message                            |" +
							"\n|_____________________________________________________________|");
	} // \\\\\\\\\\\\\\\\\\\\\ //
	

} /*|*********************/
