/*
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
  
*/  

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int p=2*i-1;
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(p);
				p=p+2;
			}
			p=1;
			for(int j=1;j<=i-1;j++) {
				System.out.print(p);
				p=p+2;
			}
			System.out.println();
		}
	}
}
