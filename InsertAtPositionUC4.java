package com.bridgelabz.LinkedList;

import com.bridgelabz.LinkedList.AppendingLinkedListUC3.Node;

public class InsertAtPositionUC4 {
	 static Node head;
		
	 static class Node {
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null; 
		}
	 }	
	 InsertAtPositionUC4 () {
			head = null;
		}
		public void insert(int val) {
			Node newNode = new Node(val);
			if (head == null)
				head = newNode;
			else {
				head.next = newNode;
				newNode.next = null;
			}
		}
		public static void insertAtPosition(int pos, int val) {
			Node newNode = new Node(val);
			Node temp = head;
			for (int i=1; i <= pos-1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			
		}
		public void display() {
			Node temp = head;
			while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		    }
		}
		public static void main(String[] args) {
			InsertAtPositionUC4  linkedList = new InsertAtPositionUC4 ();
			linkedList.insert(56);
			linkedList.insert(70);
			linkedList.insertAtPosition(1,30);
			linkedList.display();
		}
}
