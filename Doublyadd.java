package linkledlist;

class Node2{
	int data;
	Node2 previous,next;
	
}
public class Doublyadd {
	Node2 head;
	
	public void add(int val) {
		Node2 n=new Node2();
		n.data=val;
		
		if(head==null) {
			n.previous=null;
			n.next=null;
			head=n;	
		}
		else {
			n.previous=null;
		    n.next=head;
		    head.previous=n;
		    head=n;
		}
	}	
		public void print() {
			Node2 temp=head;
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
