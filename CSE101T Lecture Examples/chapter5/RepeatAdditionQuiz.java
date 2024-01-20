package chapter5;

import java.util.Scanner;

public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number1 + " + " + number2 + "? ");
    int answer = input.nextInt();
    int count = 1;
    // We discussed this in class on Wednesday, 1-November-2023. I would like to 
    // limit the number of incorrect answers to only 5 before the system displays 
    // a message saying that the limit has been reached and shows the correct answer
    // The first five students who message me privately with the java code to 
    // provide this new functionality will receive 5 bonus points on the midterm exam.
    while (number1 + number2 != answer) {
      System.out.print("Wrong answer. Try again. What is " 
        + number1 + " + " + number2 + "? ");
      answer = input.nextInt();
      count++;
    }

    System.out.println("You got it!");
    System.out.println("It only took you " + count + " guesses!");
    
  }
}
