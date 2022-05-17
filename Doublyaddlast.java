package linkledlist;

class Node0{
	int data;
	Node0 prev,next;
}
public class Doublyaddlast {
	Node0 head;
	
	
	public void addlast(int val) {
		Node0 n=new Node0();
		n.data=val;
		
		if(head==null) {
			n.prev=null;
			n.next=null;
			head=n;	
		}
		else {
			Node0 last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=n;
			n.prev=last;
			n.next=null;
		}
	}	
		public void print() {
			 Node0 temp=head;
			 Node0 last=null;
			      // Forward
			    while(temp!=null){
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
		
		public static void main(String args[]) {
			Doublyaddlast list=new Doublyaddlast();
			
			list.addlast(10);
			list.addlast(20);
			list.addlast(30);
			list.addlast(45);
			list.print();
		}
	
}
