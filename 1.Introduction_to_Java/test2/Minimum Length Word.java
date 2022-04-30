/*
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
*/


public class Solution {
	
	public static String minLengthWord(String input){
        int cws=0;
        int i=0;
        String ans="";
        String str=input;
        int min=Integer.MAX_VALUE;
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                int cwe=i-1;
                int count=i-cws;
                if(min>count){
                    min=count;
                    ans="";
                    for(int j=cws;j<=cwe;j++){
                        ans+=str.charAt(j);
                    }
                }
                cws=i+1;
            }
        }
                int cwe=i-1;
                int count=i-cws;
                if(min>count){
                    min=count;
                    ans="";
                    for(int j=cws;j<=cwe;j++){
                        ans+=str.charAt(j);
                    }
                }
        return ans;
        
	}
}
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(Solution.minLengthWord(str));
	}

}
