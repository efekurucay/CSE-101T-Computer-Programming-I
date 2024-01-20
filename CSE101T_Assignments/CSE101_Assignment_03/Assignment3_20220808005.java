import java.util.Scanner;

/**
 * Assignment3_20220808005
 * Yahya Efe Kuruçay 12.12.2023
 */
public class Assignment3_20220808005 {
  
public static void formatCategoryName(String []name){

    for(int i=0; i<name.length ; i++){
        name[i]=formatCategoryName(name[i]);
    }
}

public static String formatCategoryName(String name) {
        // a. Format name with the first letter uppercase; 
        // all other letters lowercase
        // b. Takes one String type parameter
        //c. Returns a String
  name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
          return name;
        }
      
public static boolean isQuantityValid(int[] quantity){

  boolean control= true;

          for(int i=0; i<quantity.length; i++){

            if(quantity[i] <= 0){return false;}
            else{control= true;}
          }


          return control;
        }

public static boolean isWeightValid(int []weight){

    int totalWeight=0;
          for(int i=0; i< weight.length ; i++){
            totalWeight+=weight[i];
          }

          return totalWeight == 100 ;
        }
  
public static String gradeLetter(double grade){
  /*a. A method to determine the grade letter based on the grade calculated
  b. Takes one decimal parameter for the grade earned
  c. Returns a String for the grade letter(refer to assignment 1 for details)*/
       
          String gradeString="";
          if(grade >= 0 && grade <=34){
            gradeString="FF";
            }
            else if (grade >34 && grade <=45){
              gradeString="FD";
              }
            else if (grade >45 && grade <=52){
              gradeString="DD";
              }
            else if (grade >52&& grade <=59){
             gradeString="DC";
              }
            else if (grade >59 && grade <=66){
               gradeString="CC";
              }
            else if (grade >66&& grade <=73){
               gradeString="CB";
              }
            else if (grade >73 && grade <=80){
              gradeString="BB";
              }
             else if (grade >80 && grade <=87){
              gradeString="BA";
              }
             else if (grade >87&& grade <=100){
             gradeString="AA";
              }
              else {
              }
          return gradeString ;
          
      }
  
