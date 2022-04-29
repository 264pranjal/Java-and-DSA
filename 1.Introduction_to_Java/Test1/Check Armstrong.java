/*
Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
Input Format :
Integer n
Output Format :
true or false
Sample Input 1 :
1
Sample Output 1 :
true
Sample Input 2 :
103
Sample Output 2 :
false
*/

Code:

import java.util.*;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum;
        int r;
        int x;
        for(int i=1;;i++){
            x=n;
            sum=0;
            while(x!=0){
                r=x%10;
                sum=sum+Math.pow(r, i);
                x=x/10;
                //System.out.println(sum);
            }
            if(sum>=n) {
            	break;
            }
        }
        sum=(int)sum;
        if(sum==n){
                System.out.println("true");
            }
        else{
             System.out.println("false");
        }
	}
}
