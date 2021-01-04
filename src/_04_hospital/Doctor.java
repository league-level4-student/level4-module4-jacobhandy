package _04_hospital;

import java.util.ArrayList;

public class Doctor extends ArrayList<Patient>{
	
	public boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return false;
	}
	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		add(patient);
		if(size() > 3) {
			remove(patient);
			throw new DoctorFullException();
		}
	}
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return this;
	}
	public void doMedicine() {
		// TODO Auto-generated method stub
		for(Patient p : this) {
			p.setCaredFor(true);
		}
	}

}
