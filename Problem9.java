// A Pythagorean triplet is a set of three natural numbers, a < b < c,
//for which, a^2 + b^2 = c^2. For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

import java.util.ArrayList;
import java.util.List;

class Problem9 {

  public int gcd(int a, int b) {
    Problem9 prob9 = new Problem9();
    if (b == 0) {
      return a;
    } else {
      return prob9.gcd(b,a%b);
    }
  }

/*   public int end(int k, int m, int sm, int s2) {
    Problem9 prob9 = new Problem9();
    while ((k < 2*m)&&(k<=sm)) {
      if ((sm%k == 0)&&(prob9.gcd(k,m)==1)) {
        int d = s2/(k*m);
        int n = k-m;
        int a = d*(m*m - n*n);
        int b = 2*d*m*n;
        int c = d*(m*m + n*n);
        // System.out.println("("+a+","+b+","+c+")");
        int product = a*b*c;
        break;
      }
      k+=2;
    }
  } */

  public static void main(String[] args) {
    Problem9 prob9 = new Problem9();
    int s = 1000;
    int s2 = s/2;
    double mLimit = Math.ceil(Math.sqrt(s2));
    for (int m = 2; m<=mLimit;m++) {
      if (s2%m == 0) {
        int sm = s2/m;
        while (sm%2 == 0) {
          sm = sm/2;
        }
        if (m%2 == 1) {
          int k = m+2;
          while ((k < 2*m)&&(k<=sm)) {
            if ((sm%k == 0)&&(prob9.gcd(k,m)==1)) {
              int d = s2/(k*m);
              int n = k-m;
              int a = d*(m*m - n*n);
              int b = 2*d*m*n;
              int c = d*(m*m + n*n);
              // System.out.println("("+a+","+b+","+c+")");
              System.out.println(a*b*c);
              break;
            }
            k+=2;
          }
        } else if (m%2 == 0) {
          int k = m+1;
          while ((k < 2*m)&&(k<=sm)) {
            if ((sm%k == 0)&&(prob9.gcd(k,m)==1)) {
              int d = s2/(k*m);
              int n = k-m;
              int a = d*(m*m - n*n);
              int b = 2*d*m*n;
              int c = d*(m*m + n*n);
              // System.out.println("("+a+","+b+","+c+")");
              System.out.println(a*b*c);
              break;
            }
            k+=2;
          }
        }
      }
    }
  }
}