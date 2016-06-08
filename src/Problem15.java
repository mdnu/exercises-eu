/* Starting in the top left corner of a 2×2 grid, 
and only being able to move to the right and down, 
there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid? */

/* Anwer:
The answer is (n choose k) where n is the number of movements 
(down or right) to arrive at the bottom vertex, and k is the number 
of movements right. Hence the number of ways to arrive at the bottom 
vertex is the number of ways we can choose k-many right-movements 
(or equivalently, choose (n-k)-many down movements)) out of n movements 
without replacement. In particular, for a square of dimensions size*size, 
we trivially see that we may arrive at the bottom corner in k=size, n-k =size. */

import java.math.BigInteger;

class Problem15 {
	
	public static int SIZE = 20;
	
	public static BigInteger factorial(int n) {
		BigInteger b = new BigInteger(Integer.toString(n));
		
		if (n ==0) {
			BigInteger one = new BigInteger("1");
			return one;
			
		} else {
			
			while (n>2) {
				BigInteger next = new BigInteger(Integer.toString(n-1));
				b = b.multiply(next);
				n--;
			} 
			
			return b;
		}
	}
	
	public static BigInteger nChooseK(int n, int k) {
		return 
		factorial(n).divide(factorial(k).multiply(factorial(n-k)));
	}
	
	public static void main(String[] args) {
		System.out.println(nChooseK(2*SIZE, SIZE));
	}
}

