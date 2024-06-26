/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		if( 1<= t && t <=100){
		    for( int i =0;i< t;i++){
		      int n = s.nextInt();
		      int m = s.nextInt();
		      int k = s.nextInt();
		        if(2<=n && n <= 100 && 1<= m && m<=n &&1<=k && k<100){
		            int pac = 0;
					 int arr [] = new int[n];
		            for(int j =0; j< n; j++){
		                int sk = s.nextInt();
						if(0<=sk && sk<= 1 ){
		                   arr[j] = sk;
		                }
		            }
					for(int l=0; l<n; l++){
		                    if(arr[l] == 1){
		                    pac+=1; }
							else if(arr[l]==0){
								break;
		                    }
		            }
					System.out.println("pac value  ::"+pac);
					if(n==pac){
		                System.out.println(100);
		            }else if(m <= pac){
		                System.out.println(k);
		            }else {
		                System.out.println(0);
		            }
		            
		        }
		    }
		}

	}
}
