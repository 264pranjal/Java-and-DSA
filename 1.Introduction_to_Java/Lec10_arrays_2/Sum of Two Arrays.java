/*
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.
Note:
The sizes N and M can be different. 

Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry. 

No need to print the elements of the output array/list.
Using the function "sumOfTwoArrays", write the solution to the problem and store the answer inside this output array/list. The main code will handle the printing of the output on its own.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output Format :
For each test case, print the required sum of the arrays/list in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec 
Sample Input 1:
1
3
6 2 4
3
7 5 6
Sample Output 1:
1 3 8 0
Sample Input 2:
2
3
8 5 2
2
1 3
4
9 7 6 1
3
4 5 9
Sample Output 2:
0 8 6 5
1 0 2 2 0 
*/

public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	long ar1=0;
    	long ar2=0;
    	long out=0;
    	for(int i=0;i<arr1.length;i++){
    	ar1=ar1*10+arr1[i];
    	}
    	for(int i=0;i<arr2.length;i++){
    	ar2=ar2*10+arr2[i];
    	}
    	out=ar1+ar2;
    	for(int i=output.length-1;i>=0;i--){
    	output[i]=(int)out%10;
    	out=out/10;
    	}  
        // int len1=arr1.length,len2=arr2.length,c=0,sum,q=0,k,i,j;
        // i=len1-1;
        // j=len2-1;
        // if(len1>len2){
        //     k=len1;
        // }
        // else{
        //     k=len2;
        // }
        // while(i>=0&&j>=0){
        //     sum=arr1[i]+arr2[j]+q;
        //     if(sum>9){
        //         c=sum%10;
        //         q=sum/10;
        //     }else{
        //         c=sum;
        //         q=0;
        //     }
        //     output[k]=c;
        //     i--;
        //     j--;
        //     k--;
        // }
        // while(i>=0){
        //     sum=arr1[i]+q;
        //     if(sum>9){
        //         c=sum%10;
        //         q=sum/10;
        //     }else{
        //         c=sum;
        //         q=0;
        //     }
        //     output[k]=c;
        //     i--;
        //     k--;
        // }
        // while(j>=0){
        //     sum=arr2[j]+q;
        //     if(sum>9){
        //         c=sum%10;
        //         q=sum/10;
        //     }else{
        //         c=sum;
        //         q=0;
        //     }
        //     output[k]=c;
        //     j--;
        //     k--;
        // }
        // output[k]=q;
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr1 = takeInput();
            int[] arr2 = takeInput();

            int[] output = new int[1 + Math.max(arr1.length, arr2.length)];

            Solution.sumOfTwoArrays(arr1, arr2, output);
            printArray(output);

            t -= 1;
        }
    }
}
