import java.util.Scanner;

public class Assignment3_123456789 {
   public static void main1(String[] args) {
      Scanner inp = new Scanner(System.in);
      String[] list = {"ITEM ONE", "item two"};
      int val = menu(inp, list);
      System.out.println("Returned value - " + val);
      val = menu(inp, list);
      System.out.println("Returned value - " + val);
   }

   public static void main2(String[] args) {
      String[] list = {"ITEM ONE", "item two"};
      formatCategoryName(list);
      System.out.println(list[0]);
      System.out.println(list[1]);
   }


   public static void main(String[] args) {
      String[] category = {"QUIZ", "homework", "MidTerm exam", "FINAL Exam"};
      int[] quantity = {4, 3, 1, 1};
      int[] weight = {10, 20, 30, 40};
      calculateGrade(category, quantity, weight);
   }
   
   public static void calculateGrade(String[] category, int[] quantity, int[] weight) {
      if(category.length != quantity.length || category.length != weight.length) {
         System.out.println("ERROR: Array lengths are not all the same");
         return;
      }
      double[][] grades = new double[quantity.length][];
      
      for(int i = 0; i < quantity.length; i++)
         if(!validQuantity(quantity[i])) {
            System.out.println("ERROR: Invalid quantity entered");
            return;
         }
      int totalWeight = 0;
      for(int i = 0; i < weight.length; i++)
         if(validWeight(weight[i], totalWeight)) {
            totalWeight += weight[i];
         } else {
            System.out.println("ERROR: Invalid weight entered");
            return;
         }
      if(totalWeight != 100) {
         System.out.println("ERROR: Invalid weight entered");
         return;
      }
      for(int i = 0; i < quantity.length; i++)
         grades[i] = new double[quantity[i]];
      formatCategoryName(category);
      
      Scanner inp = new Scanner(System.in);
      
      String[] option = {"Enter all grades", "Display grade information", "Change a single grade"};

      System.out.print("Welcome to our university grade system.");
      int choice = 0;
      do {
         System.out.println("\nPlease enter a choice below:");
         choice = menu(inp, option);
         
         switch(choice) {
            case 0:  for(int i = 0; i < grades.length; i++) {
                        for(int j = 0; j < grades[i].length; j++) {
                           System.out.print("Please enter grade for " + category[i] + 
                           (grades[i].length > 1 ? " " + (j+1) : "") + " >> ");
                           grades[i][j] = inp.nextDouble();
                        }
                     }
                     inp.nextLine();
                     break;
            case 2:  System.out.println("Please enter the category");
                     int cat = menu(inp, category);
                     if(cat >= 0 && cat < category.length) {
                        int item = 0;
                        if(grades[cat].length > 1) {
                           System.out.print("Please enter which " + category[cat] + " you would like to change (1 - " + grades[cat].length + ") >> ");
                           item = inp.nextInt() - 1;
                           inp.nextLine();
                        }
                        if(item >= 0 && item < grades[cat].length) {
                           System.out.println("The current grade for " + category[cat] +  
                              (grades[cat].length > 1 ? " " + (item+1) : "") + " is " +
                              grades[cat][item]);
                           System.out.print("Please enter the new grade value >> ");
                           grades[cat][item] = inp.nextDouble();
                           inp.nextLine();
                        }
                        else {
                           System.out.println("Invalid choice.");
                        }
                     }
                     else {
                        System.out.println("Invalid choice.");
                     }
                     break;

            case 1:  displayGrade(category, grades, weight);
                     break;

            case -1:  System.out.println("Thank you for using our system. Have a nice day.");
                     break;

            default: System.out.println("Invalid choice.");
                     break;


         }
      } while(choice != -1);
   }
   
   public static void displayGrade(String[] category, double[][] grades, int[] weight) {
      System.out.println("Category information:");
      for(int i = 0; i < grades.length; i++)
         System.out.println(category[i] + " - " + calcGrade(grades, i));
      double grade = calcGrade(grades, weight);
      System.out.println("\nOverall Grade - " + grade);
      System.out.println("Grade Letter - " + gradeLetter(grade));
      System.out.println("GPA Points - " + gpaPoints(grade));
      System.out.println("Status - " + status(grade));
      
      
   }
   

   public static double calcGrade(double[][] grades, int[] weight) {
      double grade = 0;
      for(int i = 0; i < grades.length; i++) {
         grade += calcGrade(grades, i) * weight[i] / 100;
      }
      return grade;
   }
   
   public static double calcGrade(double[][] grades, int cat) {
      double total = 0;
      for(int i = 0; i < grades[cat].length; i++)
         total += grades[cat][i];
      return total / grades[cat].length;
   }

   public static int menu(Scanner inp, String[] item) {
      for(int i = 0; i < item.length; i++)
         System.out.println(i + " - " + item[i]);
      System.out.println("Q - to Quit");
      char choice = inp.nextLine().charAt(0);
      if(choice == 'q' || choice == 'Q')
         return -1;
      else
         return (int)(choice - '0');
   }
   
   public static void formatCategoryName(String[] in) {
      for(int i = 0; i < in.length; i++)
         in[i] = formatCategoryName(in[i]);
   }
   
   public static String formatCategoryName(String in) {
      return Character.toUpperCase(in.charAt(0)) + in.substring(1).toLowerCase();
   }
   
   public static boolean validQuantity(int quantity) {
      return quantity > 0;
   }

   public static boolean validWeight(int weight, int total) {
      return weight >= 0 && total + weight <= 100;
   }
   
   public static String gradeLetter(double grade) {
      grade = Math.round(grade);
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
      grade = Math.round(grade);
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
      grade = Math.round(grade);
      if (grade >= 60)
         return "passed";
      else if (grade >= 46)
         return "conditionally passed";
      else
         return "failed";
   }
}