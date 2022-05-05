package com.bridgelabz.LinkedList;

public class AppendingLinkedListUC3 {
	 static Node head;
	
	 static class Node {
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null; 
		}
	 }	
	 AppendingLinkedListUC3 () {
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
			temp.next = newNode;
			newNode.next =null;
			
		}
		public void display() {
			Node temp = head;
			while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		    }
		}
		public static void main(String[] args) {
			AppendingLinkedListUC3  linkedList = new AppendingLinkedListUC3 ();
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insertAtPosition(2,70);
			linkedList.display();
		}
}
