public class tester {
   public static void main (String[] args) {
   String result = "";
      String num = "73167176531";
      int multResult = 0;
      
      for (int i = 1; i <= (num.length()-3); i++) {
         int mult = 1;
         for (int j = i; j <= (i+3); j++) {
            System.out.print(num.substring(j-1, j) + " ");
            mult *= Integer.parseInt(num.substring(j-1,j));
         }
         System.out.print("= " + mult);
         if (mult > multResult) {
            multResult = mult;
            result = "";
            for (int j = i; j <= (i+3); j++) {
               result += num.substring(j-1,j);
            }
         }
         System.out.println();
      }
      System.out.println("Result: " + result);
   }
}