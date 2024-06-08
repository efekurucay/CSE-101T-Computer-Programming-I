import java.util.Scanner;

public class Assignment2_123456789 {
   public static void main0(String[] args) {
      for(int grade = 0; grade < 150; grade += 25) { 
         System.out.println(status(grade)); 
      }
   }
   
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("******** Category Information Entry ********\n");
      int totalwt = 0;
      int cat1cnt = 0, cat2cnt = 0, cat3cnt = 0, cat4cnt = 0, cat5cnt = 0;
      int cat1wt = 0, cat2wt = 0, cat3wt = 0, cat4wt = 0, cat5wt = 0;

      System.out.print("Please enter the name of the category 1: ");
      String cat1 = formatCategoryName(inp.nextLine());
      do {
         System.out.print("Please enter how many items of type " + cat1 + 
            " were given: ");
         cat1cnt = inp.nextInt();
      } while(!isQuantityValid(cat1cnt));
      do {
         System.out.print("Please enter the percentage weight of " + cat1 + 
            ": ");
         cat1wt = inp.nextInt();
      } while(!isWeightValid(cat1wt, totalwt));
      totalwt += cat1wt;
      inp.nextLine();

      System.out.print("Please enter the name of the category 2: ");
      String cat2 = formatCategoryName(inp.nextLine());
      do {
         System.out.print("Please enter how many items of type " + cat2 + 
            " were given: ");
         cat2cnt = inp.nextInt();
      } while(!isQuantityValid(cat2cnt));
      do {
         System.out.print("Please enter the percentage weight of " + cat2 + 
            ": ");
         cat2wt = inp.nextInt();
      } while(!isWeightValid(cat2wt, totalwt));
      totalwt += cat2wt;
      inp.nextLine();

      System.out.print("Please enter the name of the category 3: ");
      String cat3 = formatCategoryName(inp.nextLine());
      do {
         System.out.print("Please enter how many items of type " + cat3 + 
            " were given: ");
         cat3cnt = inp.nextInt();
      } while(!isQuantityValid(cat3cnt));
      do {
         System.out.print("Please enter the percentage weight of " + cat3 + 
            ": ");
         cat3wt = inp.nextInt();
      } while(!isWeightValid(cat3wt, totalwt));
      totalwt += cat3wt;
      inp.nextLine();

      System.out.print("Please enter the name of the category 4: ");
      String cat4 = formatCategoryName(inp.nextLine());
      do {
         System.out.print("Please enter how many items of type " + cat4 + 
            " were given: ");
         cat4cnt = inp.nextInt();
      } while(!isQuantityValid(cat4cnt));
      do {
         System.out.print("Please enter the percentage weight of " + cat4 + 
            ": ");
         cat4wt = inp.nextInt();
      } while(!isWeightValid(cat4wt, totalwt));
      totalwt += cat4wt;
      inp.nextLine();

      System.out.print("Please enter the name of the category 5: ");
      String cat5 = formatCategoryName(inp.nextLine());
      do {
         System.out.print("Please enter how many items of type " + cat5 + 
            " were given: ");
         cat5cnt = inp.nextInt();
      } while(!isQuantityValid(cat5cnt));
      do {
         System.out.print("Please enter the percentage weight of " + cat5 + 
            ": ");
         cat5wt = inp.nextInt();
      } while(!isWeightValid(cat5wt, totalwt));
      totalwt += cat5wt;
      inp.nextLine();

      if(totalwt != 100)
         System.out.println("\nERROR: The values sum to " + totalwt + 
            " but should sum to 100.");
      else {
         System.out.println("\n\n******** Student Grades Entry ********\n");
         System.out.println("Please enter values that " + 
            "the student earned for each item:");
         double cat1val = 0, cat2val = 0, cat3val = 0, cat4val = 0;
         double cat5val = 0;
         for(int i = 1; i <= cat1cnt && cat1wt > 0; i++) {
            System.out.print(cat1 + " " + i + ": ");
            cat1val += inp.nextDouble();
         }
         for(int i = 1; i <= cat2cnt && cat2wt > 0; i++) {
            System.out.print(cat2 + " " + i + ": ");
            cat2val += inp.nextDouble();
         }
         for(int i = 1; i <= cat3cnt && cat3wt > 0; i++) {
            System.out.print(cat3 + " " + i + ": ");
            cat3val += inp.nextDouble();
         }
         for(int i = 1; i <= cat4cnt && cat4wt > 0; i++) {
            System.out.print(cat4 + " " + i + ": ");
            cat4val += inp.nextDouble();
         }
         for(int i = 1; i <= cat5cnt && cat5wt > 0; i++) {
            System.out.print(cat5 + " " + i + ": ");
            cat5val += inp.nextDouble();
         }
         
         System.out.println("\n\n******** Student Results ********\n");
         System.out.println(cat1 + ": " + cat1val / cat1cnt);
         System.out.println(cat2 + ": " + cat2val / cat2cnt);
         System.out.println(cat3 + ": " + cat3val / cat3cnt);
         System.out.println(cat4 + ": " + cat4val / cat4cnt);
         System.out.println(cat5 + ": " + cat5val / cat5cnt);
         
         double grade = (cat1val / cat1cnt * cat1wt + cat2val / cat2cnt * 
            cat2wt + cat3val / cat3cnt * cat3wt + cat4val / cat4cnt * cat4wt + 
            cat5val / cat5cnt * cat5wt) / 100;
         
         System.out.println("The student has " + status(grade) + 
            " CSE 101 with a score of " + grade + ", GPA points of " + 
            gpaPoints(grade) + ", and a grade letter of " + 
            gradeLetter(grade));
         
                     
      }   
   }
   
   public static String formatCategoryName(String in) {
      return Character.toUpperCase(in.charAt(0)) + 
         in.substring(1).toLowerCase();
   }
   
   public static boolean isQuantityValid(int quantity) {
      return quantity > 0;
   }

   public static boolean isWeightValid(int weight, int total) {
      return weight >= 0 && total + weight <= 100;
   }
   
   public static String gradeLetter(double grade) {
      if (grade >= 88)
         return "AA";
      else if (grade >= 81)
         return "BA";
      else if (grade >= 74)
         return "BB";
      else if (grade >= 67)
         return "CB";
      else if (grade >= 60)
         return "CC";
      else if (grade >= 53)
         return "DC";
      else if (grade >= 46)
         return "DD";
      else if (grade >= 35)
         return "FD";
      else
         return "FF";
   }

   public static double gpaPoints(double grade) {
      if (grade >= 88)
         return 4.0;
      else if (grade >= 81)
         return 3.5;
      else if (grade >= 74)
         return 3.0;
      else if (grade >= 67)
         return 2.5;
      else if (grade >= 60)
         return 2.0;
      else if (grade >= 53)
         return 1.5;
      else if (grade >= 46)
         return 1.0;
      else if (grade >= 35)
         return 0.5;
      else
         return 0.0;
   }

   public static String status(double grade) {
      if (grade >= 60)
         return "passed";
      else if (grade >= 46)
         return "conditionally passed";
      else
         return "failed";
   }
}