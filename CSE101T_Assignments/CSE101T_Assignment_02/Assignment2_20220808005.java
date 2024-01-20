import java.util.Scanner;

/**
 * Assignment2_20220808005 @efekurucay24 
   @2023* 
*-----------------------------------------------------
* Akdeniz University CSE101T Assignments
* Name: Yahya Efe Kurucay
* Date: 13.11.2023
* Description: Assignment2
* Score: 84
* Website: https://efekurucay.com
*-----------------------------------------------------
 */
public class Assignment2_20220808005 {

public static String formatCategoryName(String name) {
      // a. Format name with the first letter uppercase; 
      // all other letters lowercase
      // b. Takes one String type parameter
      //c. Returns a String
name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return name;
      }
    
public static boolean isQuantityValid(int quantity){
//a. A method to verify the quantity is valid
//b. Takes an integer type parameter for the current quantity
//c. Returns a boolean
//i. True if quantity is positive
//ii. False for all other values

        return quantity > 0 ;
      }
public static boolean isWeightValid(int weight, int totalWeight){
/*a. A method to verify the weight is valid
b.Takes two integer type parameters for the weight and total weight so far
c. Returns a boolean
i. True if weight is non-negative and totalWeight + weight is not 
greater than 100
ii. False for all other values */
        
        return weight >= 0 && totalWeight + weight<= 100 ;
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

public static double gpaPoints(double grade){
          if (grade >= 88 && grade <= 100){
            return 4.0;
          }        
          else if (grade >= 81 && grade < 88){
            return 3.5;
          }
          else if (grade >= 74 && grade < 81){
            return 3.0;
          }
          else if (grade >= 67 && grade < 74){
              return 2.5;
        }
        else if (grade >= 60 && grade < 67){
            return 2.0;
        }
        else if (grade >= 53 && grade < 60){
            return 1.5;
        }
        else if (grade >= 46 && grade < 53){
            return 1.0;
        }
        else if (grade >= 35 && grade < 46){
            return 0.5;
        }
        else {
            return 0.0;
            }

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

//MAIN METHOD
    public static void main(String[] args) {
        
    Scanner scannerString=new Scanner(System.in);
    Scanner scannerInt=new Scanner(System.in);
    System.out.println("********** Category Information Entry **********");
//CATEGORY 1 ***********
    //Name of cat 1
    System.out.print("Please enter the name of the category 1: ");
    String cat1name=formatCategoryName(scannerString.nextLine());

    //Items of cat 1 
    int cat1items;
do{
System.out.print("Please enter how many items of type ");
System.out.print(cat1name+" were given: ");
cat1items= scannerInt.nextInt();}
while(isQuantityValid(cat1items)==false);

    //Percentage of cat 1
    int cat1weight;int totalWeight=0;
do{
System.out.print("Please enter the percentage weight of "+cat1name+": ");
cat1weight=scannerInt.nextInt();}
while(isWeightValid(cat1weight,totalWeight)==false);
totalWeight+=cat1weight;

//CATEGORY 2 ***********
    //Name of cat 2
    System.out.print("Please enter the name of the category 2: ");
    String cat2name=formatCategoryName(scannerString.nextLine());
   
    //Items of cat 2
    int cat2items;
do{
System.out.print("Please enter how many items of type ");
System.out.print(cat2name+" were given: ");
cat2items= scannerInt.nextInt();}
while(isQuantityValid(cat2items)==false);

    //Percentage of cat 2
    int cat2weight;
do{
System.out.print("Please enter the percentage weight of "+cat2name+": ");
cat2weight=scannerInt.nextInt();}
while(isWeightValid(cat2weight,totalWeight)==false);
totalWeight+=cat2weight;

//CATEGORY 3***********
    //Name of cat 3
    System.out.print("Please enter the name of the category 3: ");
    String cat3name=formatCategoryName(scannerString.nextLine());
   
    //Items of cat 3
    int cat3items;
do{
System.out.print("Please enter how many items of type ");
System.out.print(cat3name+" were given: ");
cat3items= scannerInt.nextInt();}
while(isQuantityValid(cat3items)==false);

    //Percentage of cat 3
    int cat3weight;
do{
System.out.print("Please enter the percentage weight of "+cat3name+": ");
cat3weight=scannerInt.nextInt();}
while(isWeightValid(cat3weight,totalWeight)==false);
totalWeight+=cat3weight;

//CATEGORY 4***********
    //Name of cat 4
    System.out.print("Please enter the name of the category 4: ");
    String cat4name=formatCategoryName(scannerString.nextLine());
   
    //Items of cat 4
    int cat4items;
do{
System.out.print("Please enter how many items of type ");
System.out.print(cat4name+" were given: ");
cat4items= scannerInt.nextInt();}
while(isQuantityValid(cat4items)==false);

    //Percentage of cat 4
    int cat4weight;
do{
System.out.print("Please enter the percentage weight of "+cat4name+": ");
cat4weight=scannerInt.nextInt();}
while(isWeightValid(cat4weight,totalWeight)==false);
totalWeight+=cat4weight;

//CATEGORY 5***********
    //Name of cat 5
    System.out.print("Please enter the name of the category 5: ");
    String cat5name=formatCategoryName(scannerString.nextLine());
   
    //Items of cat 5
    int cat5items;
do{
System.out.print("Please enter how many items of type ");
System.out.print(cat5name+" were given: ");
cat5items= scannerInt.nextInt();}
while(isQuantityValid(cat5items)==false);

    //Percentage of cat 5
    int cat5weight;
do{
System.out.print("Please enter the percentage weight of "+cat5name+": ");
cat5weight=scannerInt.nextInt();}
while(isWeightValid(cat5weight,totalWeight)==false);
totalWeight+=cat5weight;

if(totalWeight!=100){
  System.out.println("ERROR: The values sum to "+totalWeight);
  System.out.println(" but should sum to 100.");}
else{
  System.out.println("********** Stundents Grades Entry **********");

System.out.println("Please enter values that the student earned for each Item:");


double cat1notes;
double cat2notes;
double cat3notes;
double cat4notes;
double cat5notes;


//TOTAL CATEGORY 1
double totalcat1=0.0;
for(int i=1;i<=cat1items;i++){
  do{ System.out.print(cat1name+" "+i+":");
  cat1notes=scannerInt.nextDouble();
  totalcat1+=cat1notes;}
  while(cat1notes>100||cat1notes<0);
 
}
//TOTAL CATEGORY 2
double totalcat2=0.0;
for(int i=1;i<=cat2items;i++){
  do{ System.out.print(cat2name+" "+i+":");
  cat2notes=scannerInt.nextDouble();
  totalcat2+=cat2notes;}
  while(cat2notes>100||cat2notes<0);
}
//TOTAL CATEGORY 3
double totalcat3=0.0;
for(int i=1;i<=cat3items;i++){
 do{ System.out.print(cat3name+" "+i+":");
  cat3notes=scannerInt.nextDouble();
  totalcat3+=cat3notes;}
  while(cat3notes>100||cat3notes<0);
}
//TOTAL CATEGORY 4
double totalcat4=0.0;
for(int i=1;i<=cat4items;i++){
  do{ System.out.print(cat4name+" "+i+":");
  cat4notes=scannerInt.nextDouble();
  totalcat4+=cat4notes;}
  while(cat4notes>100||cat4notes<0);
}
//TOTAL CATEGORY 5
double totalcat5=0.0;
for(int i=1;i<=cat5items;i++){
  do{ System.out.print(cat5name+" "+i+":");
  cat5notes=scannerInt.nextDouble();
  totalcat5+=cat5notes;}
  while(cat5notes>100||cat5notes<0);
}

double averageCat1= totalcat1/cat1items;
double averageCat2= totalcat2/cat2items;
double averageCat3= totalcat3/cat3items;
double averageCat4= totalcat4/cat4items;
double averageCat5= totalcat5/cat5items;

System.out.println("********** Student Results **********");

System.out.println(cat1name+": "+averageCat1);
System.out.println(cat2name+": "+averageCat2);
System.out.println(cat3name+": "+averageCat3);
System.out.println(cat4name+": "+averageCat4);
System.out.println(cat5name+": "+averageCat5);
double aw1=(averageCat1*cat1weight);
double aw2=(averageCat2*cat2weight);
double aw3=(averageCat3*cat3weight);
double aw4=(averageCat4*cat4weight);
double aw5=(averageCat5*cat5weight);
double totalscore=(aw1+aw2+aw3+aw4+aw5)/100;
System.out.print("The student has passed CSE 101 with a score of ");
System.out.println(totalscore+", GPA points of "+gpaPoints(totalscore));
System.out.println(", and a grade letter of "+gradeLetter(totalscore));




}/*ELSE FOR IF TOTALWEIGHT 100 */







    }/*MAIN*/



}/*CLASS*/