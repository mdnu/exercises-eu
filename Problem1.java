// If we list all the natural numbers below 10 that are multiples of 3 or 5,
// we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Find the sum of all the multiples of 3 or 5 below 1000.

class Problem1 {
  public int max = 999;
  // a method to sum all numbers divisible by n, smaller than 1k
  public int SumDivN(int n) {
    int p = max/n;
    return (n*(p*(p+1)))/2;
  }
  public static void main(String[] args) {
    // creates a new instance (object) of the 'Problem1' class,
    // called 'aN'.
    // using this instance, we can invoke the SumDivN method.
    Problem1 aN = new Problem1();
    System.out.println(aN.SumDivN(3) + aN.SumDivN(5)- aN.SumDivN(15));
  }
}
