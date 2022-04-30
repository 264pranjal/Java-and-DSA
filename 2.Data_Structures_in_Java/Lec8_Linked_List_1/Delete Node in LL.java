/*
You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'POS'.
Note :
Assume that the Indexing for the linked list always starts from 0.

If the position is greater than or equal to the length of the linked list, you should return the same linked list without any change.
Illustration :
The following images depict how the deletion has been performed.
Image-I :
Alt txt

Image-II :
Alt txt

Input format :
The first line contains an Integer 'T' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the linked list separated by a single space. 

The second line of each test case contains the integer value of 'POS'. It denotes the position in the linked list from where the node has to be deleted.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the resulting linked list of integers in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Note:
You are not required to print the output, it has already been taken care of. Just implement the function. 
Constraints :
1 <= T <= 10^2
0 <= N <= 10^5
POS >= 0

Time Limit: 1sec
Sample Input 1 :
1 
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
3 4 5 6 1 9
Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0
10 20 30 40 50 60 -1
7
Sample Output 2 :
4 5 2 6 1 9
10 20 30 40 50 60
*/
public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        if(head==null)
            return head;
		if(pos==0){
            return head.next;
        }
        int i=0;
        LinkedListNode<Integer> temp=head;
        while(i<pos-1 && temp!=null){
            temp=temp.next;
            i++;
        }
        if(temp==null)
            return head;
        if(temp.next!=null)
            temp.next=temp.next.next;
        return head;
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
    
    public static void print(LinkedListNode<Integer> head){
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

            int pos = Integer.parseInt(br.readLine().trim());
            head = Solution.deleteNode(head, pos);
            print(head);

            t -= 1;
        }
    }
}
