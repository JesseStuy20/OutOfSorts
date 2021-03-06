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
    int seed = (rng.nextInt() % 1000000) ;
    rng = new Random(seed) ;
    int[] b = new int[7] ;
    for(int i = 0; i < b.length; i++) {
      b[i] = (rng.nextInt() % 100) ;
    }
    int[] c = b ;
    int[] d = b ;
    System.out.println("Seed:" + seed) ;
    System.out.println("bubbleSort") ;
    Sorts.bubbleSort(b) ;
    System.out.println(Arrays.toString(b)) ;
    System.out.println("selectionSort") ;
    Sorts.selectionSort(c) ;
    System.out.println(Arrays.toString(c)) ;
    System.out.println("insertionSort") ;
    Sorts.insertionSort(d) ;
    System.out.println(Arrays.toString(d)) ;
  }
}
