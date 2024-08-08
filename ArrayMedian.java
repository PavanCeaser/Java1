import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int []arrays = {1,2,3,4,5,6};
      
       double median = findMedian(arrays);
      
       System.out.println(median);
}

public static double findMedian(int[] array){
   Arrays.sort(array);
   int n = array.length;
   
   if(n%2 == 1){
     
     return array[n/2];
   }
   else{
     return (array[n-1]/2+array[n/2])/2.0;
   }
  
}
}