/*
Implement the BST class which includes following functions -
1. search
Given an element, find if that is present in BST or not. Return true or false.
2. insert -
Given an element, insert that element in the BST at the correct position. If element is equal to the data of the node, insert it in the left subtree.
3. delete -
Given an element, remove that element from the BST. If the element which is to be deleted has both children, replace that with the minimum element from right sub-tree.
4. printTree (recursive) -
Print the BST in ithe following format -
For printing a node with data N, you need to follow the exact format -
N:L:x,R:y
where, N is data of any node present in the binary tree. x and y are the values of left and right child of node N. Print the children only if it is not null.
There is no space in between.
You need to print all nodes in the recursive format in different lines.

*/


public class BinarySearchTree {
    private static BinaryTreeNode<Integer> root;
	public void insert(int data) {
		root=inserthelp(data,root);
	}
    public BinaryTreeNode<Integer> inserthelp(int data,BinaryTreeNode<Integer> root) {
		BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(data);
        if(root==null)
            return node;
        if(root.data>=data){
            root.left=inserthelp(data,root.left);
        }
        else{
            root.right=inserthelp(data,root.right);
        }
        return root;
	}
	
	public static void remove(int data){
        root= deleteHelper(root,data);
        // return;
    }
    private static BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> root,int data){
        if(root==null)
            return null;
        if(root.data==data){
            if(root.left!=null && root.right==null)
                return root.left;
            else if(root.left==null && root.right!=null)
                return root.right;
            else if(root.left==null && root.right==null)
                return null;
            else{

                BinaryTreeNode<Integer> minNode = root.right;
                while (minNode.left != null) {
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteHelper(root.right,minNode.data);
                return root;
            }

        }
        else if(root.data>data)
        {BinaryTreeNode<Integer> leftt=deleteHelper(root.left,data);
         root.left=leftt;}
        else{
            BinaryTreeNode<Integer> rightt=deleteHelper(root.right,data);
            root.right=rightt;  
        }

        return root;
    }
	
    
	public void printTree() {
		print(root);
	}
    public void print(BinaryTreeNode<Integer> root){
        if(root==null)
			return;
		String toprint=root.data+":";
		if(root.left!=null) {
			toprint+="L:"+root.left.data+",";
		}
		if(root.right!=null) {
			toprint+="R:"+root.right.data;
		}
		System.out.println(toprint);
		print(root.left);
		print(root.right);
    }
	
	public boolean search(int data) {
		return searchhelp(data,root);
	}
    public boolean searchhelp(int data,BinaryTreeNode<Integer> root){
        if(root==null)
            return false;
        if(root.data==data)
            return true;
        if(root.data>data){
            return searchhelp(data,root.right);
        }
        else
            return searchhelp(data,root.left);
    }
	

}
