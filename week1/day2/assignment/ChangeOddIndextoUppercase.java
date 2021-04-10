package week1.day2.assignment;


import java.util.Arrays;

public class ChangeOddIndextoUppercase {

	public static void main(String[] args) {
	
				String name = "aravindkarur";
				char[] charArray = name.toCharArray();
				for (int i = 0; i < charArray.length; i++) {
					if (i%2 ==  0) {
						
						System.out.print(Character.toUpperCase(charArray[i]));
					}
					else {
						System.out.print(charArray[i]);
					}
			}

			}
		}
		