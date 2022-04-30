/*
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output format :
For each test case, print the elements of the array/list in sorted order separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Sample Input 2:
2
5
9 3 6 2 0
4
4 3 2 1
Sample Output 2:
0 2 3 6 9
1 2 3 4
*/

public class Solution {  
    public static int min(int start,int[] arr){
        int minindex=start;
        for(int i=start+1;i<arr.length;i++){
            if(arr[minindex]==arr[i]){
                continue;
            }
            else if(arr[minindex]>arr[i]){
                minindex=i;
            }
        }
        return minindex;
    }

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        int start=0;
        int end=arr.length-1;
        int minindex=0;
        while(start<=end){
			minindex=min(start,arr);
            //System.out.println(minindex);
            if(minindex==start){
                start++;
                continue;
            }
            arr[start]=arr[start]+arr[minindex];
            arr[minindex]=arr[start]-arr[minindex];
            arr[start]=arr[start]-arr[minindex];
            start++;
        }
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

            int[] input = takeInput();
            Solution.selectionSort(input);
            printArray(input);

            t -= 1;
        }
    }
}
