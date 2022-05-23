package Linked_list;

class Node11{
	int data;
	Node11 next;
}
public class Circular_addlast {
	Node11 head;
	
	public void add(int val) {
		Node11 a=new Node11();
		a.data=val;
		
		if(head==null) {
			a.next=a;
			head=a;
		}
		else {
			 Node11 last = head;
		while(last.next!=head) {
			last=last.next;
		}
		last.next=a;
		a.next=head;
		}
	}
	
	public void print() {
		Node11 temp=head;
		do {
			System.out.println(temp.data);
			temp=temp.next;
		}
		while(temp!=head);
	}
	public static void main(String[] args) {
		Circular_addlast list=new Circular_addlast();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.print();
	}

}
