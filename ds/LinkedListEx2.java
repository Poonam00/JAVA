package ds;
/*find middle node of a linked list in one pass
 * length unknown
*/
public class LinkedListEx2 {
	public static void main(String[] args) {
		SinglyLinkedList2 list=new SinglyLinkedList2();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");


		System.out.println(list);
		System.out.println(list.getmiddleEle());
		
	}
}

class SinglyLinkedList2{
	
	public static  class Node{
		private String data;
		private Node next;
		
		public Node(String data) {
			this.data=data;
		}
	}
	
	private Node head;
	
	public void add(String data) {
		if(head==null) {
			head=new Node(data);
			return;
		}
		
		Node tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		} 
		tail.next=new Node(data);
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		Node current=head;
		while(current!=null) {
			sb.append(current.data+" ");
			current=current.next;
			
		}
		return sb.toString();
	}
	
	public String getmiddleEle() {
		Node fast=head;
		Node slow=head;
		int counter=1;
		while(fast!=null) {
			fast=fast.next;
			if(counter%2==0) {
				slow=slow.next;
			}
			counter++;
		}
		return slow.data;
	}
	
}