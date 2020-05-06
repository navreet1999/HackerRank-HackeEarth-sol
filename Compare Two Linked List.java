/*
You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to check if they are equal. The lists are equal only if they have the same number of nodes and corresponding nodes contain the same data. Either head pointer given may be null meaning that the corresponding list is empty.

Input Format

You have to complete the int CompareLists(Node* headA, Node* headB) method which takes two arguments - the heads of the two linked lists to compare. You should NOT read any input from stdin/console.

The input is handled by the code in the editor and the format is as follows: The first line contains , the number of test cases. The format for each test case is as follows:

The first line contains an integer , denoting the number of elements in the first linked list. 
The next  lines contain an integer each, denoting the elements of the first linked list. 
The next line contains an integer , denoting the number of elements in the second linked list. 
The next  lines contain an integer each, denoting the elements of the second linked list.

Constraints

, where  is the  element in the list.
Output Format

Compare the two linked lists and return 1 if the lists are equal. Otherwise, return 0. Do NOT print anything to stdout/console.

The output is handled by the code in the editor and it is as follows:

For each test case, in a new line, print  if the two lists are equal, else print .

Sample Input

2
2
1
2
1
1
2
1
2
2
1
2
Sample Output

0
1
Explanation

In the first case, linked lists are: 1 -> 2 -> NULL and 1 -> NULL

In the second case, linked lists are: 1 -> 2 -> NULL and 1 -> 2 -> NULL*/



import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) 
    {
     if(head1==null && head2==null)
      return true;
      else if(head1==null || head2==null)
      return false;

      while(head1!=null && head2!=null)
      {
      if(head1.data!=head2.data)
      return false;
      head1=head1.next;
      head2=head2.next;
      }

      //to check both heads reach to end ie null
      if(head1==null && head2==null)
      return true;
      else
      return false;
        
    
}
    private static final Scanner scanner = new Scanner(System.in);