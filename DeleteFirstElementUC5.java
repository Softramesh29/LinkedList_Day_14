package com.bridgelabz.LinkedList;

public class DeleteFirstElementUC5 {
	 static Node head;
		
	 static class Node {
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null; 
		}
	 }	
	 DeleteFirstElementUC5 () {
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
		public static void DeleteFirstElement() {
			head = head.next;
			
		}
		public void display() {
			Node temp = head;
			while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		    }
		}
		public static void main(String[] args) {
			DeleteFirstElementUC5  linkedList = new DeleteFirstElementUC5 ();
			linkedList.insert(56);
			linkedList.insert(70);
			linkedList.insertAtPosition(1,30);
			linkedList.DeleteFirstElement();
			linkedList.display();
		}
}
