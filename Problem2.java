// Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
// By starting with 1 and 2, the first 10 terms will be:
// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

// By considering the terms in the Fibonacci sequence whose values do 
// not exceed four million, find the sum of the even-valued terms.

class Problem2 {
  public static void main(String[] args) {
    int limit = 4000000;
    // 'sum' will be our final answer.
    int sum = 0;
    // auxilliary variables for the Fibonacci sequence.
    int a = 1;
    int b = 1;
    while (b < limit) {
      if (b%2 ==0) {
        sum+=b;
        //the above line adds the even valued term 'b',
      }
      // below is how we progress through the Fib sequence.
      int h=a+b;
      a=b;
      b=h;
    }
    System.out.println(sum);
  }
}