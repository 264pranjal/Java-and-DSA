/*
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
*/


public class Solution {
	
	public static boolean checkMember(int n){
		int f1=0;
        int f2=1;
        int f3;
        if(n==0){
            return true;
        }
        for(int i=1;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            if(f3==n || f1==n){
                return true;
            }
        }
        return false;
	}
	

}

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.checkMember(n));
	}

}
