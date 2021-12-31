public class Main {
	public static void main(String[] args) {
		// Input: s = "   fly me   to   the moon  "
		// Output: 4
		// Explanation: The last word is "moon" with length 4.

		String s = "   fly me   to   the moon  ";
		System.out.println("Example 2 should return 4: " + lengthOfLastWord(s));

		// Input: s = "a"
		// Output: 1
		String failedExampleOne = "a";
		System.out.println(" \"a\" should return 1: " + lengthOfLastWord(failedExampleOne));


		// Input: s = "day"
		// Output: 3
		String failedExampleTwo = "day";
		System.out.println(" \"day\" should return 3: " + lengthOfLastWord(failedExampleTwo));

	}

	public static int lengthOfLastWord(String s) {
		int lastWordLength = 0;

		//to get the last word lengt start your for loop at the end
		for (int i = s.length() - 1; i >= 0; i--) {
			// we are at the beginning of the string
			if(s.charAt(i) != ' ' && i == 0){
				lastWordLength++;
				return lastWordLength;
			}

			// not at the beginning of string
			// string is longer than one word, return the last word
			if (s.charAt(i) == ' ' && lastWordLength > 0) {
				return lastWordLength;
			} else if (s.charAt(i) != ' ') {
				lastWordLength++;
			}
		}
		// currently returning zero if we get to this point
		return 0;
	}
}





