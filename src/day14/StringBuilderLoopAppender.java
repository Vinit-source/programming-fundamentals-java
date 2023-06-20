package day14;

/**
 * Class created for demonstrating appending with String builder
 * 
 * @author BharathwajSoundarara
 *
 */
public class StringBuilderLoopAppender {
	public static void main(String[] args) {

		// Program to demonstrate creating a String
		// Appending a array of Strings
		String[] strArr = { "This", "is", "a", "collection", "of", "words", "to", "be", "appended", "to", "form", "a",
				"Sentence" };

		// Without String Builder
		String newStrFromSent = "";
		String[] generatedStrings = new String[strArr.length];
		int i = 0;
		for (String str : strArr) { // forEach loop: used to loop over elements of arrays
			// We are creating a new String everytime we do this
			newStrFromSent += str + " ";
			generatedStrings[i] = newStrFromSent;
			i++;
		}

		System.out.println("Generated Strings in memory when using String class : ");
		for (String str : generatedStrings) {
			System.out.println(str);
		}

		// GOOD Practice: With String Builder

		StringBuilder strBuilderFromSent = new StringBuilder();

		for (String str : strArr) {
			// Just appending to an already existing object
			strBuilderFromSent.append(str);
			strBuilderFromSent.append(" ");
		}
		System.out.println("StringBuilder: " + strBuilderFromSent.toString().trim());
	}
}