package com.company;
import java.util.*;

public class LinkedList {
     Node head;
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void insertAtFront(int a){
        Node newNode = new Node(a);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(int a){
        Node newNode = new Node(a);
        if (head == null){
            head = newNode;
            head.next = null;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void insertAfter(int a, Node previousNode){
        Node newNode = new Node(a);
        if (previousNode == null){
            return;
        }
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }
    public Node insertAt(int a, int position) {
        if (head == null && position > 0) {
            return null;
        }
        if (position == 0) {
            Node newHead = new Node(a);
            newHead.next = head;
            return newHead;
        } else {
            head.next = insertAt(a, position - 1);
            return head;
        }
    }
    public void deleteNode(int a){            // leftmost element with value a will
        Node currentNode = head;              // deleted from the linked list
        Node previousNode = null;
        if(currentNode!= null && currentNode.data == a){
            head = currentNode.next;
            return;
        }
        while(currentNode != null && currentNode.data != a){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode == null){
            return;
        }
        else{
            previousNode.next = currentNode.next;
        }
    }
    public void deleteNodeAtPosition(int a){
        Node currentNode = head;
        int i = 0;
        if (head == null){
            return;
        }
        if (a==0){
            head= currentNode.next;
            return;
        }
        while (currentNode != null && i<=a){
            if (i==a-1){
                if (currentNode.next== null){
                    return;
                }
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
            i++;
        }
        if (currentNode == null){
            return;
        }
    }
    public void deleteList(){
        head = null;
    }
    public int length(){
        Node currentNode = head;
        if (head==null){
            return 0;
        }
        int i = 1;
        while (currentNode.next != null){
            currentNode=currentNode.next;
            i++;
        }
        return i;
    }
    public int lengthRecursive(Node node){
        if (node == null){
            return 0;
        }
        else{
            return 1+lengthRecursive(node.next);
        }
    }
    public boolean search(int a){
        Node currentNode = head;
        if (head==null){
            return false;
        }
        while(currentNode!=null){
            if (currentNode.data == a){
                return true;
            }
            currentNode=currentNode.next;
        }
        return false;
    }
    public boolean searchRecursive(Node currentNode, int a){
        if (currentNode==null){
            return false;
        }
        else{
            if (currentNode.data == a){
                return true;
            }
            else{
                return searchRecursive(currentNode.next, a);
            }
        }
    }
    public Node getNodeAt(int a){
        Node currentNode = head;
        Node newNode = new Node(-1);
        if (head== null){
            System.out.print("(not present) ");
            return newNode;
        }
        int i = 0;
        while (currentNode != null && i < a){
            currentNode = currentNode.next;
            i++;
        }
        if (currentNode== null){
            System.out.print("(not present) ");
            return newNode;
        }
        else if (i==a){
            return currentNode;
        }
        else{
            System.out.print("(not present) ");
            return newNode;
        }
    }
    public int getNodeAtRecursive(int a){
        if (a == 0){
            return head.data;
        }
        else if (head != null){
            head = head.next;
            a--;
            return getNodeAtRecursive(a);
        }
        else{
            return -1;
        }
    }
    public int getNodeFromEnd(int a){
        a++;
        if (a<= length()){
            return getNodeAt(length()-a).data;
        }
        else{
            return -1;
        }
    }
    public int middleElement(){
        Node currentNodeSlow = head;
        Node currentNodeFast = head;
        if (head == null){
            System.out.print("list is empty ");
            return -1;
        }
        while (currentNodeFast != null && currentNodeFast.next != null){
            currentNodeSlow = currentNodeSlow.next;
            currentNodeFast = currentNodeFast.next.next;
        }
        return currentNodeSlow.data;
    }
    public int occurrences(int a){
        Node currentNode = head;
        if (head == null){
            return 0;
        }
        int i = 0;
        while (currentNode != null){
            if (currentNode.data == a){
                i++;
            }
            currentNode=currentNode.next;
        }
        return i;
    }
    public boolean detectLoop(){
        Node currentNodeFast = head;
        Node currentNodeSlow = head;
        boolean flag = false;
        while(currentNodeFast!=null && currentNodeFast.next != null && currentNodeSlow!=null && currentNodeSlow.next != null){
            currentNodeFast = currentNodeFast.next.next;
            currentNodeSlow = currentNodeSlow.next;
            if (currentNodeFast==currentNodeSlow){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public int looplength(){
        Node currentNodeFast = head;
        Node currentNodeSlow = head;
        int i = 0;
        while(currentNodeFast!=null && currentNodeFast.next != null && currentNodeSlow!=null && currentNodeSlow.next != null){
            currentNodeFast = currentNodeFast.next.next;
            currentNodeSlow = currentNodeSlow.next;
            i++;
            if (currentNodeFast==currentNodeSlow){
                break;
            }
        }
        return i;
    }
    public void removeDuplicates(){
        Node currentNode = head;
        while(currentNode!=null){
            Node temp = currentNode;
            while(temp!=null && temp.data==currentNode.data){
                temp=temp.next;
            }
            currentNode.next=temp;
            currentNode=currentNode.next;
        }
    }
    public void swapNodes(int a, int b){
        Node currentNode = head;
        Node temp = null;
        while(currentNode!=null){
            if (currentNode.next.data == a){
                temp = currentNode.next;
            }
            if(currentNode.next.data == b){
                currentNode.next=temp;
            }
            currentNode=currentNode.next;
        }
    }
    public void printLinkedList(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    void reversePrintLinkedListUsingStacks(Node head){
        Node currentNode = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(currentNode != null){
            stack.push(currentNode.data);
            currentNode = currentNode.next;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println();
    }
    Node reverseALinkedListUsingStacks(Node head){
        Node currentNode = head;
        Stack<Node> stack = new Stack<>();                                                   //create a new object of stack
        while(currentNode.next != null){                                                            //initialise a loop that traverse till the tail of the list
            stack.push(currentNode);                                                                    //push the node in the stack
            currentNode = currentNode.next;                                                       //update the node iterator
        }
        head = currentNode;                                                                               //making the last node as head of the new (reversed) list
        while(!stack.isEmpty()){                                                                          //initialise a loop that traverse till the tail of the list
            currentNode.next = stack.peek();                                                        //keep joining the current node with the node present at the top of stack
            currentNode = currentNode.next;                                                       //update the node iterator
            stack.pop();                                                                                         //remove the topmost node after joining it with current node of the new (reversed) list
        }
        currentNode.next = null;                                                                         //assign the next pointer of the last node as null to end the list
        return head;                                                                                            //return the head of the new (reversed) list
    }
    static void printList(Node head){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    Node reverseList(Node node) {
        Node prev = null, curr = node, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    void rearrange(Node head) {
        Node slow = head, fast = slow.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;                                                                                   //find the middle node using floyd's turtle and hare algorithm
            fast = fast.next.next;
        }
        Node node1 = head;
        Node node2 = slow.next;
        slow.next = null;
        node2 = reverseList(node2);                                                                       //reverse the list from the middle point to tail of the list
        head = new Node(0);                                                                       //create a new false head for the new list
        Node currentNode = head;
        while (node1 != null || node2 != null) {
            if (node1 != null) {
                currentNode.next = node1;                                                                //creating a new list of given order in the question by taking one node from
                currentNode = currentNode.next;                                                       //the starting and one node from ending and then combining them
                node1 = node1.next;
            }
            if (node2 != null) {
                currentNode.next = node2;
                currentNode = currentNode.next;
                node2 = node2.next;
            }
        }
        head = head.next;                                                                                     //removing the false of the list and updating it with the real head
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            if (a != -1){
                llist.insertAtEnd(a);
            }
            else{
                break;
            }
        }
        llist.printLinkedList();

//        Node sh = llist.insertAt(10,1);
//        printList(llist.head);
    }
}