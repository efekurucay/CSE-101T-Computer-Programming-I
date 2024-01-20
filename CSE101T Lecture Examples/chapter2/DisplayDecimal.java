import java.util.Scanner;

public class DisplayDecimal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first decimal number: ");
    double first = input.nextDouble();
    
    System.out.print("Enter second decimal number: ");
    double second = input.nextDouble();

    double product = first * second;
    double quotient = first / second;
    
    System.out.println("product: " + product);
    System.out.println("quotient: " + quotient);
    

    System.out.println("product to 3 decimal places " + "TODO");
    System.out.println("quotient to 3 decimal places " + "TODO");

    System.out.println("product to 3 decimal places " + "TODO");
    System.out.println("quotient to 3 decimal places " + "TODO");
  }
}
