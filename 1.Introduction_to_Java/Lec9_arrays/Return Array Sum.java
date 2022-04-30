/*
Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the sum of the numbers in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5

Time Limit: 1sec
Sample Input 1:
1
3
9 8 9
Sample Output 1:
26
Sample Input 2:
2
5
1 2 3 4 5 
3
10 20 30 
Sample Output 2:
15
60
*/

import java.util.*;
public class Solution {
    public static int sum(int input[]){
        int sums=0;
        for(int i=0;i<input.length;i++){
            sums=sums+input[i];
        }
        return sums;
    }
	// public static int[] takeinput(int size) {
	// 	Scanner s=new Scanner(System.in);
	// 	int arr[]=new int[size];
	// 	for(int i=0;i<size;i++) {
	// 		arr[i]=s.nextInt();
	// 	}
	// 	return arr;
	// }
	// public static int print(int arr[]) {
	// 	int size=arr.length;
	// 	int sum=0;
	// 	for(int i=0;i<size;i++) {
	// 		sum=sum+arr[i];
	// 	}
	// 	return sum;
	// }
	// public static void main(String[] args) {
	// 	Scanner s=new Scanner(System.in);
	// 	int t=s.nextInt();
	// int sum[]=new int[test];
	// 	for(int i=0;i<t;i++) {
	// 		int n=s.nextInt();
	// 		int arr[]=takeinput(n);
	// sum[i]= print(arr);
	// 	}
	// for(int i=0;i<test;i++){
	// System.out.print(sum[i]);
	// }
	// }
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
        strNums = br.readLine().trim().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int[] input = takeInput();
            System.out.println(Solution.sum(input));
            t -= 1;
        }
    }
}
