package com.bridgelabz.LinkedList;

public class SimpleLinkedListUC1 {
	Node head;
	
	 class Node {
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null; 
		}
	 }	
		SimpleLinkedListUC1 () {
			head = null;
		}
		public void insert(int val) {
			Node newNode = new Node(val);
			if (head == null)
				head = newNode;
			else {
				newNode.next = head;
				head = newNode;
			}
		}
		public void display() {
			Node temp = head;
			while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		    }
		}
		
		public static void main(String[] args) {
			SimpleLinkedListUC1 linkedList = new SimpleLinkedListUC1();
			linkedList.insert(70);
			linkedList.insert(30);
			linkedList.insert(56);
			linkedList.display();
			
		}
}
