import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Assignment4_123456789 {
   public static void main(String[] args) throws Exception {
      String cd, ss, sg, el;
      if(args.length == 1) {
         cd = args[0] + "_CourseDetails.txt";
         ss = args[0] + "_StudentScores.txt";
         sg = args[0] + "_StudentGrades.txt";
         el = args[0] + "_Errors.log";
      } else if(args.length == 4) {
         cd = args[0] + ".txt";
         ss = args[1] + ".txt";
         sg = args[2] + ".txt";
         el = args[3] + ".log";
      } else {
         System.out.println("ERROR: invalid number of arguments.");
         return;
      }
        
      int count = countCategory(cd);
      String[] category = new String[count];
      int[] quantity = new int[count];
      int[] weight = new int[count];
      getCategory(category, quantity, weight, cd);
      
      boolean valid = true;
      PrintWriter log = new PrintWriter(el);
      
      for(int i = 0; i < quantity.length; i++)
         if(!validQuantity(quantity[i])) {
            log.println("ERROR: Negative quantity entered");
            valid = false;
         }
      int totalWeight = 0;
      for(int i = 0; i < weight.length; i++)
         if(validWeight(weight[i], totalWeight)) {
            totalWeight += weight[i];
         } else {
            log.println("ERROR: Course details - invalid weight - either over 100 or negative");
            valid = false;
         }
      if(totalWeight != 100) {
         log.println("ERROR: Course details - invalid weight - does not sum to 100");
         valid = false;
      }
      log.close();
      if (valid)
         courseGrade(category, quantity, weight, ss, sg, el);
   }
   
   public static int countCategory(String filename) throws Exception {
      Scanner inp = new Scanner(new File(filename));
      int count = 0;
      while(inp.hasNext()){
         inp.nextLine();
         count++;
      }
      return count;

   }
   
   public static void getCategory(String[] cat, int[] quantity, int[] weight, String file) throws Exception {
      Scanner input = new Scanner(new File(file));
      int i;
      for(i = 0; input.hasNext(); i++) {
         cat[i] = input.next();
         quantity[i] = input.nextInt();
         weight[i] = input.nextInt();
         input.nextLine();
      }
      while(i < cat.length) {
         cat[i] = "";
         quantity[i] = 0;
         weight[i] = 0;
         i++;
      }
         
   }
   

   public static void courseGrade(String[] category, int[] quantity, int[] weight, String ss, String sg, String el) throws Exception {
      double[][] grades = new double[quantity.length][];
      String[] name = new String[countCategory(ss)];
      double[] gradeCalc = new double[name.length];
      for(int i = 0; i < quantity.length; i++)
         grades[i] = new double[quantity[i]];
      Scanner inp = new Scanner(new File(ss));
      int s = 0;
      while(inp.hasNext()){
         boolean valid = true;
         name[s] = inp.next();
         for(int i = 0; i < grades.length; i++) {
            for(int j = 0; j < grades[i].length; j++) {
               grades[i][j] = inp.nextDouble();
               if (grades[i][j] < 0)
                  valid = false;
            }
         }
         
         if(valid)
            gradeCalc[s++] = calcGrade(grades, weight);
         else
            gradeCalc[s++] = -1;
      }
      writeGrades(name, gradeCalc, sg, el);
      inp.close();
   }
   
   public static void writeGrades(String[] name, double[] grade, String sg, String el) throws Exception {
      PrintWriter out = new PrintWriter(sg);
      PrintWriter log = new PrintWriter(el);
      for(int i = 0; i < name.length; i++)
         if(grade[i] >= 0)
            out.println(name[i] + " "  + grade[i] + " " + gradeLetter(grade[i]) + " " + 
               gpaPoints(grade[i]) + " " + status(grade[i]));
         else
            log.println("ERROR: Student " + name[i] + " - cannot calculate due to invalid grade entered");
      out.close();
      log.close();
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

   public static int displayMenu(String[] item, Scanner inp) {
      for(int i = 0; i < item.length; i++)
         System.out.println((i+1) + " - " + item[i]);
      System.out.println("0 - to Exit");
      return inp.nextInt();
   }
   
   public static void capitalize(String[] in) {
      for(int i = 0; i < in.length; i++)
         in[i] = capitalize(in[i]);
   }
   
   public static String capitalize(String in) {
      return Character.toUpperCase(in.charAt(0)) + in.substring(1).toLowerCase();
   }
   
   public static boolean validQuantity(int quantity) {
      return quantity > 0;
   }

   public static boolean validWeight(int weight, int total) {
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