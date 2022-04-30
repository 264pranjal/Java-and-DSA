/*
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int decimal=0;
        int x=n;
        int r;
        int i=1;
        while(x!=0){
            r=x%10;
            decimal=decimal+r*i;
            i=i*2;
            x=x/10;
        }
        System.out.println(decimal);
	}
}
