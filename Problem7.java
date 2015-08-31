// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
// we can see that the 6th prime is 13.
//
// What is the 10 001st prime number?

class Problem7 {
  public boolean isPrime(int n) {
    if (n == 1) {
      return false;
    } else {
      if (n < 4) {
        return true;
      } else {
        if (n%2 ==0) {
          return false;
        } else {
          if (n < 9) {
            return true;
          } else {
            if (n%3 ==0) {
              return false;
            } else {
              double r = Math.floor(Math.sqrt(n));
              double f = 5;
              while (f<=r) {
                if (n%f == 0) {
                  return false;
                } else {
                  if (n%(f+2) ==0) {
                    return false;
                  }
                }
                f+=6;
              }
              return true;
            }
          }
        }
      }
    }
  }
  public static void main(String[] args) {
    Problem7 prob7 = new Problem7();
    int limit = 10001;
    int count = 1;
    int grand = 1;
    while (grand <= limit) {
      if (prob7.isPrime(count) == true) {
        if (grand == limit) {
          System.out.println(count);
        }
        count++;
        grand++;
      } else {
        count++;
      }
    }
  }
}
