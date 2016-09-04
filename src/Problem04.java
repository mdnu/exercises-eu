/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem04 {
	public static int reverse(int n) {
		int reversed = 0;
		while (n > 0) {
			reversed = 10 * reversed + (n % 10);
			n /= 10;
		}
		return reversed;
	}
	
	public static boolean isPalindrome(int n) {
		boolean palindrome = false;
		if (n == reverse(n)) {
			palindrome = true;
		}
		return palindrome;
	}
	
	public static void main(String[] args) {
		int largestPalindrome = 0, a = 100;
		
		while (a <= 999) {
			int b = 100;
			
			while (b <= 999) {
				if (isPalindrome(a * b) && ((a * b) > largestPalindrome)) {
					largestPalindrome = a * b;
				}
				b++;
			}
			a++;
		}
		System.out.println(largestPalindrome);
	}
}
