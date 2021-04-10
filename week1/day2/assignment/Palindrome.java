package week1.day2.assignment;

public class Palindrome {
public static void main(String[] args) {
	String str = "AMMA";
	String rev = "";
	char[] charArray = str.toCharArray();
	for (int i = charArray.length-1; i >=0; i--) {
		rev = rev + charArray[i]+"";
		
		}
	System.out.println(rev);
	
	if (rev.equals(str)) {
		System.out.println("The given String is a Palindrome");
		
	}else {
		System.out.println("The given String is not a Palindrome");
	}


}


}
