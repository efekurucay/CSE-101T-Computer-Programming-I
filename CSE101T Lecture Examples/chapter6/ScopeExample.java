public class ScopeExample {
   public static void main(String[] args) {
      double myVar = 3;
      myMethod(myVar);
      myVar = 5.8;
      myMethod(myVar);
      
      int i = 1;
      for (i = 0; i < 3; i++)
         System.out.println(i);
   }
   
   public static void myMethod(int myVar) {
      System.out.println("myVar (int) is " + myVar);
   }
   
   public static void myMethod(double myVar) {
      System.out.println("myVar (double) is " + myVar);
   }
}