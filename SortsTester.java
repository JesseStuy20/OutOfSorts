import java.util.Random;
import java.util.Arrays;
public class SortsTester {
  public static void main(String[] args) {
    Random rng = new Random() ;
    int[] a = new int[5] ;
    for(int i = 0; i < a.length; i++) {
      a[i] = (rng.nextInt() % 100) ;
    }
    Sorts.bubbleSort(a) ;
    System.out.println(Arrays.toString(a)) ;
  }
}
