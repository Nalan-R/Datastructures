package Linked_list;

class Node5{
	int data;
	Node5 prev,next;
	
}
public class Doublydelete {
	Node5 head;
	
	public void add(int val){
		Node5 a=new Node5();
		a.data=val;
		if(head==null) {
			head=a;
			a.prev=null;
			a.next=null;
		}
		else {
			Node5 last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=a;
			a.prev=last;
			a.next=null;
		}
	}
	
	public void del(int value) {
		if(head==null)
		return;
		
		Node5 temp=head;
		while(temp!=null && temp.data!=value) {
			temp=temp.next;
		}
	    if(temp==head) {
			head=head.next;
			head.prev=null;
		}else if(temp.next==null)
			temp.prev.next=null;
		else {
			temp.prev.next=temp.next;
		    temp.next.prev=temp.prev;
		}
	}
	
	public void print(){
		Node5 temp=head;
		Node5 last=null;
		  // Forward
		while(temp!=null) {
			System.out.println(temp.data);
			if(temp.next==null)
				last=temp;
			temp=temp.next;
		} 
		    System.out.println();
		   // Backward
		temp=last;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}	
	}
	public static void main(String[] args) {
		Doublydelete list=new Doublydelete();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();
		System.out.println();
		System.out.println("After Delete");
		
		list.del(20);
		list.del(40);
		list.print();
	}
}
