/*
Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false
*/

public class solution {

	public static boolean isStringPalindrome(String input) {
        if(input.length()<=1)
            return true;
        return isStringPalindrome(input,0,input.length()-1);
	}
    public static boolean isStringPalindrome(String input,int start,int end) {
        if(start>=end)
            return true;
        if(input.charAt(start)!=input.charAt(end))
            return false;
        return isStringPalindrome(input,start+1,end-1);
	}
    
}
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.isStringPalindrome(input));
	}
}
