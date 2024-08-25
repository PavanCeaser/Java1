import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int rows = sc.nextInt();
		    
		    int triangle[][] = new int[rows][rows];
            int sum =0;
		    for(int i=0;i<rows;i++){
		        for(int j=0;j<=i;j++){
		            triangle[i][j] =sc.nextInt();
		        }
		    }
		    for(int k=rows-2;k>=0;k--){
		        for(int h=0;h<=k;h++){
		            triangle[k][h] +=Math.max(triangle[k+1][h],triangle[k+1][h+1]);
		        }
		        
		    }
		    
		    System.out.println(triangle[0][0]);
		    }
		

	
}
}