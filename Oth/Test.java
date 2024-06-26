
import java.util.*;
import java.lang.*;
import java.io.*;
public class Test {
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		if( 1<= t && t <=1000){
		    for( int i =0;i< t;i++){
		        int n = s.nextInt();
		        int count =0;
		         if(1<=n && n <= 1000){
		        for(int j=0;j<n;j++){
		            int d = s.nextInt();
		            if(1<=d && d <=5000 && d<1000){
		                count++;
		            }
		        }
		         }
		        System.out.println(count);
		    }
		}
    }
    
}
