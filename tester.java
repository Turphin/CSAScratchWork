public class tester {
   public static void main (String[] args) {
      System.out.println(isPrime(13195));
   }
   
   public static boolean isPrime (long n) {
      boolean result = true;
      for (int i = 2; i < n; i++) {
         if (n % i == 0) {result = false;}
      }
      return result;
   }
}