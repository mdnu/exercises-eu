/**
 * 2520 is the smallest number that can be divided
 * by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly
 * divisible by all of the numbers from 1 to 20?
 */

import java.util.ArrayList;
import java.util.List;

public class Problem05 {
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static List<Integer> primeList(int n) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i <= n; i++) {
			if (isPrime(i) == true) {
				list.add(i);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<Integer> mainList = new ArrayList<Integer>();
		mainList = primeList(20);
		double bigN = 1, limit = Math.sqrt(20);
		int index = 0;
		boolean check = true;
		
		while (index <= (mainList.size() - 1)) {
			double exponent = 1;
			
			if (check == true) {
				if (mainList.get(index) <= limit) {
					exponent = Math.floor(Math.log(20) / Math.log(mainList.get(index)));
				} else {
					check = false;
				}
			}
			bigN *= Math.pow(mainList.get(index), exponent);
			index++;
		}
		System.out.println((long)bigN);
	}
}
