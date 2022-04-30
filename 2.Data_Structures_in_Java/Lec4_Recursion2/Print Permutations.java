/*
Given an input string (STR), print all possible permutations of the input string.
Note:
The input string may contain the same characters, so there will also be the same permutations.
The order of permutations doesn’t matter.
Input Format:
The only input line contains a string (STR) of alphabets in lower case
Output Format:
Print each permutations in a new line
Note:
You do not need to print anything, it has already been taken care of. Just implement the function.  
Constraint:
1<=length of STR<=8
Time Limit: 1sec
Sample Input 1:
cba
Sample Output 1:
abc
acb
bac
bca
cab
cba
*/

public class Solution {

	public static void FindPermutations(String str) {
        permutations("",str);
    }
        private static void permutations(String ans, String str)
    {
        // base case
        if (str == null) {
            return;
        }
 
        if (str.length() == 0) {
            System.out.println(ans);
        }
 
        for (int i = 0; i < str.length(); i++)
        {
            String newans = ans + str.charAt(i);
 
            String newstr = str.substring(0, i) +
                    str.substring(i + 1);
 
            permutations(newans, newstr);
        }
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        Solution.FindPermutations(str);
    }
}
