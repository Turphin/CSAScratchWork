public class tester {
   public static void main (String[] args) {
      int j = 8;
      boolean prime = true;
      for (int k = 2; k < j; k++) {
         if (j % k == 0 && j != 2) {prime = false; break;}
      }
      if (true) {
         if (true) {
            System.out.println(prime);
            System.out.println(j);
            System.out.println("-----------------");
         }
      }

   }
   
   public static boolean isPrime (long n) {
      boolean result = true;
      for (int i = 2; i < n; i++) {
         if (n % i == 0) {result = false;}
      }
      return result;
   }
}