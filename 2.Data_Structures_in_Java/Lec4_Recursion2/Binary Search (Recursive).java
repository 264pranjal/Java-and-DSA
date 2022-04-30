/*
Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.
Note : If given array size is even, take first mid.
Input format :

Line 1 : Array size

Line 2 : Array elements (separated by space)

Line 3 : x (element to be searched)

Sample Input :
6
2 3 4 5 6 8 
5 
Sample Output:
3 
*/
public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		if(input.length==0)
            return -1;
        return binarySearch(input,element,0,input.length-1);
	}
    public static int binarySearch(int input[], int element,int si,int ei) {
        if(si>ei)
            return -1;
        else{
        int mid=(si+ei)/2;
        if(input[mid]==element)
            return mid;
        else if(input[mid]>element)
            return binarySearch(input,element,si,mid-1);
        else
            return binarySearch(input,element,mid+1,ei);
        }
	}
}

import java.util.Scanner;

public class runner {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int element = s.nextInt();
		System.out.println(solution.binarySearch(input, element));
	}
}
