package doublyLinkedLists;

public class DoublyLinkedLists {

	/*
	 * A doubly-linked list is a dynamic list in which each 
	 * element is connected to two other elements instead of just one.
	 * The one before and the one after it. In this exercise, you
	 * must create a doubly-linked list using the “hospital and
	 * patients” example as a starting point.
	 * 
	 * 1. Create the doubly-linked list and add several 
	 * 	  elements to it (around 10 is fine).
	 * 2. Traverse it forwards and backwards printing out
	 *    the content of each element.
	 * 3. Delete a couple of elements from the list.
	 * 4. Traverse it forwards and backwards printing out the 
	 *    content of each element.
	 * 5. Add a new element to the list. Try to delete an element 
	 *    that is NOT in the list.
	 * 6. Traverse it forwards and backwards printing out the content
	 *    of each element.
	 *    
	 * Hint: First you need to add a new field to Patient for 
	 * the pointer going “backwards”. Then you need to modify
	 * the add and delete methods to make sure you do not have 
	 * loose pointers.
	 */
	
	private Patient patientListStart = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedLists Hospital = new DoublyLinkedLists();
		Hospital.launch();
	}
	
	private void launch(){
		// ...inside some method, maybe launch()
		Patient Patient_1 = new Patient("1-Picasso", 33, "Tuberculosis");
		patientListStart = Patient_1;
		// ...
		Patient Patient_2 = new Patient("2-Monet", 66, "Meningitis");
		patientListStart.addPatient(Patient_2);
		Patient Patient_3 = new Patient("3-Leonardo", 67, "Meningitis");
		patientListStart.addPatient(Patient_3);
		Patient Patient_4 = new Patient("4-Magritte", 68, "Meningitis");
		patientListStart.addPatient(Patient_4);
		Patient Patient_5 = new Patient("5-Brunelleschi", 69, "Meningitis");
		patientListStart.addPatient(Patient_5);
		Patient Patient_6 = new Patient("6-Michelangelo", 70, "Meningitis");
		patientListStart.addPatient(Patient_6);
		Patient Patient_7 = new Patient("7-Donatello", 61, "Meningitis");
		patientListStart.addPatient(Patient_7);
		Patient Patient_8 = new Patient("8-Giotto", 63, "Meningitis");
		patientListStart.addPatient(Patient_8);
		Patient Patient_9 = new Patient("9-Dali", 64, "Meningitis");
		patientListStart.addPatient(Patient_9);
		
		// if patient found print name
		System.out.println("\n**************************************");
		System.out.println("\nPatient Search: 4-Magritte");
		if(patientListStart.existPatient(Patient_4)) 
			System.out.println("Patient FOUND: " + Patient_4.getPatientName());
		else
			System.out.println("Patient NOT FOUND:");
		
		// list patients
		System.out.println("\n**************************************");
		System.out.println(" Patient List");
		patientListStart.listPatients(patientListStart);
		
		// last patients
		System.out.println("\n**************************************");
		System.out.println("Patient LAST");
		Patient mock = patientListStart.lastPatient(patientListStart);
		System.out.println(mock.getPatientName());
		
		// list patients BACKWARDS
		System.out.println("\n**************************************");
		System.out.println("BACKWARD Patient List");
		patientListStart.listBackwards(patientListStart.lastPatient(patientListStart));
		
		// delete patient 
		System.out.println("\n**************************************");
		System.out.println("\nDelete Patient: 3-Leonardo, 5-Brunelleschi, 7-Donatello");
		if(patientListStart.existPatient(Patient_3)){
			System.out.println("Patient FOUND: " + Patient_3.getPatientName());
			patientListStart.deletePatient(Patient_3);
			
			System.out.println("Patient FOUND: " + Patient_5.getPatientName());
			patientListStart.deletePatient(Patient_5);
			
			System.out.println("Patient FOUND: " + Patient_7.getPatientName());
			patientListStart.deletePatient(Patient_7);
		}
		
		// add patient
		System.out.println("\nNEW Patient: 10-ElGreco");
		Patient Patient_10 = new Patient("10-ElGreco", 68, "Meningitis");
		patientListStart.addPatient(Patient_10);
		
		// list patients
		System.out.println("\n**************************************");
		System.out.println("Patient List");
		patientListStart.listPatients(patientListStart);
		
		// last patients
		System.out.println("\n**************************************");
		System.out.println("Patient LAST");
		mock = patientListStart.lastPatient(patientListStart);
		System.out.println(mock.getPatientName());
		
		// list patients
		System.out.println("\n**************************************");
		System.out.println("BACKWARD Patient List");
		patientListStart.listBackwards(patientListStart.lastPatient(patientListStart));
		
	}
	
}
