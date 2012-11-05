package doublyLinkedLists;

public class Patient {
	
	// field 
	private String name;
	private int age;
	private String illness;
	private Patient prevPatient;
	private Patient nextPatient;
	// methods like constructors, getters
	// and setters come here...

	public Patient(String name, int age, String illness) 
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.prevPatient = null;
		this.nextPatient = null;
		//System.out.println(name);
	}
	
	public String getPatientName() 
	{
		return this.name = name;
	}
	
	// this is a member method of class Patient
	public void addPatient(Patient newPatient) 
	{
		if (this.nextPatient == null) {
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
			newPatient.prevPatient = this;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
		
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
	
	public void listPatients(Patient patient)
	{
			
			if(this.nextPatient != null){
				System.out.println("--------------------------------");
				System.out.println("Name: " + this.name);
				System.out.println(". . . . . . . . . . . . . . . . ");
				System.out.println("NEXT >> " + this.nextPatient.name);
				if(this.prevPatient != null) 
					{ System.out.println("PREV << " + this.prevPatient.name); }	
				this.nextPatient.listPatients(patient);
			}else{
				System.out.println("--------------------------------");
				System.out.println("Name: " + this.name);
				System.out.println(". . . . . . . . . . . . . . . . ");
				System.out.println("NEXT Patient >> " + this.nextPatient);
				System.out.println("PREV << " + this.prevPatient.name);
				System.out.println("--------------------------------");
			}
	}
	
	public Patient lastPatient(Patient patient)
	{
			if(this.nextPatient != null){
				// if not last get next patient
				return this.nextPatient.lastPatient(patient);
			}else{
				// it is the last patient 
				return this;
			}	
	}
	
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
	

}
