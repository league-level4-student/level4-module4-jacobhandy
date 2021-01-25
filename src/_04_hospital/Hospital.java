package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital extends ArrayList<Object>{

	
		
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int index = 0;
		for(Patient p : getPatients()) {
			
			
			try {
				Doctor d = getDoctors().get(index);
				
				if(d.size() >= 3) {
				index++;
				System.out.println(patients.size());
				d = getDoctors().get(index);
				}
				((Doctor) d.getPatients()).assignPatient(p);
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			}
		
	}
	



	