      public static double gpaPoints(double grade) {
        double gpa_points;
        if(grade<=34) {gpa_points=0.0;}
        else if(grade<=45) {gpa_points=0.5;}
        else if(grade<=52) {gpa_points=1.0;}
        else if(grade<=59) {gpa_points=1.5;}
        else if(grade<=66) {gpa_points=2.0;}
        else if(grade<=73) {gpa_points=2.5;}
        else if(grade<=80) {gpa_points=3.0;}
        else if(grade<=87) {gpa_points=3.5;}
        else {gpa_points=4.0;}
        return gpa_points;
      
  
  /*a. A method to determine the gpaPoints based on the grade calculated
  b. Takes one decimal parameter for the grade earned
  c. Returns a decimal for the GPA points(refer to assignment 1 for details)*/
      }
  
public static String status(double grade){
   /*a. A method to determine if the student passed based on the grade
  b. Takes one decimal parameter for the grade earned
  c.Returns a String containing the status of “passed”,“conditionally passed”,
  or “failed” (refer to assignment 1 for details) */
            String statusString="";
          
  if(grade >= 0 && grade <=45){statusString="Failed";}
  else if (grade >45 && grade <=59){statusString="Conditionally Passed";}
  else {statusString="Passed";}
  return statusString; }
  
public static int menu(Scanner inp,String[]list){
        for(int i =0 ; i<list.length; i++){
         System.out.println(i +" - "+ formatCategoryName(list[i]));
        }
        System.out.println("Q - to Quit");
        String input = inp.nextLine().toUpperCase();
        
        if(input.equalsIgnoreCase("Q")){
System.out.println("Thank you for using our system. Have a nice day.");
            return -1;}
        else{
            int inputint = Integer.parseInt(input);
            if(inputint >=0 && inputint < list.length){
            return inputint; }
            else{
              System.out.println("Invalid choice.");
              return menu(inp, list);}
        }
        


    }

public static boolean gradeControl(double grade){return grade>=0 && grade<=100;}

public static void calculateGrade(String[]category, int[] quantity,int[] weight){

if (category.length == quantity.length && quantity.length == weight.length){

      if (isWeightValid(weight)==false ){System.out.println("ERROR: Invalid weight entered");}
      else if (isQuantityValid(quantity)==false){System.out.println("ERROR: Invalid quantity entered");}

      else{ System.out.println("Welcome to our university grade system.");
            int choice = 0; int cg=0;
            int uzunluk=0; // grades lenght
           for(int i=0; i< quantity.length;i++){uzunluk += quantity[i];}
                        double [] grade = new double[uzunluk]; 
                        int whichcat =3; 
                        
            while(choice!=-1 && cg !=-1 ) {System.out.println("Please enter a choice below:");
                    Scanner scan = new Scanner(System.in);
                      String[] liste={"Enter all grades",
                    "Display grade information","Change a single grade"};
                    choice = menu(scan,liste);  
                    //0 - Enter all grades
                    if(choice==0){
                                double gradetest=0;
                                int m = 0; // counter 
                             for(int i=0; i< category.length;i++){
                                        
                                          for(int j = 1 ;  j<= quantity[i];j++){

                                            do{System.out.print("Please enter the grade for "+formatCategoryName(category[i])+" "+j+" >>");
                                            gradetest =scan.nextInt(); 

                                            if(gradeControl(gradetest)==true){ grade[m++]= gradetest;}
                                            else{System.out.println("The grade must be between 0 and 100. Enter again.");}
                                            
                                           
                                          
                                          }
                                            
                                            while(gradeControl(gradetest)==false);
                                              


                                            }}System.out.print("\n");}  

                    //1 - Display grade information
                    else if(choice==1){
                    System.out.println("Category Information:");
                      double sum=0; double average=0;int counter=0;double weighttimesum=0;
                      double overallgrade = 0;
                      
                      for (int a =0; a<category.length;a++) {
                        
                        if(a-1<0){counter=0;}
                        else{counter += quantity[a-1];}
                            
                        for(int i=0;i<quantity[a];i++){

                          sum += grade[counter+i];
                
                        }
                        average= sum/quantity[a]; 
                          System.out.println(formatCategoryName(category[a])+ " - "+average);
                        weighttimesum+= average*weight[a];
                        sum=0; average=0;
                      }

                      overallgrade= weighttimesum/100;
                System.out.print("\n");
                System.out.println("Overall Grade - "+overallgrade);
                System.out.println("Grade Letter - "+gradeLetter(overallgrade));
                System.out.println("GPA Points - "+gpaPoints(overallgrade));   
                System.out.println("Status - "+status(overallgrade)+"\n");   
}//elseifchoice==1

                    //2 - Change a single grade
                    else if(choice==2){
                      
                      System.out.println("Please Enter the category");

                          cg = menu(scan, category);
                          if(cg == -1){return;}
                          int eqgrade= 0;
                          for(int i=0;i<=cg; i++){

                            eqgrade+=quantity[i];

                          }
                          eqgrade --;
                          double newval= 0;
                          //FOR CATEGORIES THAT HAVE 1 QUANTITIES
                          if(quantity[cg]==1){

                            System.out.println("The current grade for "+formatCategoryName(category[cg])+" is "+ grade[eqgrade]);
                            System.out.print("Please enter the new value >> ");
                              do{
                              newval= scan.nextInt();
                            if(gradeControl(newval)==false){System.out.println("The grade must be between 0 and 100. Enter again.");}
                            else{grade[eqgrade]= newval;}

                             }while(gradeControl(newval)==false);
                          
                          
                          
                          }

                          //FOR CATEGORIES THAT HAVE 2 OR MORE QUANTITIES
                          else{
                            System.out.print("Please enter which "+formatCategoryName(category[cg])+" you would like to change (1 - "+quantity[cg]+") >> ");
                             whichcat= scan.nextInt(); 
                             if(whichcat>quantity[cg]|| whichcat<=0){System.out.println("Invalid choice."); }
                             else{
                              System.out.println("The current grade for "+formatCategoryName(category[cg])+" "+whichcat+" is "+grade[eqgrade-1]);
                             System.out.print("Please enter the new grade value >> ");
                             do{
                              newval= scan.nextInt();
                            if(gradeControl(newval)==false){System.out.println("The grade must be between 0 and 100. Enter again.");}
                            else{grade[eqgrade-1]= newval;}

                             }while(gradeControl(newval)==false);}
                             
                             
                            
                          }

                          
                        
                    
                    }

                    //Q - to Quit
                     else if (choice == -1 || cg == -1) {return; }
                    else{}}

                   
                      
  
}











}

else{System.out.println("ERROR: Array lengths are not all the same");}}


public static void main(String[] args) {
    String[] category = {"quIz", "homeWork","MidTerM exAm", "fiNal exaM"};
    int[]quantity={4,3,1,1};
    int[]weight={10,20,30,40};
   calculateGrade(category, quantity, weight);

  
   
}


}