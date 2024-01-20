/*
*-----------------------------------------------------
* Akdeniz University CSE101T Final Calismasi
* Name: Yahya Efe Kurucay
* Date: 13.01.2024
* Description: arrays
* Score: ?
* Website: https://efekurucay.com
*-----------------------------------------------------
*/


import java.util.*;

public class arrays {
    


    public static void main(String[] args) {
        String []efe = {"This article is an indication that I am studying for the final exam now.","index1","index2","index 3"};
        int[] nums = {28,36,45,98,0,0,-8,75};
        int [][] array = {{2,3,4},{5,6}};
            double a = Math.pow(3, 2 % 1) * (1 / 5 + 4 * 4 - 2 / 6 * 3);
            String s = "I have a bad feeling about this";

            System.out.println(s.replace( " ", ""));


    }//main

    public static void sortAndDisplay (int[] array){
    
            
        Arrays.sort(array);
        
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println("nums["+i+"]= "+array[i]);
        }

     
       
    }//sortAndDisplay

    public static void lengthMultiArray(int[][] array){

     

int[] lengthEachRow = new int[array.length];

for(int i =0 ; i< array.length; i++) {

    lengthEachRow[i]= array[i].length;

    System.out.println("Length of array["+i+"]= "+lengthEachRow[i]);
}

    }//lengthMultiArray

    public static void stringMethods(){

     //    length(), indexOf(), toLowerCase(), toUpperCase(), startsWith(), equals(), charAt(), substring()


     
    String str = "01234567"; String str1 = "merhaba";

   

    String lowerCaseStr = str.toLowerCase(); // lowerCaseStr = "merhaba"

    String upperCaseStr = str.toUpperCase(); // upperCaseStr = "MERHABA"

    boolean startsWithMer = str.startsWith("Mer"); // startsWithMer = true
    boolean isEqual = str.equals(str1); // isEqual = false
    char character = str.charAt(2); // character = 'r'
    String subStr = str.substring(3); // subStr = "haba"

    String subString=str.substring(1, 8);


    int index = str.indexOf("56"); // index = 3
    System.out.println(index);


    }//stringMethods



}//class
