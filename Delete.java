package linkledlist;

public class Delete {
	int data;
	Node head,temp;
	
	public  void addLast(int value) {
		Node newnode =new Node();
		newnode.data =value;
		newnode.next =null;
		
		if(head == null)
			head=newnode;
		else {
			Node lastnode =head;
			while(lastnode.next !=null) {
				lastnode = lastnode.next;
			}
			lastnode.next = newnode;
		}
	}
	
	public void delete(int val) {
		if(head.data == val)
			head = head.next;
		else
			  temp = head;
		    while(temp.next!=null) {
		    	if(temp.next.data == val) {
		    		temp.next =temp.next.next;
		    		break;
		    	}
		    	else
		    		temp=temp.next;
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
		
		Delete list = new Delete();
		
		list.addLast(10);
		list.addLast(22);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.print();
		
		System.out.println();
		System.out.println("After Delete");
		list.delete(22);
		list.delete(40);
		list.print();
		
	}
}
