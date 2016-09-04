/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem01 {
	public static int max = 999;

	public static int SumDivN(int n) {
		int p = max / n;
		return (n * (p * (p + 1))) / 2;
	}
  
	public static void main(String[] args) {
		System.out.println(SumDivN(3) + SumDivN(5)- SumDivN(15));
	}
	
}
