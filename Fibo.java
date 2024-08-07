import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World");
      
      int n=10;
      
      int firstnum = 0;
      int secondnum =1;
      System.out.println("Fibonacci seris till n is : "+ n+" terms");
      
      for(int i=1;i<=n;++i){
        System.out.println(firstnum+" ");
        int nextTerm =firstnum+secondnum;
        firstnum = secondnum;
        secondnum = nextTerm;
      }
      
  }
}