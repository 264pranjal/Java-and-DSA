/*
For a given a Binary Tree of type integer, find and return the minimum and the maximum data values.
Return the output as an object of Pair class, which is already created.
Note:
All the node data will be unique and hence there will always exist a minimum and maximum node data.
Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The only line of output prints two integers denoting the minimum and the maximum data values respectively. A single line will separate them both.
Constraints:
2 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output 1:
1 14
Sample Input 2:
10 20 60 -1 -1 3 50 -1 -1 -1 -1 
Sample Output 2:
3 60
*/

import java.util.*;
import java.lang.*;
public class Solution {

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		if(root==null){
            Pair<Integer,Integer> maxMin=new Pair<Integer,Integer>(0,0);
            return maxMin;
        }
        int maxi=getmax(root);
        int mini=getmin(root);
        Pair<Integer, Integer> ans=new Pair<Integer,Integer>(mini,maxi);
        return ans;
	}
    public static int getmax(BinaryTreeNode<Integer> root){
        if(root==null)
            return Integer.MIN_VALUE;
		return Math.max(root.data,Math.max(getmax(root.left),getmax(root.right)));
    }
    public static int getmin(BinaryTreeNode<Integer> root){
        if(root==null)
            return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(getmin(root.left),getmin(root.right)));
        
    }
	
}
