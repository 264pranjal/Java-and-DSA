/*
Sort an array A using Merge Sort.
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
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
*/
public class solution {

	public static void mergeSort(int[] input){
        mergeSort(input,0,input.length-1); 
	}
    private static void mergeSort(int[] arr,int si,int ei){
        if(si>=ei)
            return;
        int mid=(si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei);
    }
    private static void merge(int[] arr,int si,int ei){
        int mid=(si+ei)/2;
        int ans[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }
            else{
                ans[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
           ans[k]=arr[i];
           i++;
           k++;  
        }
        while(j<=ei){
            ans[k]=arr[j];
            j++;
            k++;
        }
        for(int index=0;index<ans.length;index++){
            arr[si+index]=ans[index];
        }
            
    }
}
import java.util.Scanner;

public class runner {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
}
