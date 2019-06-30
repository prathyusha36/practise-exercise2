package main.java.com.stackroute.pe2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         String original = in.nextLine();
        System.out.println(checkForPalindrome(original));
    }

    public static String checkForPalindrome(String original) {
    String reverse = ""; // Objects of String class

    int length = original.length();

      for (int i = length - 1; i >= 0; i--)
          reverse = reverse + original.charAt(i);

      if (original.equals(reverse))
            return "is a palindrome";
      else
            return "is not a palindrome";

}
}
