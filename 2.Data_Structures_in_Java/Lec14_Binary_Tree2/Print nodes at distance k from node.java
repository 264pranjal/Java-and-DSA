/*
You are given a Binary Tree of type integer, a target node, and an integer value K.
Print the data of all nodes that have a distance K from the target node. The order in which they would be printed will not matter.
Example:
For a given input tree(refer to the image below):
1. Target Node: 5
2. K = 2
alt txt

Starting from the target node 5, the nodes at distance K are 7 4 and 1.
Input Format:
The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

The second line of input contains two integers separated by a single space, representing the value of the target node and K, respectively.
Output Format:
All the node data at distance K from the target node will be printed on a new line.

The order in which the data is printed doesn't matter.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
3 1
Sample Output 1:
9
6
Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
3 3
Sample Output 2:
4
5
*/

public class Solution {

	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	    //Your code goes here
        nodesAtDistK(root,node,k);
	}
    public static int nodesAtDistK(BinaryTreeNode<Integer> root, int node, int k) {
	    //Your code goes here
        if(root==null){
            return -1;
        }
        
        if(root.data == node){
            printDown(root,k);
            return 0;
        }
        
        int lh = nodesAtDistK(root.left,node,k);
        if(lh!=-1){
            if(lh+1==k){
                System.out.println(root.data);
            }
            else{
                printDown(root.right,k-lh-2);
            }
            return lh+1;
        }
        int rh = nodesAtDistK(root.right,node,k);
        if(rh!=-1){
            if(rh+1==k){
                System.out.println(root.data);
                
            }
            else{
                printDown(root.left,k-rh-2);
            }
            return rh+1;
        }
        
        return -1;
	}
    
    private static void printDown(BinaryTreeNode<Integer> root, int k) {
        if(root==null) {
            return ;
        }
        if(k==0) {
            System.out.println(root.data);
            return ;
        }
        printDown(root.left, k-1);
        printDown(root.right, k-1);
    }

}
