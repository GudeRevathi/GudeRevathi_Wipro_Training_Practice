package main.java;

public class StringProblems {


	 // 2. Replace first vowel with '-'
	 public String replaceFirstVowel(String str) {
	     String vowels = "aeiouAEIOU";
	     for (int i = 0; i < str.length(); i++) {
	         if (vowels.indexOf(str.charAt(i)) != -1) {
	             return str.substring(0, i) + '-' + str.substring(i + 1);
	         }
	     }
	     return str;
	 }

	 // 3. Count letters, digits, specials
	 public void countCharacters(String str) {
	     int letters = 0, digits = 0, specials = 0;
	     for (int i = 0; i < str.length(); i++) {
	         char ch = str.charAt(i);
	         if (Character.isLetter(ch)) letters++;
	         else if (Character.isDigit(ch)) digits++;
	         else specials++;
	     }
	     System.out.println("Letters: " + letters);
	     System.out.println("Digits: " + digits);
	     System.out.println("Special characters: " + specials);
	 }

	 // 4. Remove spaces
	 public String removeSpaces(String str) {
	     return str.replace(" ", "");
	 }

	 // 5. Concatenate strings
	 public String concatenate(String a, String b) {
	     return a +" "+ b;
	 }
	}
