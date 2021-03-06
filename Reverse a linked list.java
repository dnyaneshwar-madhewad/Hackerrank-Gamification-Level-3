/*
Given the pointer to the head node of a linked list, change the next pointers of the nodes so that their order is reversed. 
The head pointer given may be null meaning that the initial list is empty.

Example
 references the list 

Manipulate the  pointers of each node in place and return , now referencing the head of the list .
Function Description
Complete the reverse function in the editor below.

reverse has the following parameter:
SinglyLinkedListNode pointer head: a reference to the head of a list
Returns
SinglyLinkedListNode pointer: a reference to the head of the reversed list
Input Format


The first line contains an integer , the number of test cases.
Each test case has the following format:

The first line contains an integer , the number of elements in the linked list.
Each of the next  lines contains an integer, the  values of the elements in the linked list.

Constraints

, where  is the  element in the list.
Sample Input

1
5
1
2
3
4
5

Sample Output
5 4 3 2 1 

Explanation
The initial linked list is: .
The reversed linked list is: 
*/

mport java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
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
 
 

    class Result {

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
        static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode next = null;
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode previous = null;
        while(current!=null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        SinglyLinkedListNode singlyLinkedListNode = previous;
        return singlyLinkedListNode;
    }
    }

}
  
   private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

            SinglyLinkedListNode llist1 = reverse(llist.head);

            printSinglyLinkedList(llist1, " ", bufferedWriter);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

/*

*/
