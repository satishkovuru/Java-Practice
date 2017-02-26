package com.satish.practice.job;

public class DogSearch {

	public static void main(String[] args) {
		// This code will not compile correctly until you fix it.
		//
		// We are trying to count the number of times the word
		// dog appears in some input text, but we can't seem to
		// remember the appropriate method call in the String class,
		// and are not sure our approach will work.
		// task: Use the JDK documentation to help us finish the code,
		// then discuss the ambiguity in the problem description, and
		// reword it to remove the ambiguity in the space provided below.

		/*
		 * The ambiguity in this problem is what should be counted as "dog".
		 * It is not clear how to handle letter case ("Dog vs "dog"), how to
		 * handle words that contain "dog" such as "Dogman", or how to handle
		 * a string that may contain "dog" multiple times, such as "dogdogdog".
		 * For my solution, I made the assumption that we want to count the
		 * number of times "dog" appears anywhere within the string,
		 * regardless of letter case or if it's embedded within a word. 
		 * 
		 * I  am not sure how to handle if "dog" appears multiple times in a  string, so "dogdogdog" only evaluates to 1 "dog" in this program.
		 * 
		 * To remove the ambiguity, the problem description could be rewritten to: 
		 * Task: Use the JDK documentation to help us write code to count
		 * the number of times "dog" appears in a string. 
		 * Disregard letter  case (i.e. "Dog" = "dog"). 
		 * If a word contains "dog" it should still count (e.g. "Dogman" or "dog-like")
		 * 
		 */

		String input = new String(
				"The Dogman was no ordinary dog, nor man, but rather a peculiar dog-like man who barked like a dog, and panted like a dog, he even ate like a dog.  He owned a dog named Doglips, and interestingly enough, his favorite food was hotdogs.");
		System.out.println(input);
		String lowercaseinput = input.toLowerCase();
		String[] words = lowercaseinput.split(" ");

		int count = 0;
		System.out.print("Counting dogs:\n");
		for (int i = 0; i < words.length; i++) {

			if (words[i].contains("dog")) {
				count++;

			}

		}
		System.out.print("The word \"dog\" appears " + count + " times.");

	}

}
