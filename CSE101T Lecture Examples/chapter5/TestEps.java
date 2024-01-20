//package chapter5;

public class TestEps {
  public static void main(String[] args) {
    double val = 0;

    // Add 0.01, 0.02, ..., 0.99, 1 to sum
    for (int i = 0; i < 100; i++)
      val += .01;

//    if (val == 1)
   if (Math.abs(1-val) < 0.000001)
      System.out.print("it's 1");
   else
      System.out.print("it's not 1, it's " + val);

  }
}
