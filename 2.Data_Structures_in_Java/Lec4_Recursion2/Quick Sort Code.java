/*
Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.


Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 
*/

public class Solution {
	
	public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
	}
    public static void quickSort(int[] input, int si, int ei) {
        if(si>=ei)
            return;
        int pivotpos=position(input,si,ei);
        quickSort(input, si, pivotpos-1);
        quickSort(input, pivotpos+1, ei);
	}
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
    private static int position(int[] arr,int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<=ei-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,ei);
        return i+1;
    }
	
}
import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		Solution.quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
