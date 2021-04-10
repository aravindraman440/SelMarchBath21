package week1.day1.assignment;

public class Computer {
	
	

	public void computeName() {
		String computerName="lenovo";
		System.out.println("computer name lenovo:"+computerName);
	}
public void computeModel() {
	int modelno=123;
		System.out.println("computerName:"+modelno);
	}
	
public void computerIp() {
	long ipAddress=12345678900987654l;
	System.out.println("ipAddress:"+ipAddress);
}

		
	
public static void main(String[] args) {
	Computer obj =new Computer();
	obj.computeModel();
	obj.computeName();
	obj.computerIp();
}
}
