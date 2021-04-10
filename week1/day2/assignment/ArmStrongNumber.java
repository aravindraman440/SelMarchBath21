package week1.day2.assignment;

public class ArmStrongNumber {
	public static void main(String[] args) {
		
	int num1 =153;
	int armstrongnumber = 0;
	int num2 = num1;
	
	while(num1>0) {
		int reminder=num1%10;
		int eachDigitcube =reminder*reminder*reminder;
	
	armstrongnumber=armstrongnumber+eachDigitcube;
	System.out.println(armstrongnumber);
	num1=num1/10;
	
	
	}
	
	
	if(armstrongnumber==num2) {
		System.out.println("armstrongnumber");
	}
	else
	{
		System.out.println("the no is not armstrong");
	}
}
}
