public class FindMinimum {
   public static void main (String[] args) {
      System.out.print("Smallest randomized integer: " + findMin());
   }
   
   public static int findMin() {
      int result = 100;
      for (int i = 0; i < 10; i++) {
         int num = (int)(Math.random()*100);
         if (num < result) {result = num;}
      }
      return result;
   }
}