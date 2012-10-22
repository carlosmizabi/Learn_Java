package mailServer;

import java.util.Scanner;

/*|********************************************************
/*| Class MailServer                         
/*|*******************************************************/
public class MailServer {

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
	// CommandMenu 
	//////////////////////////////////////////////////////////
	public static void CommandMenu(){
	
		System.out.println("Enter your Command:");
		
		Scanner in = new Scanner(System.in);
		
		boolean loop = true;
		while (loop == true){
			
			System.out.print(">>> ");
			// Get Command
			String commandLine = in.nextLine();
			int length = commandLine.length();
			
			// get the length up to :
			int twoDots = 0;
			for (int i = 0; i < length; i++){
				twoDots++;
				char x = commandLine.charAt(i);
				if (x == ':'){
					break;
				}
			}
			String commandTemp = commandLine.substring(0, twoDots);
			String command = commandTemp.toUpperCase();
			String cmdINPUT = commandLine.substring(twoDots);
			System.out.println("Command: " + command);
			System.out.println("cmdINPUT: " + cmdINPUT);
			
			int quitter = command.length(); 
			if (quitter == 4 && command.equals("QUIT")) {
				loop = false;
				
			}else if(command.equals("MAIL FROM:")){
				
				// Get and check Sender email
				MailFrom();
				
			}else if (command.equals("MAIL TO:")){
				
				// Get and check Receiver email
				MailTo();
				
			}else if (command.equals("DATA:")){
				
				// Get the message
				MailMessage();
				
			}else if (command.equals("HELP:")){
				// SHOW THE HELP MENU
				HelpMessage();
			}else{
				System.out.println("ERROR: Command NOT recognized!!");
			}
		}
	
		
	} // \\\\\\\\\\\\\\\\\\\\\ //

	///////////////////////////////////////////////////////////
	// MailFrom 
	//////////////////////////////////////////////////////////
	public static void MailFrom(){
		System.out.println("Je sui le MailFrom");
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// MailFrom 
	//////////////////////////////////////////////////////////
	public static void MailTo(){
		System.out.println("Je sui le MailTo");
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// MailMessage
	//////////////////////////////////////////////////////////
	public static void MailMessage(){
	System.out.println("Je sui le MailMessage");
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
							"\n| (1) \"MAIL FROM:\"                                            |" +
							"\n|   >> then enter your valid email address, ex.:              |" + 
							"\n|   >> yourAdress@email.com                                   |" +
							"\n|_____________________________________________________________|" +
							"\n| (2) \"RPCT TO:\"                                              |" +
							"\n|   >> then enter the recipients email address, ex.:          |" +
							"\n|   >> recipents@email.com                                    |" +
							"\n|_____________________________________________________________|" +
							"\n| (3) \"DATA:\"                                                 |" +
							"\n|   >> finally, write your message                            |" +
							"\n|_____________________________________________________________|" +
							"\n| (?) \"HELP\"                                                 |" +
							"\n|   >> to see this menu again                                 |" +
							"\n|_____________________________________________________________|");
	} // \\\\\\\\\\\\\\\\\\\\\ //
	

} /*|*********************/
