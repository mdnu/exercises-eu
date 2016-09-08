/**
 * The following iterative sequence is defined for the set of positive integers:
 * n -> n/2 (n is even)
 * n -> 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proven yet (Collatz problem), it is thought that all starting numbers
 * finish at 1.
 * Which starting number, under one million, produces the longest chain?
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Problem14 {
	public static long MAX = 1000000;
	public static void main(String[] args) {
		List<Integer> index = new ArrayList<Integer>();
	
		for (int i=0;i<=MAX+1;i++) {
			int count = 0;
			long work = i;
			
			while (work >1) {
				if (work < i) {
					count += index.get((int)work);
					break;
				} else if (work%2==0) {
					work /= 2;
					count++;
				} else {
					work = (3 * work) + 1;
					count++;
				}
			}
			index.add(i, count);
		}
		System.out.println(index.indexOf(Collections.max(index)));
	}
}
