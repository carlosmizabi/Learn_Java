package supermarket;

public class Supermarket {

	/*
	 * Use the interface PersonQueue that represents a queue 
	 * of people waiting at the supermarket and then implement
	 * it. You can use the definition and the implementations 
	 * of StringStack as a guide. You can reuse any version of
	 * class Person from past days. For example, depending on 
	 * your implementation, you may want to use a version of
	 * Person with or without internal pointers.
	 * public interface PersonQueue {
	 *
     * - // Adds another person to the queue.
     * void insert(Person person);
     * 
     * - //Removes a person from the queue.
     * Person retrieve();
     * Then create a class Supermarket that has two methods: 
     * addPerson(Person) and servePerson(). These
     * methods must call the appropriate methods of PersonQueue.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supermarket checkout = new Supermarket();
		checkout.launch();
	
	}
	
	private static void launch()
	{
		PersonQueue kew = new MarketQueue();
		testQueue(kew);
	}
	
	private static void testQueue(PersonQueue kew)
	{
		 PersonNode person1 = new PersonNode();
		 PersonNode person2 = new PersonNode();
		 PersonNode person3 = new PersonNode();
		 PersonNode person4 = new PersonNode();
		 PersonNode person5 = new PersonNode();
		 PersonNode person6 = new PersonNode();
		 PersonNode person7 = new PersonNode();
		 PersonNode person8 = new PersonNode();
		 PersonNode person9 = new PersonNode();
		 PersonNode person10 = new PersonNode();
		 PersonNode person11 = new PersonNode();
		 
		  System.out.println("Testing the queue..."); 
		  kew.insert(person1); 
		  System.out.println("New Person in queue: " + person1.getID());
		  kew.insert(person2);
		  System.out.println("New Person in queue: " + person2.getID());
		  kew.insert(person3);
		  System.out.println("New Person in queue: " + person3.getID());
		  System.out.println("Next Person: " + kew.firstInQueue().getID() + "' done");
		  kew.retrieve();
		  System.out.println("Next Person: " + kew.firstInQueue().getID() + "' done");
		  kew.retrieve();;
		  kew.insert(person8);
		  System.out.println("New Person in queue: " + person8.getID());
		  kew.insert(person9);
		  System.out.println("New Person in queue: " + person9.getID());
		  System.out.println("Next in queue: '" + kew.firstInQueue().getID() + "'");
		  System.out.println("People queueing: ");
		  kew.queueList(kew.firstInQueue());
	}

}
