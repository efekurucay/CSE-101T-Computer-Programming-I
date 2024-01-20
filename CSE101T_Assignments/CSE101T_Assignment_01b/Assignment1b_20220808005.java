import java.util.Scanner;
/*
*-----------------------------------------------------
* Akdeniz University CSE101T Assignments
* Name: Yahya Efe Kurucay
* Date: 12.11.2023
* Description: Assignment1b
* Score: 44
* Website: https://efekurucay.com
*-----------------------------------------------------
 */
public class Assignment1b_20220808005 {
    
public static void main(String[] args) {
    
int gp_quiz;
int gp_homework;
int gp_midterm;
int gp_final;
double sp_quiz;
double sp_homework;
double sp_midterm;
double sp_final;
Scanner input = new Scanner(System.in);
//GRADING PERCENTAGE (gp)
System.out.println("Enter the grading percentage ");
System.out.println("for the following categories");
//QUIZZES
System.out.print("Quizzes: ");
gp_quiz = input.nextInt();
if ((gp_quiz > 100 )|| (gp_quiz <0 )){ 
System.out.println("ERROR:Invalid value entered(must be between 0 and 100)");}
else{ System.out.print("Homework: ");
//HOMEWORK
gp_homework = input.nextInt();
if ((gp_homework> 100 )|| (gp_homework <0 )){ 
System.out.println("ERROR:Invalid value entered(must be between 0 and 100)");}
else{ System.out.print("Midterm Exam: ");
//MIDTERM EXAM
gp_midterm = input.nextInt();
if ((gp_midterm> 100 )|| (gp_midterm <0 )){ 
System.out.println("ERROR:Invalid value entered(must be between 0 and 100)");}
else{ System.out.print("Final Exam: " );
//FINAL EXAM 
gp_final = input.nextInt();
if ((gp_final> 100 )|| (gp_final <0 )){ 
System.out.println("ERROR:Invalid value entered(must be between 0 and 100)");}
else{  
int total = gp_final+gp_homework+gp_midterm+gp_quiz;
if( total!= 100 ){
System.out.print("ERROR: The values sum to "+ total +" but shoul sum to 100.");}
else{

//STUDENT POINTS (sp)
System.out.println
("Enter the what Yahya Efe Kuruçay earned for each category: ");

//QUIZ SP
 System.out.print("Quizzes: ");
sp_quiz = input.nextDouble();
if(sp_quiz< 0 || sp_quiz > 100){
System.out.println("ERROR:Invalid value entered(must be between 0 and 100)");}
 else{System.out.print("Homework: ");
//HOMEWORK SP  
sp_homework = input.nextDouble();
if(sp_homework< 0||sp_homework > 100){
System.out.println("ERROR:Invalid value entered(must be between 0 and 100)");}
else{System.out.print("Midterm: ");
//MIDTERM SP
sp_midterm = input.nextDouble();
 if(sp_midterm < 0 ||  sp_midterm > 100){
System.out.println("ERROR:Invalid value entered (must be between 0 and 100)");}
else{System.out.print("Final: ");  
//FINAL SP
sp_final = input.nextDouble();
if(sp_final< 0 ||  sp_final > 100){
System.out.println("ERROR:Invalid value entered(must be between 0 and 100)");}
else{  // BURDA BUTUN DEĞERLER OKAY 

//MATHS

double quiznote = gp_quiz*sp_quiz / 100 ;
double homeworknote = gp_homework * sp_homework /100 ;
double midtermnote = gp_midterm * sp_homework /100;
double finalnote = gp_final* sp_final /100;
double totalnote = quiznote + homeworknote + midtermnote + finalnote ;

if(totalnote >= 0 && totalnote <=34){
System.out.print("GPA: "+ (totalnote/25)+ " FF , Failed");}
else if (totalnote >34 && totalnote <=45){
    System.out.print("GPA: "+ (totalnote/25)+ " FD , Failed");}
else if (totalnote >45 && totalnote <=52){
    System.out.print("GPA: "+ (totalnote/25)+ " DD, Conditionally Passed");}
else if (totalnote >52&& totalnote <=59){
    System.out.print("GPA: "+ (totalnote/25)+ "DC , Conditionally Passed");}
else if (totalnote >59 && totalnote <=66){
    System.out.print("GPA: "+ (totalnote/25)+ "CC , Passed");}
else if (totalnote >66&& totalnote <=73){
    System.out.print("GPA: "+ (totalnote/25)+ "CB , Passed");}
else if (totalnote >73 && totalnote <=80){
    System.out.print("GPA: "+ (totalnote/25)+ "BB , Passed");}
 else if (totalnote >80 && totalnote <=87){
    System.out.print("GPA: "+ (totalnote/25)+ "BA , Passed");}
 else if (totalnote >87&& totalnote <=100){
    System.out.print("GPA: "+ (totalnote/25)+ "AA , Passed");}

                                            }
                                        }
                                    }
                                }
                            }
                        }  
                    }
                }
            }
        }
    }














 









    


