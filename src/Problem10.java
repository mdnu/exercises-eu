/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */


import java.util.ArrayList;
import java.util.List;

public class Problem10 {
	public static void main(String[] args) {
		List<Long> list = new ArrayList<Long>();
		int n = 2000000;
		int rootn = (int) Math.sqrt(n);
		long sum = 0;
		boolean[] composite = new boolean[n + 1];
		
		for (int i = 2; i <= rootn; i++) {
			if (!composite[i]) {
				list.add(Long.valueOf(i));
				
				for (int k = i * i; k <= n; k += i) {
					composite[k] = true;
				}
			}
		}
		
		for (int i = rootn; i <= n; i++) {
			if (!composite[i]) {
				list.add(Long.valueOf(i));
			}
		}
		
		for (long j : list) {
			sum += j;
		}
		System.out.println(sum);
	}
}
