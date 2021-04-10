package week1.day2.assignment;

public class FibboacciSeries {
public static void main(String[] args) {
	
			int first = 0;
			int second = 1;
			
			for (int i = 1 ; i < 8 ; i++) {
				System.out.print(first + " ");
				int sum = first + second;
				 first = second;
				 second = sum;
				 
				
			}
			System.out.println("-----------");
			System.out.println(second);
		}

	}
	