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
		
		boolean flag = true;
		while (flag){
		
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
								"\n|_____________________________________________________________|");
			
			//Get and check Sender email
			MailFrom();
			
			///Get and check Receiver email
			MailTo();
			
			//Get the message
			MailMessage();
			
			// repeat or exit menu
			flag = exitMenu();
		
		
	} /*XX closes while (flag){} XX*/
	
	System.out.println("Thank you, and Goodbye! ");
	
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// MailFrom 
	//////////////////////////////////////////////////////////
	public static void MailFrom(){
		System.out.println("Je sui le MailFrom");
	}
	
	///////////////////////////////////////////////////////////
	// MailFrom 
	//////////////////////////////////////////////////////////
	public static void MailTo(){
		System.out.println("Je sui le MailTo");
	}
	
	///////////////////////////////////////////////////////////
	// MailMessage
	//////////////////////////////////////////////////////////
	public static void MailMessage(){
	System.out.println("Je sui le MailMessage");
	}
	
	///////////////////////////////////////////////////////////
	// Repeat or Exit menu
	//////////////////////////////////////////////////////////
	public static boolean exitMenu(){
	
		System.out.println("");
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		int menu = 3;
		// while not 0 or 1 ask again
		while ( menu != 0 && menu != 1  ) {
			System.out.println("Would you like to: \n" +
			"Repeat [1] \n" +
			"Exit   [0] \n");
			menu = in.nextInt();
			
			// exit programe
			if ( menu == 0 ){
				return flag = false;
			} 
		}
		return flag;
	} // \\\\\\\\\\\\\\\\\\\\\ //

} /*|*********************/
