/*
Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no node with required value is present.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output format:
Second Largest node data
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
40
*/


public class Solution {

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        if(root==null)
            return root;
        TreeNode<Integer> largest=largest(root);
        change(root,largest.data);
        return largest(root);

	}
    public static TreeNode<Integer> largest(TreeNode<Integer> root){
        
        if(root==null){
            return null;
        }
        int max = root.data;
        TreeNode<Integer> maxnode = root;
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> currnode = largest(root.children.get(i));
            if(currnode==null){
                continue;
            }
            int curr=currnode.data;
            if(max<curr){
                max = curr;
                maxnode = currnode;
            }
        }
        
        return maxnode;
    }
    private static void change(TreeNode<Integer> root,int n){
        if(root==null)
            return;
        if(root.data==n)
            root.data=Integer.MIN_VALUE;
        for(int i=0;i<root.children.size();i++)
            change(root.children.get(i),n);
            
    }
	
}
