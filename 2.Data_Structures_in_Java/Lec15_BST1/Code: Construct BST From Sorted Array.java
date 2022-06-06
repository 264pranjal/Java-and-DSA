/*
Given a sorted integer array A of size n, which contains all unique elements. You need to construct a balanced BST from this input array. Return the root of constructed BST.
Note: If array size is even, take first mid as root.
Input format:
The first line of input contains an integer, which denotes the value of n. The following line contains n space separated integers, that denote the values of array.
Output Format:
The first and only line of output contains values of BST nodes, printed in pre order traversal.
Constraints:
Time Limit: 1 second
Sample Input 1:
7
1 2 3 4 5 6 7
Sample Output 1:
4 2 1 3 6 5 7 
*/
public class Solution {
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
            if(n<=0)
                return null;
            if(n==1){
                BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[arr.length-1]);
                return root;
            }
			return intobst(arr,0,n-1);
		}
    	public static BinaryTreeNode<Integer> intobst(int[] arr,int start,int end){
            if(start>end){
                return null;
            }
            int rootnode=(start+end)/2;
            BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[rootnode]);
            root.left=intobst(arr,start,rootnode-1);
            root.right=intobst(arr,rootnode+1,end);
            return root;
        }
	}
