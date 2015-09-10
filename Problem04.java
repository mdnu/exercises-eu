// A palindromic number reads the same both ways.
// The largest palindrome made from the product of
// two 2-digit numbers is 9009 = 91 × 99.

// Find the largest palindrome made from the product of two 3-digit numbers.

import java.util.ArrayList;
import java.util.Collections;

class Problem04 {

  // the following Problem4 method is for
  // nominally reversing an integer.
  public int reverse(int n) {
    int reversed = 0;
    while (n >0) {
      reversed = 10*reversed + (n%10);
      n /= 10;
    }
    return reversed;
  }

  // the following Problem4 method is for
  // checking if a given integer is palindromic.
  public boolean isPalindrome(int n) {
    Problem04 instance = new Problem04();
    boolean palindrome = false;
    if (n == instance.reverse(n)) {
      palindrome = true;
    }
    return palindrome;
  }

  // the main argument starts here.
  public static void main(String[] args) {
    Problem04 prob4 = new Problem04();
    int largestPalindrome = 0;
    int a = 100;
    while (a <= 999) {
      int b = 100;
      while (b <= 999) {
        // the code below checks if the product a*b
        // is the largest palindrome so far.
        if (prob4.isPalindrome(a*b) && ((a*b) > largestPalindrome)) {
          largestPalindrome = a*b;
        }
        b += 1;
      }
      a += 1;
      // notice above that we used while loops to iterate through
      // the values for 'a' and 'b'.
    }
    System.out.println(largestPalindrome);
  }
}
