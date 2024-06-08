import java.util.Scanner;

public class Assignment1b_123456789 {
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("Please enter the grading weight (percentages) for the following categories:");
      System.out.print("Quizzes: ");
      int quiz = inp.nextInt();
      if(quiz < 0)
         quiz = -quiz;
      System.out.print("Homework: ");
      int hw = inp.nextInt();
      if(hw < 0)
         hw = -hw;
      System.out.print("Midterm Exam: ");
      int mid = inp.nextInt();
      if(mid < 0)
         mid = -mid;
      System.out.print("Final Exam: ");
      int fin = inp.nextInt();
      if(fin < 0)
         fin = -fin;
      int total = quiz + hw + mid + fin;
      if(total != 100)
         System.out.println("ERROR: The values sum to " + total + " but should sum to 100.");
      else {
         System.out.println("Please enter what Joseph Ledet earned for each category:");
         System.out.print("Quizzes: ");
         double jlquiz = inp.nextDouble();
         System.out.print("Homework: ");
         double jlhw = inp.nextDouble();
         System.out.print("Midterm Exam: ");
         double jlmid = inp.nextDouble();
         System.out.print("Final Exam: ");
         double jlfin = inp.nextDouble();
         
         double grade = (jlquiz * quiz + jlhw * hw + jlmid * mid + jlfin * fin) / 100;
         
         if (grade > 88)
            System.out.println("Joseph Ledet passed CSE 101 with a score of " + grade + ", GPA points of 4.0, and a grade letter of AA");
         else if (grade > 81)
            System.out.println("Joseph Ledet passed CSE 101 with a score of " + grade + ", GPA points of 3.5, and a grade letter of BA");
         else if (grade > 74)
            System.out.println("Joseph Ledet passed CSE 101 with a score of " + grade + ", GPA points of 3.0, and a grade letter of BB");
         else if (grade > 67)
            System.out.println("Joseph Ledet passed CSE 101 with a score of " + grade + ", GPA points of 2.5, and a grade letter of CB");
         else if (grade > 60)
            System.out.println("Joseph Ledet passed CSE 101 with a score of " + grade + ", GPA points of 2.0, and a grade letter of CC");
         else if (grade > 53)
            System.out.println("Joseph Ledet conditionally passed CSE 101 with a score of " + grade + ", GPA points of 1.5, and a grade letter of DC");
         else if (grade > 46)
            System.out.println("Joseph Ledet conditionally passed CSE 101 with a score of " + grade + ", GPA points of 1.0, and a grade letter of DD");
         else if (grade > 35)
            System.out.println("Joseph Ledet failed CSE 101 with a score of " + grade + ", GPA points of 0.5, and a grade letter of FD");
         else
            System.out.println("Joseph Ledet failed CSE 101 with a score of " + grade + ", GPA points of 0.0, and a grade letter of FF");
                     
      }   
   }
}