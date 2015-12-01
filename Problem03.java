// The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?

class Problem03 {
	
	public static void main(String[] args) {
		long n = 600851475143L;
		
		if (n%2==0) {
			int lastFactor = 2;
			while (n%2==0) {
				n/=2;
			}
		}
		
		int lastFactor = 1; factor = 3;
		
		while (n>1) {
			if (n%factor==0) {
				lastFactor = factor;
				while (n%factor==0) {
					n/=factor;
				}
			}
			factor+=2;
		}
		
		System.out.println(lastFactor;)
	}
}