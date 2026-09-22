public class AintNoSunshine {
   public static void main (String[] args) {
      String aintNo = "Ain't no sunshine when she's gone";
      String andThis = "And this house just ain't no home";
      // verse 1
      Chorus(aintNo, "It's not warm when she's away", "And she's always gone too long");
      
      // verse 2
      Chorus("Wonder this time where she's gone", "Wonder if she's gone to stay", andThis);
      
      // verse 3 
      System.out.print("And ");
      for (int i = 0; i < 5; i++) {
         IKnowLine();
      }
      System.out.println("I Know, I Know,\n");
      
      // verse 4
      System.out.println("Hey, I ought to leave young thing alone,");
      System.out.println("But "+aintNo+", woah-woah,\n");
      
      // verse 5
      Chorus(aintNo, "Only darkness every day", andThis);
      
      // verse 6
      for (int i = 0; i < 3; i++) {
         System.out.println("Anytime she goes away,");
      }
   }
   public static void IKnowLine () {
      for (int i = 0; i < 5; i++) {
         IKnow();
      }
      System.out.println();
   }
   public static void IKnow () {
      System.out.print("I Know, ");
   }
   public static void Chorus(String var1,String var2, String var3) {
      System.out.println(var1+",");
      System.out.println(var2+",");
      System.out.println("Ain't no sunshine when she's gone,");
      System.out.println(var3+",");
      System.out.println("Anytime she goes away,\n");
   }
}