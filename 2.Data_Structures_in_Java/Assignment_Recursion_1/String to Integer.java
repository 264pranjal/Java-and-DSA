/*
Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string S (string, Eg. "1234")
Output format :
Corresponding integer N (int, Eg. 1234)
Constraints :
0 <= |S| <= 9
where |S| represents length of string S.
Sample Input 1 :
00001231
Sample Output 1 :
1231
Sample Input 2 :
12567
Sample Output 2 :
12567
*/

public class solution {

	public static int convertStringToInt(String input){
		if(input.length()==1)
            return input.charAt(0)-'0';
        int x=input.charAt(0)-'0';
        x=x*power(input.length()-1);
        return x+convertStringToInt(input.substring(1,input.length()));
	}
    private static int power(int n){
        if(n==0)
            return 1;
        if(n==1)
            return 10;
        return 10*power(n-1);
    }
}
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.convertStringToInt(input));
	}
}
