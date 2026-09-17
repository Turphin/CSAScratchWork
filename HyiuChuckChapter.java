// Jayden Chang - CSE 121 AP Computer Science A

import java.util.Scanner;

public class HyiuChuckChapter {
   public static void main(String[] args) {
      // define variables
      int lodgeNumber = 502;
      int councilNumber = 609;
      String chapterName = "Hyiu Chuck Chapter";
      String districtName = "Seattle Territory";
      String lodgeName = "T\'Kope Kwiskwis Lodge";
      String councilName = "Chief Seattle Council";
      double duesCost = 15.00;
      boolean chapterIsActive = true;
      int duesPayingMembers;
      int activeMembers;
      double chapterBudget;
      double percentMembersActive;
      
      // request inputs
      System.out.println("How many chapter members have paid their dues this year?");
      System.out.print("> ");
      Scanner Scan = new Scanner(System.in);
      duesPayingMembers = Scan.nextInt();
      System.out.println("How many chapter members show up to meetings (on average)?");
      System.out.print("> ");
      activeMembers = Scan.nextInt();
      Scan.close();

      // process inputs
      chapterBudget = duesPayingMembers * 2.00;
      percentMembersActive = (1.0 * activeMembers / duesPayingMembers * 100.0);
      
      // output results
      System.out.println();
      System.out.println("Chapter statistics for " + chapterName);
      System.out.println("OA Lodge: " + lodgeName + " " + lodgeNumber);
      System.out.println("Scouting Council: " + councilName + " " + councilNumber);
      System.out.println("Associated District/Territory: " + districtName);
      System.out.println("Number of dues paying members: " + duesPayingMembers);
      System.out.println("Number of members who actively attend meetings: " + activeMembers);
      System.out.println("Annual Chapter Budget: $" + chapterBudget);
      System.out.println("Percentage of members who are active: " + (((int) (percentMembersActive * 100.0)) / 100.0) + "%");

   }
}