package week1.day2.assignment;

public class ReverseEvenString {




		public static void main(String[] args) {
			String test = "Quality Assurance Automation Engineer";
			String[] split = test.split(" ");
			for (int i = 0; i < split.length; i++) {
				if (i % 2 == 0) {
					System.out.print(" ");
					System.out.print(split[i]);
				}
				if (i % 2 != 0) {
					System.out.print(" ");
					char[] evenWords = (split[i]).toCharArray();
					for (int j = evenWords.length - 1; j >= 0; j--) {
						System.out.print(evenWords[j]);

					}

				}

			}

		}

	}
	