package _04_hospital;

public class DoctorFullException extends Exception {
	public void terminate() {
		System.exit(0);
	}
}
