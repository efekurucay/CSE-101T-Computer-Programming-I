import java.util.Scanner;

public class WeirdStuff {
   public static void main(String[] args) {
      // a strange loop thing
//       int i;
//       for(i = 0; i < 10; i++);
//       {
//          System.out.println("i - " + i);
//       }
      
      Scanner inp = new Scanner(System.in);
      
      // get an integer
      System.out.print("Enter an integer: ");
      int myVal = inp.nextInt();
      
      // Do something based on myVal value
      
      // get some double values
//       System.out.print("Enter score 1: ");
//       double score1 = inp.nextDouble();
//       System.out.print("Enter score 2: ");
//       double score2 = inp.nextDouble();
//       
//       System.out.println("Score 1: " + score1 + 
//          "\nScore2: " + score2);
.      inp.nextLine();
//       // get some String values
      System.out.print("Enter name: ");
      String name = inp.nextLine();
      System.out.print("Enter surname: ");
      String surname = inp.nextLine();

      System.out.println("Name: " + name + 
         "\nSurname: " + surname);
   }
}