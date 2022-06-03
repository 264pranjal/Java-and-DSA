/*
Given a generic tree, print the input tree in level wise order. That is, print the elements at same level in one line (separated by space). Print different levels in differnet lines.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Level wise print
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output :
10
20 30 40 
40 50
*/
public class Solution {
	
	public static void printLevelWise(TreeNode<Integer> root){
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
        System.out.println(root.data);
        pendingNodes.enqueue(null);
		while(!pendingNodes.isEmpty()) {
			try {
				
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				if(frontNode==null){
        			if(!pendingNodes.isEmpty()) {
                    	System.out.println();
                    	pendingNodes.enqueue(null);
                } else {
                    break;
                }
                }
                else{
                    for(int i=0;i<frontNode.children.size();i++) {
                        //s=s+frontNode.children.get(i).data+" ";
                        System.out.print(frontNode.children.get(i).data+" ");
                        pendingNodes.enqueue(frontNode.children.get(i));
                    }
                }
			} catch (QueueEmptyException e) {
				return;
			}
		}

	}
		
}

//MAIN CODE

import java.util.ArrayList;
import java.util.Scanner;

 class QueueEmptyException extends Exception {
	 
}

 class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

   class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}
 
public class Main {

	

	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise(){
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = s.nextInt();
				for(int i = 0 ; i < numChild; i++){
					int currentChild = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}


	public static void main(String[] args) {
		TreeNode<Integer> root =  takeInputLevelWise();
		Solution.printLevelWise(root); 
	}

}
