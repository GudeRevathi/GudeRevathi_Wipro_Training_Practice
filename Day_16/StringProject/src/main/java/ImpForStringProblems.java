package main.java;

import java.util.Scanner;

//import codes.StringProblems;

public class ImpForStringProblems {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     StringProblems sp = new StringProblems(); 

     // 2. Replace first vowel
     System.out.print("Enter string to replace first vowel: ");
     String str2 = sc.nextLine();
     System.out.println("After replacing first vowel: " + sp.replaceFirstVowel(str2));

     // 3. Count letters, digits, specials
     System.out.print("Enter string to count characters: ");
     String str3 = sc.nextLine();
     sp.countCharacters(str3);

     // 4. Remove spaces
     System.out.print("Enter string to remove spaces: ");
     String str4 = sc.nextLine();
     System.out.println("Without spaces: " + sp.removeSpaces(str4));

     // 5. Concatenate strings
     System.out.print("Enter first string to concatenate: ");
     String s1 = sc.nextLine();
     System.out.print("Enter second string to concatenate: ");
     String s2 = sc.nextLine();
     System.out.println("Concatenated string: " + sp.concatenate(s1, s2));

     sc.close();
 }
}
