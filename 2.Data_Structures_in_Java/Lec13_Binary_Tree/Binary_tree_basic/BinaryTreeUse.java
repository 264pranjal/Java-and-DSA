import java.util.Scanner;

public class BinaryTreeUse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//BinaryTreeNode<Integer> root=takeinput(sc);
		//printbinarytree(root);
		BinaryTreeNode<Integer> root=takeinputlevel(sc);
		printbinarytree(root);
	}

	private static void printbinarytreelevel(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		
	}

	private static BinaryTreeNode<Integer> takeinputlevel(Scanner sc) {
		int rootdata=sc.nextInt();
		if(rootdata==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
				
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of "+front.data);
			int leftchild=sc.nextInt();
			if(leftchild != -1) {
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(leftchild);
				pendingNodes.enqueue(child);
				front.left=child;
			}
			System.out.println("Enter right child of "+front.data);
			int rightchild=sc.nextInt();
			if(rightchild != -1) {
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(rightchild);
				pendingNodes.enqueue(child);
				front.right=child;
			}

		}
		return root;
	}

	private static void printbinarytree(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		String toprint=root.data+":";
		if(root.left!=null) {
			toprint+="L"+root.left.data+",";
		}
		if(root.right!=null) {
			toprint+="R"+root.right.data;
		}
		System.out.println(toprint);
		printbinarytree(root.left);
		printbinarytree(root.right);
	}

	private static BinaryTreeNode<Integer> takeinput(Scanner sc) {
//		System.out.println("Enter root data");
		int rootdata=sc.nextInt();
		if(rootdata==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		System.out.println("Enter left data of: "+rootdata);
		root.left=takeinput(sc);
		System.out.println("Enter right data of: "+rootdata);
		root.right=takeinput(sc);
		return root;
	}

}
