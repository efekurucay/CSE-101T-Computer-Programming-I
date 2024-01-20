/*
*-----------------------------------------------------
* Akdeniz University CSE101T Final Calismasi
* Name: Yahya Efe Kurucay
* Date: 13.01.2024
* Description: try catch finally
* Score: ?
* Website: https://efekurucay.com
*-----------------------------------------------------
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class trycatch {

    public static void main(String[] args) throws FileNotFoundException {


    File file= new File("trycatch.txt");

try {
    
    PrintWriter print = new PrintWriter(file);
    
    print.println("This is the first line.");
    print.println("This is the second line.");

    print.close();
} catch (Exception e) {
    // TODO: handle exception
    System.out.println("ERROR: "+e);
    System.out.println("File not found");
}

finally{

    System.out.println("try-catch done.");
}

        
    }


    
}//class
