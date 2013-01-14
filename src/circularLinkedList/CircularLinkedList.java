package circularLinkedList;


public class CircularLinkedList {

	/*
	 * A circular list is a dynamic list in which 
	 * there is a beginning but there is no end: after the last 
	 * element comes
	 * the first elements. Circular lists can be singly- or doubly-linked. 
	 * In this exercise, you must create a singly-linked
	 * circular list using the “hospital and patients” example as
	 *  a starting point.
	 *  
	 * 1. Create the circular list and add several elements 
	 *    to it (around 10 is fine).
	 * 
	 * 2. Traverse it forwards for one complete loop. 
	 *    While you go around the list, print out the content of each element.
	 *    How do you know that you have reached the end of the list 
	 *    when you never find a null pointer?
	 * 
	 * 3. Delete a couple of elements from the list.
	 * 
	 * 4. Traverse it again printing out the content of each element.
	 * 
	 * 5. Add a new element to the list. Try to delete an element 
	 *    that is NOT in the list.
	 * 
	 * 6. Traverse it again printing out the content of each element
	 */

	private Patient patientListStart = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularLinkedList Hospital = new CircularLinkedList();
		Hospital.launch();
	}
	
	private void launch(){
		// ...inside some method, maybe launch()
		Patient Patient_1 = new Patient("1-Picasso", 33, "Tuberculosis");
		patientListStart = Patient_1;
		// ...
		System.out.println("Patient_2 add");
		Patient Patient_2 = new Patient("2-Monet", 66, "Meningitis");
		patientListStart.addPatient(Patient_2);
		
		System.out.println("Patient_3 add");		
		Patient Patient_3 = new Patient("3-Leonardo", 67, "Meningitis");
		patientListStart.addPatient(Patient_3);
		
		System.out.println("pppppppppppppp");
		System.out.println("Picasso next =" + Patient_1.nextPatient.name);
		System.out.println("Monet next =" + Patient_2.nextPatient.name);
		System.out.println("Leonardo next =" + Patient_3.nextPatient.name);
		System.out.println("Picasso prev =" + Patient_1.prevPatient.name);
		System.out.println("Monet prev =" + Patient_2.prevPatient.name);
		System.out.println("Leonardo prev =" + Patient_3.prevPatient.name);
		
		// list patients
		System.out.println("\n**************************************");
		System.out.println("Patient List");
		patientListStart.listPatients(patientListStart);
		
		/*Patient Patient_4 = new Patient("4-Magritte", 68, "Meningitis");
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
		
		/*
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
		
		// last patient
		System.out.println("\n**************************************");
		System.out.println("Patient LAST");
		Patient mock = patientListStart.getLast(patientListStart);
		System.out.println(mock.getPatientName());
		
		// list patients BACKWARDS
		System.out.println("\n**************************************");
		System.out.println("BACKWARD Patient List");
		patientListStart.listBackwards(patientListStart.getLast(patientListStart));
		
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
		mock = patientListStart.getLast(patientListStart);
		System.out.println(mock.getPatientName());
		
		// list patients
		System.out.println("\n**************************************");
		System.out.println("BACKWARD Patient List");
		patientListStart.listBackwards(patientListStart.getLast(patientListStart));
		
		// last patient
		//System.out.println("\n**************************************");
		//System.out.println("Patient FIRST");
		//mock = patientListStart.getFirst(patientListStart);
		//System.out.println(mock.getPatientName());
		 
		 */
	}
	

}
