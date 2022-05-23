package Linked_list;

class Node9{
	int data;
	Node9 next;
}
public class Circular_LL {
	public static void main(String srgs[]) {
	    Node9 head,middle,last;
	
	    head=new Node9();
	    middle=new Node9();
	    last=new Node9();
	
	    head.data=10;
	    middle.data=20;
	    last.data=30;
	
	    head.next=middle;
	    middle.next=last;
	    last.next=head;
	
	    Node9 temp=head;
	    do {
		    System.out.println(temp.data);
		    temp=temp.next;
	    }
	    while(temp!=head);
    }
}