/*
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
 */

Code:

import java.util.*;
public class runner {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                x=n-j+1;
                if(x==i){
                  System.out.print("*");  
                }
                else{
                    System.out.print(x);
                }
                
            }
            System.out.println();
        }

	}
}
