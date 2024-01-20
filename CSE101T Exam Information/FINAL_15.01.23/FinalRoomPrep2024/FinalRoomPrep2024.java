// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintWriter;
import java.util.Scanner;

public class FinalRoomPrep2024 {
   public FinalRoomPrep2024() {
   }

   public static void main(String[] where) throws Exception {
      boolean a = false;
      if (a) {
         System.out.println("Why are you looking at the source file instead of running the program as instructed???");
      }

      new Scanner(System.in);
      PrintWriter out0 = new PrintWriter("file0.txt");
      PrintWriter out1 = new PrintWriter("file1.txt");
      long student = Long.parseLong(where[0]);
      if (student % 2L == 0L) {
         out0.println("BB01");
         out1.println("AMFI 4");
      } else {
         out0.println("AMFI 4");
         out1.println("BB01");
      }

      out0.close();
      out1.close();
   }
}
