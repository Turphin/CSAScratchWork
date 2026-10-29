public class ProjectEuler {
   public static void main (String[] args) {
      System.out.println("The answer to problem 0 is: " + problem0());
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());
      System.out.println("The answer to problem 3 is: " + problem3());
      System.out.println("The answer to problem 4 is: " + problem4());
      System.out.println("The answer to problem 5 is: " + problem5());
   }
   
   public static boolean isPrime (long n) {
      boolean result = true;
      for (long i = 2; i < n; i++) {
         if (n % i == 0) {result = false;}
      }
      return result;
   }
   
   public static long findLargestFactor (long n) {
      long result = 0;
      boolean found = false;
      for (long i = 2; i < n; i++) {
         if (n % i == 0) {
            if (i > n/i) {result = i;} else {result = n/i;}
            break;
         }
      }
      if (isPrime(result)) {return result;} else {result = findLargestFactor(result);}
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
}