/*
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion.
Input format :
Integer k
Output format :
Geometric sum (upto 5 decimal places)
Constraints :
0 <= k <= 1000
Sample Input 1 :
3
Sample Output 1 :
1.87500
Sample Input 2 :
4
Sample Output 2 :
1.93750
*/

public class solution {

	public static double findGeometricSum(int k){
        if(k<0)
            return 0;
        if(k==0)
            return 1.0;
        return 1.0/power(k)+findGeometricSum(k-1);
	}
    private static int power(int n) {
        if(n==0)
            return 1;
        if(n==1)
            return 2;
		return 2*power(n-1);
	}
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = solution.findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
}
