public class MethodExamples {
   // palindrome
   // returns true for things like "tacocat", "mom", "kayak"
   // returns false for things like "computer", "moon"
   // palindromMu("tacocat")
   // In class today, found out that "efe" is a palindrome, but
   // "Efe" was not. How can we change this method to allow for
   // a string to be considered a palindrome even if capitalization
   // and spaces exist. (i.e. "Efe" should return true, 
   // "Was it a car or a cat I saw" should return true.
   // The first 20 students to message me with a correct java
   // code solution to this problem will receive a bonus 10 points
   // on the midterm exam.
   public static boolean palindromMu(String text) {
//       if(text.equals("tacocat"))
//          return true;
      int firstChar = 0, lastChar = text.length() - 1;
      while (firstChar < lastChar) {
         if(text.charAt(firstChar) != text.charAt(lastChar))
            return false;
         firstChar++;
         lastChar--;
      }
      return true;
//       else if(text.charAt(1) != text.charAt(text.length() - 2)
//          return false;
//       else if(text.charAt(2) != text.charAt(text.length() - 3)
//          return false;
   }
   
   // rectangle
   // displays row rows of the numbers 1 to col
   // 5, 5 displays
   // 1  2  3  4  5
   // 1  2  3  4  5
   // 1  2  3  4  5
   // 1  2  3  4  5
   // 1  2  3  4  5
   //
   // 2, 3 displays
   // 1  2  3
   // 1  2  3
   public static void dikdortgen(int row, int col) {
      // for loop to display rows 1 - row
      for(int i = 0; i < row; i++) {
         // display a single row of 1 through col
         for(int j = 0; j < col; j++)
            System.out.print("" + (j + 1) + "\t");
         System.out.println(); // System.out.print("\n")
      }
   }
   
   // substring to a char
   // "CSE 101 is awesome!" and 'm' returns "CSE 101 is aweso"
   public static String altKelime(String asKelime, char upTo) {
//       String retVal = "";
//       for (int i = 0; i < asKelime.length() && asKelime.charAt(i) != upTo; i++)
//          retVal += asKelime.charAt(i);
//       return retVal;
      return asKelime.substring(0, asKelime.indexOf(upTo));
   }

   // count char
   // "bir berber bir berbere" and 'b' returns 6

   
   // menu
   // list of menu options
   // 1 - Add a new quiz score
   // 2 - Add a new assignment score
   // 3 - Set the midterm exam score
   // 4 - Set the final exam score
   // 5 - Get the student's course score and grade
   // 0 - Exit
   
}