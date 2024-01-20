public class MidtermReview {
   public static void main(String[] args)  {
      int sum = 0;
      int i = 0;
      for(i = 0; i <= 2023; i++)
         sum += i;
      System.out.println(sum);
      System.out.println(i);
   }
   
   public static void disp1(String text, int index) {
      System.out.println(text.substring(0, index));
   }

   public static void disp2(String text, int index) {
      for(int i = 0; i < index; i++)
         System.out.print(text.charAt(i));
      System.out.println();
   }

   public static void disp3(String text, int index) {
      for(int i = 0; i < index; i++)
         System.out.println(text.charAt(i));
   }
   
   public static void disp4(String text, int index) {
      for(int i = 0; i < index; i++)
         System.out.print(text.charAt(index));
      System.out.println();
   }
   
   public static void disp5(String text, int index) {
      System.out.println(text.substring(index));
   }
   
   // Add numbers A to B
   public static int toplamAdanByeKadar1(int a, int b) {
      int result = 0;
      for(int i = a; i <= b; i++)
         result += i;
      return result;
   }

   // Add numbers A to B
   public static int toplamAdanByeKadar2(int a, int b) {
      return (b * b + b) / 2 - ((a-1) * (a-1) + (a-1)) / 2;
   }
   // Add numbers 0 to N
   public static int toplam0danNyeKadar1(int n) {
      int result = 0;
      for(int i = 0; i <= n; i++)
         result += i;
      return result;
   }

   public static int toplam0danNyeKadar2(int n) {
      return (n * n + n) / 2;
   }
}