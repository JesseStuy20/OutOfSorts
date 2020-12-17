import java.util.Arrays;
public class Sorts{

  public static void bubbleSort(int[] data) {
    boolean inOrder = true ;
    for (int i=0; i<data.length-1; i++) {
      inOrder = true ;
      for (int j=0; j<data.length-1-i; j++) {
        if (data[j] > data[j+1]) {
          int temp = data[j] ;
          data[j] = data[j+1] ;
          data[j+1] = temp ;
          inOrder = false ;
        }
      }
      if (inOrder == true) i = data.length-1 ;
    }
    
  }
}
