package ds;

/*The Kth Node from the tail in a Singly linked list
 * find 3rd element from tail of a singly linked list in one pass/iteration
 * 
*/

public class LinkedListEx1 {

	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		/*list.add("5");
		list.add("6");
		list.add("7");*/
		
		System.out.println(list.toString());
		String nthTerm=list.grtNthNodeFromTail(4);
		System.out.println(nthTerm);
	}
}

class SinglyLinkedList{
	public static class Node{
		private Node next;
		private String data;
		
		//Node constructor
		public Node(String data) {
			this.data=data;
		}
		
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}
	 private Node head;
	 
	 public void add(String data) {
		 if(head==null) {//initial head creation
			 head=new Node(data);
			 return;
		 }
		 
		 //else go to last element and add to its next
		 Node tail=head;
		 while(tail.next!=null) {
			 tail=tail.next;
		 }
		 tail.next=new Node(data);
		  
	 }
	 
	 public String grtNthNodeFromTail(int n) {
		 int counter=1;
		 Node fast=head;
		 Node slow=head;
		 while(fast.next!=null) {
		     fast = fast.next;
			 counter++;
			 if(counter>n) {
				 slow=slow.next;
			 }
		 }
		// System.out.println(counter);
		 if(n>counter) {//invalid
			 return null;
		 }
		 return slow.data;
	 }
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		 StringBuilder sb=new StringBuilder();
		 Node current=head;
		 while(current!=null) {
			 sb.append(current.data+" ");
			 current=current.next;
		 }
		 return sb.toString();		 
		 
	 }
	 
}