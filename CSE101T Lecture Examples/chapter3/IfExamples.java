import java.util.Scanner;

public class IfExamples {
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int val = inp.nextInt();
      if(val < 0 || val > 100)
         System.out.println("ERROR:");
//         System.exit(1);
      else {
         
         System.out.println("Valid");
         System.out.println("I will do the rest now");
         // put rest of program inside this else
      }
     
      
//       if(val >= 0 && val <= 100) {
//          System.out.print("Valid");
//          // put rest of program inside this else
//       } else {
//          System.out.print("ERROR:");
// //         System.exit(1);
//       }
// 
//       if(val >= 0 || val <= 100) {
//          System.out.print("Valid");
//          // put rest of program inside this else
//       } else {
//          System.out.print("ERROR:");
// //         System.exit(1);
//       }
   }
   
}