/*
For a given input string(str), find and return the total number of words present in it.
It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints an integer value denoting the tool number of words present in the string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 sec
Sample Input 1:
Coding Ninjas!
Sample Output 1:
2
Sample Input 2:
this is a sample string
Sample Output 2:
5
*/

public class Solution {

	public static int countWords(String str) {	
        int count=0;
        if(str.length()==0){
             return 0;
         }
		for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i+1)) && (i > 0)){
                count++;
            }
        }
        count++;
        return count;
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		int count = Solution.countWords(str);
		System.out.println(count);
	}
}
