package com.bridgelabz.LinkedList;


public class SearchLinkedListUC7 {
	 static Node head;
		
	 static class Node {
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null; 
		}
	 }	
	 SearchLinkedListUC7 () {
			head = null;
		}
		public Node insert(int val) {
			Node newNode = new Node(val);
			if (head == null)
				head = newNode;
			else {
				head.next = newNode;
				newNode.next = null;
			}
			return newNode;
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
		public static void Search (int val) {
			Node temp = head;
			for (int i=1; i <= val; i++) {
				temp = temp.next;
				if(val == temp.data) {
					System.out.println(temp.data+" is present.");
				}

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
			SearchLinkedListUC7  linkedList = new SearchLinkedListUC7 ();
			linkedList.insert(56);
			linkedList.insert(70);
			linkedList.insertAtPosition(1,30);
			linkedList.display();
			linkedList.Search(30);
		}
}
