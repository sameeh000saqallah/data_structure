package medTrai;

public class MyLinkedList {
 Node head;
public MyLinkedList() {
	head=null;
}
public boolean isEmpty() {
	return head==null;
}
public void addFirst(int data) {
	Node n=new Node(data);
	n.next=head;
	head=n;
}
public void addLast(int data) {
	Node n=new Node(data);
	if(isEmpty()) {
		head=n;
		return;
	}
	Node current=head;
	while(current.next!=null) 
		current=current.next;
	current.next=n;
}
public void addByIndex(int index,int data) {
	if (index<0) {
		System.out.println("error");
		return;
	}
	if(index==0) {
		addFirst(data);
		return;
	}
	Node current=head;
	for(int i=0;i<index-1;i++) {
		if(current==null) {
			System.out.println("error");
			return;
		}
		current=current.next;
	}
	Node n=new Node(data);
	n.next=current.next;
	current.next=n;
}
public void removeFirst() {
	if(isEmpty()) {
		System.out.println("it is empty");
		return;
	}
	head=head.next;
}
public void removeLast() {
	if(isEmpty()) {
		System.out.println("it is empty");
		return;
	}
	if(head.next==null) {
		head=head.next;
		return;
	}
	Node current=head;
	while(current.next.next!=null)
		current=current.next;
	current.next=null;
}
public void removeByIndex(int index) {
	if(isEmpty()) {
		System.out.println("it is empty");
		return;
	}
	if(index<0) {
		System.out.println("error");
		return;
	}
	if(index==0) {
		removeFirst();
		return;
	}
	Node current=head;
	for(int i=0;i<index-1;i++) {
		if(current==null||current.next==null) {
			System.out.println("error");
			return;
		}
		current=current.next;
	}
	if(current.next==null) {
		System.out.println("error");
		return;
	}
	current.next=current.next.next;
}
public void print() {
	if(isEmpty()) {
		System.out.println("it is empty");
		return;
	}
	Node current=head;
	while(current!=null) {
		System.out.print(current.data+"  ->  ");
		current=current.next;
	}
	System.out.println("null");
}
}