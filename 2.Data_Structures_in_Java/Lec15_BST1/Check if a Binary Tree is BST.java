/*
Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.
Note: Duplicate elements should be kept in the right subtree.
Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
Output format :
The first and only line of output contains either true or false.
Constraints :
Time Limit: 1 second
Sample Input 1 :
3 1 5 -1 2 -1 -1 -1 -1
Sample Output 1 :
true
Sample Input 2 :
5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
Sample Output 2 :
false
*/
//3rd way
public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
        return isBST2(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
    public static boolean isBST2(BinaryTreeNode<Integer> root,int min,int max){
        if(root==null)
            return true;
        if(root.data<min || root.data>max)
            return false;
        boolean isleftok=isBST2(root.left,min,root.data-1);
        boolean isrightok=isBST2(root.right,root.data,max);
        return isleftok && isrightok;
    }

}

/*
2nd way

class isBSTcheck{
    public boolean isBST;
    public int minimum;
    public int maximum;
}
public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
        isBSTcheck output = isBST3(root);
        return output.isBST;
	}
    public static isBSTcheck isBST3(BinaryTreeNode<Integer> root){
        if(root==null){
            isBSTcheck output = new isBSTcheck();
            output.isBST=true;
            output.minimum=Integer.MAX_VALUE;
            output.maximum=Integer.MIN_VALUE;
            return output;
        }
        isBSTcheck leftok=isBST3(root.left);
        isBSTcheck rightok=isBST3(root.right);
        int mini=Math.min(root.data,Math.min(leftok.minimum,rightok.minimum));
        int maxi=Math.max(root.data,Math.max(leftok.maximum,rightok.maximum));
        boolean isBSTfinal=(root.data > leftok.maximum) && (root.data<=rightok.minimum) && leftok.isBST && rightok.isBST;
        isBSTcheck output = new isBSTcheck();
        output.isBST=isBSTfinal;
        output.minimum=mini;
        output.maximum=maxi;
        return output;
    }

}
*/

/*
1st way
public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
        if(root==null)
            return true;
        int leftmax=maximum(root.left);
        int rightmin=minimum(root.right);
        boolean output = (root.data>leftmax) && (root.data<=rightmin) && isBST(root.left) && isBST(root.right);
        return output;
	}
    public static int maximum(BinaryTreeNode<Integer> root){
        if(root==null)
            return Integer.MIN_VALUE;
        int left=maximum(root.left);
        int right=maximum(root.right);
        return Math.max(root.data,Math.max(left,right));
    }
    public static int minimum(BinaryTreeNode<Integer> root){
        if(root==null)
            return Integer.MAX_VALUE;
        int left=minimum(root.left);
        int right=minimum(root.right);
        return Math.min(root.data,Math.min(left,right));
    }    

}
*/
