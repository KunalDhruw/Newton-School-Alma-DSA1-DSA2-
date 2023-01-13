/*
Merge two sorted linked list
easy


Problem Statement
Given two sorted linked list of size s1 and s2(sizes may or may not be same), your task is to merge them such that resultant list is also sorted.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Merge() that takes head node of both the linked list as the parameter.

Constraints:
1 < = s1, s2 < = 1000
1 < = val < = 10000
Output
Return the head of the merged linked list, printing will be done by the driver code
Example
Sample Input:
5 6
1 2 3 4 5
3 4 6 8 9 10

Sample Output:
1 2 3 3 4 4 5 6 8 9 10
*/



/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
static Node h3, e3;

//1, 2, 3, 4, 5
//h3 = null, e3 = null
//h3 -> [(1, address(2)) -> e3 -> (2, null)]
public static Node insertEnd(int val){
    if(h3 == null){
        h3 = new Node(val);
        e3 = h3;
    }
    else{
        Node newnode = new Node(val); //(2, null)
        e3.next = newnode;
        e3 = e3.next;
    }
    return h3;
}


public static Node Merge (Node h1, Node h2){
    h3 = null;
    e3 = null;
    while(h1!=null && h2!=null){
        if(h1.val <= h2.val){
            h3 = insertEnd(h1.val);
            h1 = h1.next;
        }
        else{
            h3 = insertEnd(h2.val);
            h2 = h2.next;
        }
    }
    while(h1 != null){
        h3 = insertEnd(h1.val);
        h1 = h1.next;
    }
    while(h2 != null){
        h3 = insertEnd(h2.val);
        h2 = h2.next;
    }
    return h3;
}
