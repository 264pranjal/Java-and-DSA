/* n=4
1     1
 2   2 
  3 3  
   4   
  3 3  
 2   2 
1     1
*/

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int p=n-1;
		for(int i=1;i<=2*n-1;i++) {

            for(int j=1;j<=n;j++){
                if(i==j || 2*n-i==j)
                	System.out.print(j);
                else
                    System.out.print(" ");
            }
            for(int j=1;j<=n-1;j++){
                if(j==p || j==i-n)
                	System.out.print(n-j);
                else
                    System.out.print(" ");
            }
			System.out.println();
            p--;
		}
	}
}
