/*
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
Input Format:
The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
Note:
All the characters in the input strings would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

You are not required to print anything. It has already been taken care of. Just implement the function. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
Sample Input 2:
abc
cbd
Sample Output 2:
false
*/
import java.util.*;
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        if (n1 != n2)
        return false;
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        // Sort both strings
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
        if (ch1[i] != ch2[i])
            return false;

        return true;
        
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String str1 = br.readLine();
		if (str1 != null) {
			str1 = str1.trim();
		} else {
			str1 = "";
		}

		String str2 = br.readLine();
		if (str2 != null) {
			str2 = str2.trim();
		} else {
			str2 = "";
		}

		boolean ans = Solution.isPermutation(str1, str2);

		System.out.println(ans);
		
	}
}
