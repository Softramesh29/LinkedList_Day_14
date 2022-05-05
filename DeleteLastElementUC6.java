package com.bridgelabz.LinkedList;

import com.bridgelabz.LinkedList.DeleteFirstElementUC5.Node;

public class DeleteLastElementUC6 {
	 static Node head;
		
	 static class Node {
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null; 
		}
	 }	
	 DeleteLastElementUC6 () {
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
		public static void DeleteLastElement(int pos) {
			Node temp =head;
			Node prev = temp;
			for (int i=1; i<=pos; i++) {
			prev = temp;
			temp = temp.next;
			}
			prev.next = temp.next;
		}
		public void display() {
			Node temp = head;
			while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		    }
		}
		public static void main(String[] args) {
			DeleteLastElementUC6  linkedList = new DeleteLastElementUC6 ();
			linkedList.insert(56);
			linkedList.insert(70);
			linkedList.insertAtPosition(1,30);
			linkedList.DeleteLastElement(2);
			linkedList.display();
		}
}
