/*
*-----------------------------------------------------
* Akdeniz University CSE101T Final Calismasi
* Name: Yahya Efe Kurucay
* Date: 13.01.2024
* Description: Recuirsive methods
* Score: ?
* Website: https://efekurucay.com
*-----------------------------------------------------
*/

import java.util.Arrays;

public class recuirsive {
    public static int addDigits(int n){
/*S4. Short Program Fragment (8 points each)
In the box provided, write a recursive method called addDigits(int n) that returns an integer 
that is the sum of the digits of n. Examples shown. Identify the base case, recursive call, and 
convergence for your solution.
addDigits(1234) -> returns 10
addDigits(20200106) -> returns 11
public static int addDigits(int n){ */

    // Base case: n tek haneli bir sayı ise, direkt olarak n'yi döndür
    if (n < 10) {
        return n;
    }

    // Recursive call: n'in rakamlarının toplamını hesapla ve bu toplamı recursive olarak çağır
    return n % 10 + addDigits(n / 10);

    }//addDigits

    public static long fib(long index) {
        if (index == 0)  return 0; // Base case   
        else if (index == 1)  return 1;// Base case
        else  // Reduction and recursive calls  
        return fib(index - 1) + fib(index - 2);  }

     // Alt Probleme 1: Dizi boyutunu belirle
    private static int calculateSize(int start, int end, int step) {
        return (end - start + step - 1) / step;
    }

    // Alt Probleme 2: Başlangıç, bitiş ve adıma dayalı olarak bir dizi oluştur
    private static int[] generateArray(int start, int end, int step, int size) {
        int[] result = new int[size];
        for (int i = 0, value = start; i < size; i++, value += step) {
            result[i] = value;
        }
        return result;
    }

    // Versiyon 1: Özel adımla dizi
    public static int[] range(int start, int end, int step) {
        int size = calculateSize(start, end, step);
        return generateArray(start, end, step, size);
    }

    // Versiyon 2: Varsayılan adımı 1 olan dizi
    public static int[] range(int start, int end) {
        return range(start, end, 1);
    }

    // Versiyon 3: Varsayılan adımı 1 ve başlangıcı 0 olan dizi
    public static int[] range(int end) {
        return range(0, end, 1);
    }

    public static void main(String[] args) {
        // Örnek kullanım
        int[] result = range(9);
        System.out.println("Örnek: range(0) -> " + Arrays.toString(result));
    }

}//class

