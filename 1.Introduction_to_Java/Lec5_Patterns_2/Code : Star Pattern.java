/*
Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
*/

import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<k) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			for(int j=1;j<=n-1;j++) {
				if((n-j)<k) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			k--;
		}
	}

}
