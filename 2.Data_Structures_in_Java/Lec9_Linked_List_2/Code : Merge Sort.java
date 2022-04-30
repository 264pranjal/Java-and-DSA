/*
Given a singly linked list of integers, sort it using 'Merge Sort.'
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the sorted singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
 3 4 5 6 7 8 9 10 
 Sample Output 2 :
2
-1
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90 
*/
public class Solution {

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		if(head==null || head.next==null)
            return head;
        LinkedListNode<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        LinkedListNode<Integer> h2=slow.next,mid=slow,h1=head;
        mid.next=null;
        LinkedListNode<Integer> head1=mergeSort(h1);
        LinkedListNode<Integer> head2=mergeSort(h2);
        LinkedListNode<Integer> finalhead=merge(head1,head2);
        return finalhead;
	}
    
    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2){
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        LinkedListNode<Integer> t1=head1,t2=head2,fh=null,ft=null;
        if(t1.data>=t2.data){
            fh=t2;
            ft=t2;
            t2=t2.next;
        }
        else{
            fh=t1;
            ft=t1;
            t1=t1.next;
        }
        while(t1!=null && t2!=null){
            if(t1.data>=t2.data){
                ft.next=t2;
                ft=ft.next;
                t2=t2.next;
            }
            else if(t1.data<t2.data){
                ft.next=t1;
                ft=ft.next;
                t1=t1.next;
            }
        }
        if(t1==null){
            ft.next=t2;
        }
        if(t2==null){
            ft.next=t1;
        }
        return fh;

    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Runner {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            
            LinkedListNode<Integer> head = takeInput();

            LinkedListNode<Integer> newHead = Solution.mergeSort(head);
            print(newHead);
            
            t -= 1;
        }

    }
}
