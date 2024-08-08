import java.util.*;

public class Main {
    public static void main(String[] args) {
      String str = "Hello my Name is Pavan";
      
      long count = Arrays.stream(str.split("\\s+")).count();
      System.out.println(count);
  }
}