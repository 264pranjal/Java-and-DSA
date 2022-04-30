/*
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("*");
        for(int i=2;i<=n+1;i++) {
            System.out.print("*");
            for(int j=2;j<=i;j++) {
                System.out.print(j-1);
            }
            int p=i-2;
            for(int j=3;j<=i;j++) {
                System.out.print(p);
                p--;
            }
            System.out.print("*");
            System.out.println();
        }
        int k=1;
        for(int i=n+2;i<=2*n;i++) {
            System.out.print("*");
            for(int j=1;j<=n-k;j++) {
                System.out.print(j);
            }
            int p=n-k-1;
            for(int j=2;j<=n-k;j++) {
                System.out.print(p);
                p--;
            }
            System.out.print("*");
            System.out.println();
            k++;
        }
        System.out.print("*");
    }
}
