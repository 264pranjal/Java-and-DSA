/*
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


Input format :
Integer N
Output format :
Corresponding reverse number
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321
Sample Input 2 :
1980
Sample Output 2 :
891
*/

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        long n=s.nextInt();
        long r;
        long reverse=0;
        while(n!=0){
            if(n%10!=0){
                break;
            }
            n=n/10;
        }
        long i=n;
        while(i!=0){
                r=i%10;
                i=i/10;
            reverse=r+(reverse*10);
        }
        System.out.println(reverse);
	}
}
