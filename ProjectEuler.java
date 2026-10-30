public class ProjectEuler {
   public static void main (String[] args) {
      System.out.println("The answer to problem 0 is: " + problem0());
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());
      System.out.println("The answer to problem 3 is: " + problem3());
      System.out.println("The answer to problem 4 is: " + problem4());
      System.out.println("The answer to problem 5 is: " + problem5());
      System.out.println("The answer to problem 6 is: " + problem6());
      System.out.println("The answer to problem 7 is: " + problem7());
      System.out.println("The answer to problem 8 is: " + problem8());
      System.out.println("The answer to problem 9 is: " + problem9());
      System.out.println("The answer to problem 10 is: " + problem10());
   }
   
   public static long findLargestFactor (long n) {
      long result = 0;
      for (long i = 2; i < n; i++) {
         if (n % i == 0) {
            if (i > n/i) {result = i;} else {result = n/i;}
            break;
         }
      }
      
      boolean prime = true;
      for (long i = 2; i < result; i++) {
         if (result % i == 0) {prime = false;}
      }
      
      if (prime == true) {return result;} else {result = findLargestFactor(result);}
      return result;
   }
   
   public static long problem0 () {
      long result = 0;
      long num = 435000;
      for (long i = 1; i <= num; i++) {
         long sq = (long)i*i;
         if (sq % 2 == 1) {result+=sq;}
      }
      return result;
   }
   
   public static long problem1 () {
      long result = 0;
      
      long i = 0;
      long res1 = 0;
      while (res1 < 1000) {
         res1 = 3 * i;
         if (res1 < 1000) {
            result += res1;
         }
         i++;
      }
      long j = 0;
      long res2 = 0;
      while (res2 < 1000) {
         res2 = 5 * j;
         if (res2 < 1000) {
            result += res2;
         }
         j++;
      }
      long k = 0;
      long res3 = 0;
      while (res3 < 1000) {
         res3 = 15 * k;
         if (res3 < 1000) {
            result -= res3;
         }
         k++;
      }
      return result;
   }
   
   public static long problem2 () {
      long result = 0;
      long term1 = 1;
      long term2 = 1;
      long term3 = 0;
      while (term2 < 4000000) {
         term3 = term1 + term2;
         if (term3 < 4000000 && term3 % 2 == 0) {
            result += term3;
         }
         term1 = term2;
         term2 = term3;
      }
      return result;
   }
   
   public static long problem3 () {
      long result = 0;
      long n = 600851475143L;
      
      result = findLargestFactor(n);
      
      return result;
   }
   
   public static long problem4 () {
      long result = 0;
      boolean end1 = false;
      boolean end2 = false;
      long f1 = 100;
      long f2 = 100;
      long r = 0;
      String rs = "";
      String rrs = "";
      while (end1 == false) {
      
         f1 = 100;
         end2 = false;
         
         while (end2 == false) {
            if (f1 < 1000) {
               r = f1 * f2;
               rs = String.valueOf(r);
               rrs = "";
               for (int i = rs.length(); i > 0; i--) {
                  rrs += rs.substring(i-1, i);
               }
               if ( rrs.equals(rs) && rrs.equals(String.valueOf(r)) ){
                  if (r > result) {
                     result = r;
                  }
                  // System.out.println("Palindrome found!");
               }
            }
         
            f1++;
            
            if (f1 >= 1000) {end2 = true;}
         }
         
         if (f2 >= 1000) {end1 = true;}
         
         f2++;
      }
      return result;
   }
   
   public static long problem5 () {
      long result = 0;
      boolean found = false;
      int i = 20;
      
      while (found == false) {
         boolean match = true;
         for (int j = 1; j <= 20; j++) {
            if (match == true && i % j == 0) {
               result = i;
            } else {
               match = false;
            }
         }
         if (match == true) {
            found = true;
         } else {i++;}
      }
      
      return result;
   }
   
   public static long problem6 () {
      long result = 0;
      long sumSquare = 0;
      long squareSum = 0;
      
      for (int i = 1; i <= 100; i++) {
         sumSquare += (long)Math.pow(i,2);
      }
      
      for (int i = 1; i <= 100; i++) {
         squareSum += i;
      }
      squareSum = (long)Math.pow(squareSum, 2);
      
      result = Math.abs(sumSquare - squareSum);
      return result;
   }
   
   public static long problem7 () {
      long result = 0;
      
      int i = 1;
      int j = 1;
      while (i <= 10001) {
         j++;
         boolean prime = true;
         for (int k = 2; k < j; k++) {
            if (j % k == 0 && j != 2) {prime = false;}
         }
         if (prime == true) {
            i++;
         }
      }
      result = j;
      
      return result;
   }
   
   public static long problem8 () {
      long result = 0;
      String factors = "";
      String num = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
      int numFactors = 13;
      int n = numFactors - 1;
      long multResult = 0;
      
      for (int i = 1; i <= (num.length()-n); i++) {
         long mult = 1;
         for (int j = i; j <= (i+n); j++) {
            mult *= Integer.parseInt(num.substring(j-1,j));
         }
         if (mult > multResult) {
            multResult = mult;
            factors = "";
            for (int j = i; j <= (i+n); j++) {
               factors += num.substring(j-1,j);
            }
         }
      }
      
      result = 1;
      System.out.println("Factors: " + factors);
      System.out.println("# factors: " + factors.length());
      for (int j = 1; j <= (factors.length()); j++) {
         result *= Integer.parseInt(factors.substring(j-1,j));
         System.out.println(j + ". " + Integer.parseInt(factors.substring(j-1,j)) + "->" + result);
      }

      return result;
   }
   
   public static long problem9 () {
      long result = 0;
      
      
      
      return result;
   }
   
   public static long problem10 () {
      long result = 0;
      
      
      
      return result;
   }
}