package Linked_list;

public class Doublyadd {
	int data;
	Node head;
	
	public void add(int value){
		Node newnode=new Node();
		newnode.data=value;
		newnode.previous=null;

		if(head == null) 
			head=newnode;
		else {
			head.previous=newnode;
		    newnode.previous=null;
		    head=newnode;
		}
	}
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String args[]) {
		Doublyadd list=new Doublyadd();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.print();
	}
}
