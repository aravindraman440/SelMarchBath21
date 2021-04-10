package week1.day2.assignment;

public class RemoveDuplicatte {
public static void main(String[] args) {
		/*
		 * String text = "We learn java basics as part of java sessions in java week1";
		 * int length = text.length(); System.out.println(length); char[] charArray =
		 * text.toCharArray(); for (int i = 0; i < charArray.length; i++) { char charAt
		 * = text.charAt(i); System.out.print(charAt+" "); }
		 */
	
	String str = "We learn java basics as part of java sessions in java week1";
	
	String[] eachWords = str.split("\\s+");
	for (int i =0; i <eachWords.length; i++) {
		
		for (int j = i+1; j <eachWords.length; j++) {
	
			if((eachWords[i].equals(eachWords[j]))){

				eachWords[j]="";			}
		
	}
		System.out.print(eachWords[i]+" ");	
}

}
}
