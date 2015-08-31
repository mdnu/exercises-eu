// 2520 is the smallest number that can be divided
// by each of the numbers from 1 to 10 without any remainder.
//
// What is the smallest positive number that is evenly
// divisible by all of the numbers from 1 to 20?

import java.util.ArrayList;
import java.util.List;

class Problem5 {

  // method checks for primality.
  public boolean isPrime(int n) {
    if (n <=1) {
      return false;
    }
    for (int i =2; i <= Math.sqrt(n); i++) {
      if (n%i == 0) {
        return false;
      }
    }
    return true;
  }
  // method generates a list of the first n-primes.
  public List<Integer> list(int n) {
    Problem5 prob5 = new Problem5();
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i <= n; i++) {
      if (prob5.isPrime(i) == true) {
        list.add(i);
      }
    }
    return list;
  }
  public static void main(String[] args) {
    Problem5 prob5 = new Problem5();
    List<Integer> mainlist = new ArrayList<Integer>();
    mainlist = prob5.list(20);
    double bigN = 1;
    int smalli = 0;
    boolean check = true;
    double limit = Math.sqrt(20);
    // loop starts here:
    while (smalli <= (mainlist.size()-1)) {
      double exponent = 1;
      if (check == true) {
        if (mainlist.get(smalli) <= limit) {
          exponent = Math.floor(Math.log(20)/Math.log(mainlist.get(smalli)));
        } else {
          check = false;
        }
      }
      bigN = bigN*(Math.pow(mainlist.get(smalli), exponent));
      smalli++;
    }
    System.out.println((long) bigN);
  }
}
