//class declaration
public class pen {
   
   // instance variable
   String penColor;
   
   // constructor
   public pen() {
      penColor = "purple";
   }
   
   public pen(String color) {
      penColor = color;
   }
   
   // method declarations
   public String write(String wordToWrite) {
      return "writing in " + penColor + " ink: " + wordToWrite;
   }
   
   public String takeOffCap() {
      return "POP!";
   }
}