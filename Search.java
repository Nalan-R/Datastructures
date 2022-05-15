package linkledlist;

public class Search {
	int data;
	Node head;
	
	public void add(int n) {
		Node a =new Node();
		a.data =n;
		a.next =null;
		
		if(head == null)
			head=a;
		else {
			Node last =head;
			while(last.next !=null) {
				last = last.next;
			}
			last.next = a;
		}
	}
	
	public  boolean search(int val) {
		Node temp =head;
		while(temp.next !=null) {
			if(temp.data == val) 
				return true;
			temp = temp.next;	
		}
		  return false;
	}
	
	public void print(){
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String args[]) {
		Search list=new Search();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();
		
		System.out.println(list.search(30)?"Element is Found":"Search not Found");
		System.out.println(list.search(16)?"Element is not Found":"Search not Found");
	}
}
