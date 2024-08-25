import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    //max alternating Sum 
    int a[] = {1,2,3};
    int  n =3;
    //i meed to find alternating
    int sum =0;
  
    for(int i=0;i<n/2;i++){
      sum += a[n-i-1]-a[i]; // max - min 
    }
    if( (n&1) !=0){
      sum += a[n/2];
    }
    
    System.out.println(sum);
      
  }
}