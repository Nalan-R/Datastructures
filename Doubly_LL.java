package linkledlist;

class Node1{
	int data;
	Node1 prev,next;
}
public class Doubly_LL {
	public static void main(String args[]) {
	
		Node1 head,middle,last;
	
	    head=new Node1();
	    middle=new Node1();
	    last=new Node1();
	
	    head.data=10;
	    middle.data=20;
	    last.data=30;
	
	    head.prev=null;
	    head.next=middle;
	    middle.prev=head;
	    middle.next=last;
	    last.prev=middle;
	    last.next=null;
	    
	    System.out.println("Forward Traversal");
	    Node1 temp=head;
	    while(temp!=null){
	    	System.out.println(temp.data);
	    	temp=temp.next;
	    }
	    System.out.println();
	    System.out.println("Backward Traversal");
	    temp=last;
	    while(temp!=null) {
	    	System.out.println(temp.data);
	    	temp=temp.prev;
	    }
	}
}