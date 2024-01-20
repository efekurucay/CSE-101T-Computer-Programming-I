import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class Assignment2_TestYourProgram {
   public static void main (String[] args) {
      try {
         java.util.Scanner inp = new java.util.Scanner(System.in);
         System.out.print("Enter your student number: ");
         String id = inp.nextLine();
         String filename = "Assignment2_" + id;
         Process p = Runtime.getRuntime().exec("javac " + filename + ".java");
         p.waitFor();
         if(p.exitValue() != 0)
            System.out.println("ERROR: Something is wrong in your java program or filename.");
         else {
            System.out.println("Your program seems to compile and your filename is correct.");
            PrintWriter out = new PrintWriter("Assignment2_CompileMe.java");
            out.print("public class Assignment2_CompileMe { \n" +
                     "   public static void main(String[] args) {\n" +
                     "      String s;\n" +
                     "      boolean b;\n" +
                     "      double d;\n" +
                     "      s = Assignment2_" + id + ".formatCategoryName(\"test\");\n" +
                     "      b = Assignment2_" + id + ".isQuantityValid(0);\n" +
                     "      b = Assignment2_" + id + ".isWeightValid(0, 0);\n" +
                     "      s = Assignment2_" + id + ".gradeLetter(50.5);\n" +
                     "      d = Assignment2_" + id + ".gpaPoints(50.5);\n" +
                     "      s = Assignment2_" + id + ".status(50.5);\n" +
                     "   }\n" +
                     "}");
            out.close();
            p = Runtime.getRuntime().exec("javac Assignment2_CompileMe.java");
            p.waitFor();
            if(p.exitValue() != 0)
               System.out.println("ERROR: Something is wrong in your java program or method names.");
            else
               System.out.println("Your program seems to have correct method names.");
            File myFile = new File("Assignment2_CompileMe.java");
            myFile.delete();
            myFile = new File("Assignment2_CompileMe.class");
            myFile.delete();
         }
      } catch (Exception ex) {
         System.out.println("ERROR: Something is wrong in your java program or filename.");
      }
   }
}