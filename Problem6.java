// The sum of the squares of the first ten natural numbers is 385
// The square of the sum of the first ten natural numbers is 3025
// Hence the difference between the sum of the squares of
// the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
// Find the difference between the sum of the squares of the
// first one hundred natural numbers and the square of the sum.

// goal: a program for when "limit" is large (>100)

class Problem6 {
  // this method computes the sum from 1 to limit.
  public int sum(int n) {
    int finalSum = (n*(n+1))/2;
    return finalSum;
  }
  // this method computes the sum of squares from 1 to limit.
  public int sqSum(int n) {
    int finalSqSum = (n*((2*n)+1)*(n+1))/6;
    return finalSqSum;
  }
  public static void main(String[] ars) {
    Problem6 prob6 = new Problem6();
    System.out.println(prob6.sum(100)*prob6.sum(100) - prob6.sqSum(100));
  }
}
