/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c,
 * for which, a^2 + b^2 = c^2. For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class Problem09 {
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
	
	public static int calculate(int sm, int s2, int k, int m) {
		int d = s2 / (k * m), n = k - m;
		int a = d * (m * m - n * n), b = 2 * d * m * n, c = d * (m * m + n * n);
		int product = a * b * c;
		return product;
	}
	
	public static void main(String[] args) {
		int s = 1000;
		int s2 = s/2;
		double mLimit = Math.ceil(Math.sqrt(s2));
		
		for (int m = 2; m <= mLimit; m++) {
			if (s2 % m == 0) {
				int sm = s2 / m;
				
				while (sm % 2 == 0) {
					sm /= 2;
				}
				
				if (m % 2 == 1) {
					int k = m + 2;
					
					while ((k < 2 * m) && (k <= sm)) {
						if ((sm % k == 0) && (gcd(k,m) == 1)) {
							System.out.println(calculate(sm, s2, k, m));
							break;
						}
						k += 2;
					}
				} else if (m % 2 == 0) {
					int k = m + 1;
					
					while ((k < 2 * m) && (k <= sm)) {
						if ((sm % k == 0) && (gcd(k,m) == 1)) {
							System.out.println(calculate(sm, s2, k, m));
							break;
						}
						k += 2;
					}
				}
			}
		}
	}
}
