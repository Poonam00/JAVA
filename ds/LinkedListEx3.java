package ds;

import ds.SinglyLinkedLit3.Node;

/*Algorithm to remove loop from linked list i.e point end of loop to null
 * Step 1: first check if linked list have loop 1.e isCyclic;
 * 		condition :tail.next !=null, and two pointer(fast=2 step, slow=1 step) should collide at a point
 * Step 2: Find the start node of loop
 * 		condition : after fast and slow nodes collide,start the slow node from beginning,
 * 					both pointer move forward by one step,the point they meet is start node
 * Step 3: Again find last node of loop i.e end node point to start node
 * 	
 * 
*/
public class LinkedListEx3 {
	public static void main(String[] args) {
		SinglyLinkedLit3 linkedList = new SinglyLinkedLit3();
		linkedList.add(new Node("101"));
		linkedList.add(new Node("201"));
		Node loopStartNode = new Node("301");

		linkedList.add(loopStartNode);
		linkedList.add(new Node("401"));
		linkedList.add(new Node("501"));
		
		Node loopEndNode = new Node("601");
		loopEndNode.setNext(loopStartNode);
		linkedList.add(loopEndNode);

		

		//System.out.println("Linked List : " + linkedList.toString());
		
		System.out.println("Is Cyclic: "+linkedList.isCyclic());
		 System.out.println("Linked List after removing loop : "+linkedList); 

	}
}

class SinglyLinkedLit3 {
	private Node head;

	public static class Node {
		private String data;
		private Node next;

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node(String data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data +"]";
		}

	}

	public void add(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node tail = head;
			while (tail.next != null) {
				tail = tail.next;
			}

			tail.next = node;
		}
	}

	public boolean isCyclic() {
		Node fast = head;
		Node slow = head;
		boolean iscyclic = false;

		while (fast != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				iscyclic = true;
				break;
			}
		}
		
		if(iscyclic) {
			
			removeloop(fast,slow);
		
		}

		return iscyclic;
	}
	
	public void removeloop(Node fast,Node slow) {
		//both node are pointing to same node
		slow =head;
		while(fast!=slow) {
			fast=fast.next;
			slow=slow.next;
		}
		
		//both node give start of node
		while(fast.next!=slow) {
			fast=fast.next;
		}
		
		fast.next=null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node tail = head;
		while (tail != null) {
			sb.append(tail.data + " ");
			tail = tail.next;
		}
		return sb.toString();
	}
}