Delete a Node
Problem Statement :

Delete the node at a given position in a linked list and return a reference to the head node. 
The head is at position 0. The list may be empty after you delete the node. In that case, return a null value.

Example:
list=0->1->2->3
position=2

After removing the node at position 2, list'= 0->1->-3.


Function Description:
Complete the deleteNode function in the editor below.


deleteNode has the following parameters:
- SinglyLinkedListNode pointer llist: a reference to the head node in the list
- int position: the position of the node to remove


Returns
- SinglyLinkedListNode pointer: a reference to the head of the modified list


Input Format:
The first line of input contains an integer n, the number of elements in the linked list.
Each of the next n lines contains an integer, the node data values in order.
The last line contains an integer, position, the position of the node to delete.


Constraints:
     1.  1<=n<=1000
     2.  1<=list[i]<=1000
------------------------------------------------------------------------------------------------
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
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

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}



class Result {

   static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        int currentNodePosition = 0;
        SinglyLinkedListNode head = llist;
        SinglyLinkedListNode currentNode = llist;
        
         if (position == 0) {
            head = head.next;
            return head;
        }
        
        while (currentNodePosition < position - 1) {
            currentNode = currentNode.next;
            currentNodePosition++;
        }
        
        if (currentNode.next != null && currentNode.next.next != null) {
            currentNode.next = currentNode.next.next;
        }
        
        return head;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, llistCount).forEach(i -> {
            try {
                int llistItem = Integer.parseInt(bufferedReader.readLine().trim());

                llist.insertNode(llistItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int position = Integer.parseInt(bufferedReader.readLine().trim());

        SinglyLinkedListNode llist1 = Result.deleteNode(llist.head, position);

        SinglyLinkedListPrintHelper.printList(llist1, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
------------------------------------------------------------------------------------------------

Test Cast 0:
Congratulations, you passed the sample test case.
Click the Submit Code button to run your code against all the test cases.

Input (stdin)
8
20
6
2
19
7
4
15
9
3

Your Output (stdout)
20 6 2 7 4 15 9

Expected Output
20 6 2 7 4 15 9


Test Cast 1:
Congratulations, you passed the sample test case.
Click the Submit Code button to run your code against all the test cases.
Input (stdin)
4
11
9
2
9
1

Your Output (stdout)
11 2 9

Expected Output
11 2 9
