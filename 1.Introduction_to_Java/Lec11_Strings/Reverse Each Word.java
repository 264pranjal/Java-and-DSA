/*
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
Output Format:
The only line of output prints the sentence(string) such that each word in the sentence is reversed. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
*/
public class Solution {

	public static String reverseEachWord(String str) {
		int cws=0;
        int i=0;
        String ans="";
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                int cwe=i-1;
                String rw="";
                for(int j=cws;j<=cwe;j++){
                    rw=str.charAt(j)+rw;
                }
                ans+=rw+" ";
                cws=i+1;
            }
        }
        int cwe=i-1;
        String rw="";
        for(int j=cws;j<=cwe;j++){
                rw=str.charAt(j)+rw;
        }
        ans+=rw;
        return ans;
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = Solution.reverseEachWord(str);

		System.out.println(ans);
		
	}
}
