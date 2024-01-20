package chapter3;

import java.util.Scanner; 

public class LeapYear {
  public static void main(String args[]) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // Check if the year is a leap year 
    boolean isLeapYear = 
      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Display the result in a message dialog box
    System.out.println(year + " is a leap year? " + isLeapYear);
    
    if(year % 400 == 0)
       System.out.println(year + " is a leap year? true");
    else if(year % 100 == 0)
       System.out.println(year + " is a leap year? false");
    else if(year % 4 == 0)
       System.out.println(year + " is a leap year? true");
    else// if(year % 4 != 0)
       System.out.println(year + " is a leap year? false");
    
    // don't do this
    if(year == 2024)
       System.out.println(year + " is a leap year? true");
    else if(year == 2023)
       System.out.println(year + " is a leap year? false");
    
         
  } 
}
