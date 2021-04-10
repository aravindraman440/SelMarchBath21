package week1.day2.classroom;

public class SumofDigits {
public static void main(String[] args) {
	int num = 123;
	int sum = 0;
	while(num>0) {
		int eachNumber = num%10;
		sum = sum + eachNumber;
		num = num/10;
				
	}
System.out.println(sum);
}

}