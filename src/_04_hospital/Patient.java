package _04_hospital;

public class Patient {
	private boolean caredFor = false;
	
	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		return caredFor;
	}
	
	public void setCaredFor(boolean x) {
		caredFor = x;
	}
	
	public void checkPulse() {
		// TODO Auto-generated method stub
		setCaredFor(true);
	}

}
