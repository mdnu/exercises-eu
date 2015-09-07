/* 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000? */

import java.math.BigInteger;

class Problem16 {
	
	public BigInteger twoPowerFive = new BigInteger("32");
	
	public BigInteger result(int power) {
		
		BigInteger result = BigInteger.ONE;
		int multiplicity = power/5;
		while (multiplicity >= 1) {
			result = result.multiply(twoPowerFive);
			multiplicity--;
		} return result;
	}
	
	public int parseThroughBigInteger(BigInteger result) {
		int sum = 0;
		while (result.signum()==1) {
			BigInteger modTen = result.remainder(result.TEN);
			sum+=modTen.intValue();
			result = result.divide(result.TEN);
		} return sum;
	}
	
	public static void main(String[] args) {
		Problem16 im = new Problem16();
		int power = 1000;
		System.out.println(im.parseThroughBigInteger(im.result(power)));
	}
	
}
