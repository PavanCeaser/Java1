import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String str;
		    str = sc.next();
		    int idx =str.length()-1;
		    if(str.charAt(idx) == '1') System.out.println("WIN");
        else System.out.println("LOSE");
		}
    }
		    
}