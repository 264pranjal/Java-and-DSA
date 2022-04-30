/*
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
*/
public class Solution {
	public static String reverseWordWise(String input) {
        int[][] dp = new int[s.length()][s.length()];
        //find the logest palindromic subsequence 
        for(int g = 0; g< s.length(); g++){
            for(int i = 0, j = g; j < dp.length; i++, j++){
                if(g == 0){
                    dp[i][j] = 1;
                }else if(g == 1){
                    dp[i][j] = s.charAt(i) == s.charAt(j) ? 2 : 1;
                }else{
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = 2 + dp[i+1][j-1];
                    }else{
                        dp[i][j] = Math.max(dp[i][j-1] , dp[i+1][j]);
                    }
                }
            }
        }
        //ans == > length_of_string   -  longest_palindromic_subsequence 
        int sublen = dp[0][s.length() - 1];
        int len = s.length();
        int change = len - sublen;
        
        if(change==0 || change ==1){
            return 1;
        }
        return 0;
    
}
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.reverseWordWise(input));
	}
}
