public class Main {
	public static void main(String[] args) {
		// Input: s = "   fly me   to   the moon  "
		// Output: 4
		// Explanation: The last word is "moon" with length 4.

		String s = "   fly me   to   the moon  ";
		System.out.println("Example 2 should return 4: " + lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
		int lastWordLength = 0;

		//to get the last word lengt start your for loop at the end
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ' && lastWordLength > 0) {
				return lastWordLength;
			} else if (s.charAt(i) != ' ') {
				lastWordLength++;
			}
		}
		return 0;
	}
}





