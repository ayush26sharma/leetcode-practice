package com.company;

import java.util.Scanner;
public class Stacks {
    ListNode head;
    static class ListNode{
        int value;
        ListNode next;
        ListNode(int value){
            this.value = value;
        }
    }
    Stacks(){
        this.head = null;
    }
    public void push(int x){
        ListNode top = new ListNode(x);
        top.value = x;
        top.next = head;
        head = top;
    }
    public void pop(){
        if (head == null) return;
        head = (head).next;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int peek(){
        if (!isEmpty()) {
            return head.value;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public void display(){
        if (head == null) return;
        else {
            ListNode currentNode = head;
            while (currentNode != null){
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.next;
            }
        }
        System.out.println();
    }
    public int size(){
        int stackSize = 0;
        if (head == null) return 0;
        else {
            ListNode currentNode = head;
            while (currentNode != null) {
                stackSize++;
                currentNode = currentNode.next;
            }
            return stackSize;
        }
    }
    public static void main(String[] args) {

    }
}

