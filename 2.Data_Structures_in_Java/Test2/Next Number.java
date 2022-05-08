/*
Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.
Input Constraints:
1 <= Length of Linked List <=10^6.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements 
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0 
*/
public class Solution {


	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        if(head==null)
            return head;
        LinkedListNode<Integer> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        LinkedListNode<Integer> tail=temp;
        if(temp.data<9){
            temp.data=temp.data+1;
        }
        else if(temp.data==9){
            LinkedListNode<Integer> temp1=reverse(head);
            LinkedListNode<Integer> temp2=temp1;
            while(temp1.next!=null){
                if(temp1.data==9){
                    temp1.data=0;
                }
                else if(temp1.data<9){
                    temp1.data=temp1.data+1;
                    break;
                }
                temp1=temp1.next;
            }
            if(temp1.data==9){
                temp1.data=0;
                LinkedListNode<Integer> newnode=new LinkedListNode<Integer>(1);
                temp1.next=newnode;
                newnode.next=null;
            }
            head=reverse(temp2);
        }
        return head;
	}
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        if(head==null || head.next==null)
            return head;
        LinkedListNode<Integer> tail=head.next;
        LinkedListNode<Integer> newhead=reverse(head.next);
        tail.next=head;
        head.next=null;
        return newhead;
    }

}
import java.util.Scanner;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
public class Runner {
	static Scanner s = new Scanner(System.in);

	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(LinkedListNode<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
		
	public static void main(String[] args) {
		
		LinkedListNode<Integer> head = takeInput();
		head = Solution.nextLargeNumber(head);
		print(head);
		
	}

}
