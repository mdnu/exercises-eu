// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
// we can see that the 6th prime is 13.
//
// What is the 10 001st prime number?

class Problem07 {
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
  
  public int limitnum (int a) {
	 int limit = a;
	 return limit;
  }
  
  public int primeDivCount (int limitnum) {
	  int count = 0;
	  Problem07 prob7 = new Problem07();
	  for (int i = 1; i<=Math.sqrt(limitnum); i++) {
		  if (prob7.isPrime(i) == true) {
			  count++;
		  }
	  }
	  return count;
  }
  
  public static void main(String[] args) {
    Problem07 prob7 = new Problem07();
	int limit = prob7.limitnum(10);
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
