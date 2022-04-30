/*
Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
*/

import java.util.*;
import java.lang.Math;
public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n/2+1;i++){
            for(int j=1;j<=Math.abs((n/2)-i+1);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }           
            System.out.println();
        }
        int k=n/2;
        for(int i=n/2+2;i<=n;i++){
            for(int j=1;j<=Math.abs((n/2)-i+1);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            for(int j=1;j<=k-1;j++){
                System.out.print("*");
            }           
            System.out.println();
            k--;
        }
    }
}
