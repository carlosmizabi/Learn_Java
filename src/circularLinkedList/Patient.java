package circularLinkedList;


public class Patient {
	
	// field 
	private static int patientCounter = 0;
	private int patientIndex = 0;
	public String name;
	private int age;
	private String illness;
	public Patient prevPatient;
	public Patient nextPatient;
	// methods like constructors, getters
	// and setters come here...

	public Patient(String name, int age, String illness) 
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.prevPatient = null;
		this.nextPatient = null;
		patientCounter++;
		this.patientIndex = patientCounter;
	}
	
	public String getPatientName() 
	{
		return this.name = name;
	}
	
	public void addPatient(Patient newPatient)
	{
		/*	
		 // Initialize the entry node.
            //
		if(firstP == null)
		{
			// v Link entry node to self, as there is only one node on the list.
			//
			firstP = new Patient(newPatient);
			firstP.nextPatient = firstP;
			firstP.prevPatient = firstP;
		}else{
			// Add the node to the circular linked-list.
			//
			firstP.nextPatient = new Patient(newPatient);
			
			if(firstP.prevPatient == firstP)
			{
				firstP.prevPatient = firstP.nextPatient;
			}else{
				firstP.nextPatient.nextPatient = firstP.nextPatient;
			}
		}
			
            // Link the newly added node with the rest of the nodes in the list.
            //
                // There is only one node on the list (i.e. entryNode) and
                // now we're adding the new node.
                /
                // There are at least two nodes on the list.
                //
                 * 
                 * 
		*/
		// Link entry node to self, as there is only one node on the list.
		System.out.println("this.patientIndex " + this.patientIndex);
		System.out.println("this " + this.name);
		
		if(this.nextPatient == null){ 
			newPatient.nextPatient = this; 
			newPatient.prevPatient = this; 
			this.nextPatient = newPatient; 
			this.prevPatient = newPatient; 
			System.out.println("&&  ");
		}else{
			// first connect new to existing
			//
			newPatient.prevPatient =  this.prevPatient;	 // last is new.prev
			newPatient.nextPatient = this; 		// first is new.next

			// now cut old connection and give new
			// 
			this.prevPatient.nextPatient = newPatient;	// last.next = new
			this.prevPatient = newPatient;			// first.prev = new
		}
		
		/*/ System.out.println("newPatient.patientIndex-1 = " + (newPatient.patientIndex-1));
		if (this.patientIndex != patientCounter-1)
		{
			this.nextPatient.addPatient(newPatient);
		}else{
			//newPatient.prevPatient = this;
			this.nextPatient = newPatient;
			// cannt change because it is private
			// make method to change it
			// newPatient.prevPatient = this;
			newPatient.setPrev(this);
			// link to next	
		}*/
		
		
		
	}
	
	public boolean existPatient(Patient patient)
	{
			if (this.nextPatient == null) {
				// patient to remove was not found
				//System.out.println("if null then false:");
				return false;
			} else if (this.nextPatient.name.equals(patient.name)) {
				// We found it! It is the next one!
				/* System.out.println("--------------------------------");
				System.out.println("Patient Found: " +
									"\nName: " + this.name +
									"\nAge: " + this.age +
									"\nIllness: " + this.illness);
				System.out.println("Next Patient is :" + this.nextPatient.name);
				System.out.println("--------------------------------"); */
				return true;
			} else {
				//System.out.println("existPatient(patient)");
				return this.nextPatient.existPatient(patient);
			}
	}
	
	public void setPrev(Patient patient){
		this.prevPatient = patient; 
	}
	
	public void listPatients(Patient patient) 
	{
		System.out.println("this.patientIndex = " + this.patientIndex);
		System.out.println("patientCounter = " + patientCounter);
			if(this.patientIndex != patientCounter){
				System.out.println("--------------------------------");
				System.out.println("Name: " + this.name);
				System.out.println(". . . . . . . . . . . . . . . . ");
				System.out.println("NEXT >> " + this.nextPatient.name);
				System.out.println("PREV << " + this.prevPatient.name); 
				this.nextPatient.listPatients(patient);
			}else{
				System.out.println("--------------------------------");
				System.out.println("Name: " + this.name);
				System.out.println(". . . . . . . . . . . . . . . . ");
				System.out.println("NEXT Patient >> " + this.nextPatient.name);
				System.out.println("PREV << " + this.prevPatient.name);
				System.out.println("--------------------------------");
			}
	}
	
	
	/*

	
	public void listBackwards(Patient patient)
	{
		//iterate until first
		if(patient.prevPatient != null){
			System.out.println("--------------------------------");
			System.out.println("Name: " + patient.name);
			System.out.println(". . . . . . . . . . . . . . . . ");
			System.out.println("PREV << " + patient.prevPatient.name);
			if(this.nextPatient != null) 
				{ System.out.println("NEXT >> " + this.nextPatient.name); }
			// GET NEXT
			patient.prevPatient.listBackwards(patient.prevPatient);
		}else{
			System.out.println("--------------------------------");
			System.out.println("Name: " + patient.name);
			System.out.println(". . . . . . . . . . . . . . . . ");
			System.out.println("--------------------------------");
		}
	}
	*/
	/*
	// this is a member method of class Patient
	// returns true if the patient was found and removed, false otherwise
	public boolean deletePatient(Patient patient) {
		if (this.nextPatient == null) {
			// patient to remove was not found
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			// We found it! It is the next one!
			// Now link this patient to the one after the next
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}
	*/
}
