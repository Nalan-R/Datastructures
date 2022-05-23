package Linked_list;

class Node10{
	int data;
	Node10 next;
}
public class Circular_addfirst {
	Node10 head;
	
	public void add(int val) {
		Node10 a=new Node10();
		a.data=val;
		
		if(head==null) {
			a.next=a;
			head=a;
		}
		else {
			Node10 last=head;
			while(last.next!=head) {
				last=last.next;
			}
			last.next=a;
			a.next=head;
			head=a;
		}
	}
	
	public void print() {
		 Node10 temp=head;
		    do {
			    System.out.println(temp.data);
			    temp=temp.next;
		    }
		    while(temp!=head);
	}
	public static void main(String[] args) {
	Circular_addfirst list=new Circular_addfirst();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();
	}

}
