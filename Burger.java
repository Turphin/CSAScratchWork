public class Burger {
   // instance variables
   private int numPatties;
   private int numBites;
   private String bunType;
   private String cheeseType;
   private boolean hasLettuce;
   private double gramsSauce;
   
   // constructors
   // no args - predefined
   public Burger() {
      numPatties = 2;
      numBites = 0;
      bunType = "Sesame";
      cheeseType = "Cheddar";
      hasLettuce = true;
      gramsSauce = 30.0;
   }
   // args - user defined
   public Burger(int numPatties, String bunType, String cheeseType, boolean hasLettuce, double gramsSauce) {
      this.numPatties = numPatties;
      this.numBites = 0;
      this.bunType = bunType;
      this.cheeseType = cheeseType;
      this.hasLettuce = hasLettuce;
      this.gramsSauce = gramsSauce;
   }
   
   // methods
   public void bite() {
      System.out.println("Chomp");
      numBites++;
   }
   public int getNumBites() {
      return numBites;
   }
   public static String getBurgerRecipe() {
      return "Cook burger patty and melt cheese on patty\nToast bun\nPlace patty on opened bun\nAdd condiments\nClose bun";
   }
   
   public static void main(String[] args) {
      // create burger with no args constructor
      Burger whopper = new Burger();
      // create burger with constructor with args
      Burger bigMac = new Burger(3,"Sesame","American",true,20);
      // take a bite
      whopper.bite();
      // print num bites from object method
      System.out.println(whopper.getNumBites());
      // print recipe from class method
      System.out.println(Burger.getBurgerRecipe());
   }
}