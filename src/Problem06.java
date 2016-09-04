/**
 * The square of the sum of the first ten natural numbers is 3025
 * Hence the difference between the sum of the squares of
 * the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the
 * first one hundred natural numbers and the square of the sum.
 */

public class Problem06 {
	public static int finalSum(int n) {
		int finalSum = (n * (n + 1)) / 2;
		return finalSum;
	}
	
	public static int finalSqSum(int n) {
		int finalSqSum = (n * ((2 * n) + 1) * (n + 1)) / 6;
		return finalSqSum;
	}
	
	public static void main(String[] args) {
		System.out.println(finalSum(100) * finalSum(100) - finalSqSum(100));
	}
}
