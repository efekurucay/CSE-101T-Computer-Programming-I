/*
*-----------------------------------------------------
* Akdeniz University CSE101T Final Calismasi
* Name: Yahya Efe Kurucay
* Date: 13.01.2024
* Description: File, PrintWriter, Scanner
* Score: ?
* Website: https://efekurucay.com
*-----------------------------------------------------
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class files {

    public static void main(String[] args) throws IOException {
        String filename = "I_am_exist.txt";

        fileThings(filename);
    }


    public static void fileThings(String Filename) throws IOException{

        File myFile = new File(Filename);
        
        if(myFile.exists()){System.out.println(Filename+" file exists and your filename is '"+myFile.getName()+"'");}
        else{System.out.println(Filename+" file does not exist");}
        
      //  if(myFile.delete()){System.out.println("deletion was successful");}
       // else{System.out.println("deletion was not successful");}
        
       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Type '1' to create the file again. "); 
       // if(scanner.nextInt()==1){ if(myFile.createNewFile()){System.out.println("Creating was successful");}
       //                             else{System.out.println("File could not be created");}}

      //  scanner.close();

        PrintWriter print = new PrintWriter(Filename);

        print.println("Hi, I exist");
        print.print("And you youa");
  
  
     
        print.close();
        Scanner read = new Scanner(myFile);
        System.out.println(" I've just read with nextLine = "+ read.nextLine());
        System.out.println(" I've just read with next = "+ read.nextLine());
        System.out.println(" I've just understand with hasNext = "+ read.hasNext());
        System.out.println(" I've just read with hasNextLine = "+ read.hasNextLine());

        read.close();

 
        


    }



}