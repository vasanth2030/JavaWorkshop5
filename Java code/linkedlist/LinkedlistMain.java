package linkedlist;


public class LinkedlistMain {
	public static void main(String[] args) {
		Node head=new Node(10);
		Node.insertElementAtEnd(head, 20);
		Node.insertElementAtEnd(head, 30);
		Node.insertElementAtEnd(head, 40);
		Node.insertElementAtEnd(head, 50);
		Node.insertElementAtEnd(head, 60);
		
		Node.printLikedList(head);
	}
}
