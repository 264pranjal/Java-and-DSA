/*
For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
Example:
Expression: (()())
Since all the opening brackets have their corresponding closing brackets, we say it is balanced and hence the output will be, 'true'.
You need to return a boolean value indicating whether the expression is balanced or not.
Note:
The input expression will not contain spaces in between.
Input Format:
The first and the only line of input contains a string expression without any spaces in between.
 Output Format:
The only line of output prints 'true' or 'false'.
Note:
You don't have to print anything explicitly. It has been taken care of. Just implement the function. 
Constraints:
1 <= N <= 10^7
 Where N is the length of the expression.

Time Limit: 1sec
Sample Input 1 :
(()()())
Sample Output 1 :
true
Sample Input 2 :
()()(()
Sample Output 2 :
false
Explanation to Sample Input 2:
The initial two pairs of brackets are balanced. But when you see, the opening bracket at the fourth index doesn't have its corresponding closing bracket which makes it imbalanced and in turn, making the whole expression imbalanced. Hence the output prints 'false'.

*/
// public class Solution {
// public static class Node<T>{
//     T data;
//     Node<T> next;
//     public Node(T data){
//         this.data=data;
//         this.next=null;
//     }
//     public Node(){
//         next=null;
//     }
// }
// public static class Stack<T>{

//     private Node<T> head;
//     private int size;

//     public Stack() {
//         head=null;
//         size=0;
//     }

//     public int size() { 
//         return size;
//     }

//     public boolean isEmpty() {
//         return head==null;
//     }

//     public void push(T element) {
//         Node newnode=new Node(element);
//         newnode.next=head;
//         head=newnode;
//         size=size+1;
//     }

//     public void pop() {
//         if(head==null)
//             return;
//         head=head.next;
//         size=size-1;
//     }

//     public T top() {
//         if(head==null)
//             return head.data;
//         return head.data;
//     }
// }

//     public static boolean isBalanced(String expression) {
//         Stack<Character> s = new Stack<Character>();
//         for(char i:expression.toCharArray()){
//             if(i=='[' || i=='{' || i=='(')
//                 s.push(i);
//             else if(i==']' || i=='}' || i==')'){
//                 if(s.isEmpty())
//                     return false;
//                 else{
//                     if((i==']' && s.top()=='[') || (i=='}' && s.top()=='{') || (i==')' && s.top()=='('))
//                         s.pop();
//                 }
//             }
//         }
//         return s.size()==0;
//     }
// }
import java.util.*;
public class Solution {


    public static boolean isBalanced(String expression) {
        //Your code goes here
        Stack<Character> stack=new Stack<Character>();
        for (int j=0;j<expression.length();j++)
        {
            char i=expression.charAt(j);
            if (i=='[' || i=='{' || i=='(')
            {
                stack.push(i);
            }
            else if(i==']' || i=='}' || i==')')
            {
                if (stack.isEmpty())
                    return false;
                
                else
                {
                    if ((i==']' && stack.peek()=='[') || (i=='}' && stack.peek()=='{') || (i==')' && stack.peek()=='('))
                        stack.pop();
                    else
                        return false;
                }
            }
            
        }
        return stack.isEmpty();
        
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String expression = br.readLine().trim();
        System.out.println(Solution.isBalanced(expression));
    }
}
