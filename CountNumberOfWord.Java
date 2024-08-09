import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the string:");
        String str ="The Lord Of Rings";
        int count = countNumberOfWords(str);
        System.out.println("Number of words: " + count);
  }
  private static int countNumberOfWords(String str){
    int count =0;
    if(str.charAt(0)!=' '){
      count++;
    }
    for(int i=0;i<str.length();i++){
      
      if(str.charAt(i) ==' ' && str.charAt(i+1) !=' '){
        count++;
      }
    }
    
  
  return count;
}
}