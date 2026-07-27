package medTrai;
import java.util.ArrayList;
public class main {
public static void main(String[] args) {
	MyLinkedList list=new MyLinkedList();
	AddLast(list,2);
	AddLast(list,5);
	AddLast(list,3);
	AddLast(list,7);
	AddLast(list,8);
	AddLast(list,6);
	AddLast(list,4);
	RemovePeaks(list);
	list.print();
	ArrayList<Integer> lis=new ArrayList<>();
	lis.add(2);
	lis.add(7);
	lis.add(6);
	lis.add(4);
	lis.add(3);
	lis.add(8);
	lis.add(1);
	int k=10;
	RemovePairs(lis,k);
	System.out.print(lis.get(0));
	for(int i=1;i<lis.size();i++)
		System.out.print(" -> "+lis.get(i));
}
public static void AddFirst(MyLinkedList list,int x) {
	Node n=new Node(x);
	n.next=list.head;
	list.head=n;
}
public static void AddLast(MyLinkedList list,int x) {
	Node n=new Node(x);
	if(list.head==null) {
		n.next=list.head;
		list.head=n;
		return;
	}
	Node current=list.head;
	while(current.next!=null)
		current=current.next;
	current.next=n;
}
public static void ListPrint(MyLinkedList list) {
	Node current=list.head;
	while(current!=null) {
		System.out.print(current.data+" -> ");
		current=current.next;
	}
	System.out.println("null");
}
public static int ListSize(MyLinkedList list) {
	int size=0;
	Node current=list.head;
	if(current==null)
		return size;
	while(current!=null) {
		size++;
		current=current.next;
	}
	return size;
}
public static boolean exist(MyLinkedList list,int x) {
	Node current=list.head;
	while(current!=null) {
		if(current.data==x)
			return true;
		current=current.next;
	}
	return false;
}
public static int MaxValue(MyLinkedList list) {
	Node current=list.head;
	if (current==null)
		return Integer.MIN_VALUE;
	int max=current.data;
	while(current!=null) {
		if(current.data>max)
			max=current.data;
		current=current.next;
	}
	return max;
}
public static int MinValue(MyLinkedList list) {
	Node current=list.head;
	if(current==null)
		return Integer.MAX_VALUE;
	int min=current.data;
	while(current!=null) {
		if(current.data<min)
			min=current.data;
		current=current.next;
	}
	return min;
}
public static int TotalValues(MyLinkedList list) {
	if(list.head==null)
		return 0;
	if(list.head.next==null)
		return list.head.data;
	Node current=list.head;
	int total=0;
	while(current!=null) {
		total+=current.data;
		current=current.next;
	}
	return total;
}
public static void RemoveFirst(MyLinkedList list) {
	if(list.head==null)
		return;
	Node current=list.head;
	list.head=current.next;
}
public static void RemoveLast(MyLinkedList list) {
	if(list.head==null)
		return;
	if(list.head.next==null) {
		RemoveFirst(list);
		return;
	}
	Node previous=null;
	Node current=list.head;
	while(current.next.next!=null)
		current=current.next;
	previous=current;
	current=current.next;
	previous.next=current.next;
}
public static void RemoveByIndex(MyLinkedList list,int index) {
	if(list.head==null||index<0||index+1>ListSize(list))
		return;
	if(index==0) {
		RemoveFirst(list);
		return;
	}
	Node previous=null;
	Node current=list.head;
	for(int i=0;i<index-1;i++) {
		current=current.next;
	}
	previous=current;
	current=current.next;
	previous.next=current.next;
}
public static void DeleteFirstValue(MyLinkedList list,int x) {
	if(list.head==null)
		return;
	if(list.head.data==x) {
		RemoveFirst(list);
		return;
	}
	Node current=list.head;
	Node previous=null;
	while(current.next!=null&&current.next.data!=x)
		current=current.next;
	if(current.next==null)
		return;
	previous=current;
	current=current.next;
	previous.next=current.next;
}
public static void DeleteAllValues(MyLinkedList list,int x) {

    while(list.head!=null && list.head.data==x)
        RemoveFirst(list);

    if(list.head==null)
        return;

    Node current=list.head;

    while(current.next!=null) {

        if(current.next.data==x)
            current.next=current.next.next;
        else
            current=current.next;
    }
}
public static void SetByIndex(MyLinkedList list,int x,int index) {
	if(list.head==null&&index==0) {
	AddFirst(list,x);
	return;
	}
	if(list.head==null||index<0||index+1>ListSize(list))
		return;
	if(index==0) {
		RemoveFirst(list);
		AddFirst(list,x);
		return;
	}
	if(index+1==ListSize(list)) {
		RemoveLast(list);
		AddLast(list,x);
		return;
	}
	 Node current=list.head;

	    for(int i=0;i<index;i++)
	        current=current.next;

	    current.data=x;
}
public static void RemoveEven(MyLinkedList list) {
	if(list.head==null)
		return;
	while(list.head!=null&&list.head.data%2==0)
		RemoveFirst(list);
	if(list.head==null)
		return;
	Node current=list.head;
	while(current.next!=null) {
		if(current.next.data%2==0)
			current.next=current.next.next;
		else current=current.next;
	}
}
public static void RemoveOdd(MyLinkedList list) {
	if(list.head==null)
		return;
	while(list.head!=null&&list.head.data%2==1)
		RemoveFirst(list);
	if(list.head==null)
		return;
	Node current=list.head;
	while(current.next!=null) {
		if(current.next.data%2==1)
			current.next=current.next.next;
		else current=current.next;
	}
}
public static void RemoveMore(MyLinkedList list,int x) {
	if(list.head==null)
		return;
	while(list.head!=null&&list.head.data>x)
		RemoveFirst(list);
	if(list.head==null)
		return;
	Node current=list.head;
	while(current.next!=null) {
		if(current.next.data>x)
			current.next=current.next.next;
		else current=current.next;
	}
}
public static MyLinkedList Reverse(MyLinkedList list) {
	MyLinkedList rev=new MyLinkedList();
	Node current=list.head;
	while(current!=null) {
		AddFirst(rev,current.data);
		current=current.next;
    }
	return rev;
}
public static boolean IsPalindrome(MyLinkedList list) {
	MyLinkedList reverse=Reverse(list);
	Node current1=list.head;
	Node current2=reverse.head;
	while(current1!=null) {
		if(current1.data!=current2.data) {
			return false;
		}
		current1=current1.next;
		current2=current2.next;
	}
	return true;
}
public static void RemoveDuplicates(MyLinkedList list) {
	Node current=list.head;
	while(current!=null) {
		Node temp=current;
		while(temp.next!=null) {
			if(current.data==temp.next.data)
				temp.next=temp.next.next;
			else temp=temp.next;
		}
		current=current.next;
	}
}
public static void PrintFrequency(MyLinkedList list) {
	System.out.println("Frequency :- ");
	if (list.head==null) {
		System.out.println("list is empty");
		return;
	}
	Node current=list.head;
	while(current!=null) {
		Node check=list.head;
		while(check!=current) {
			if(current.data==check.data)
				break;
			check=check.next;
		}
		if(current.data==check.data) {
			current=current.next;
			continue;
		}
		Node temp=current.next;
		int f=1;
		while(temp!=null) {
			if(current.data==temp.data)
				f++;
			temp=temp.next;
		}
		System.out.println(current.data+" : "+f);
		current=current.next;
	}
}
public static boolean AllUnique(MyLinkedList list) {
	Node current=list.head;
	while(current!=null) {
		Node temp=current.next;
		while(temp!=null) {
			if(current.data==temp.data)
				return false;
			temp=temp.next;
		}
		current=current.next;
	}
	return true;
}
public static void MoveZerosToEnd(MyLinkedList list) {
	if(list.head==null)
		return;
	Node current=list.head;
	int a=0;
	while(list.head!=null&&list.head.data==0) {
		list.head=current.next;
		current=list.head;
		a++;
	}
	if(list.head==null) {
		for(int i=0;i<a;i++)
			AddFirst(list,0);
		return;
	}
	while(current.next!=null) {
		if(current.next.data==0) {
			current.next=current.next.next;
			a++;
		}
		else current=current.next;
	}
	for(int i=0;i<a;i++)
		AddLast(list,0);
}
public static void SwapNodes(MyLinkedList list,int index1,int index2) {
	if(list.head==null||index1<0||index2<0||index1+1>ListSize(list)||index2+1>ListSize(list))
		return;
	if(index2<index1) {
		int u=index1;
		index1=index2;
		index2=u;
	}
	if(index1==index2)
		return;
	Node current1=list.head;
	Node previous1=null;
	for(int i=0;i<index1;i++) {
		previous1=current1;
		current1=current1.next;
	}
	Node current2=list.head;
	Node previous2=null;
	for(int i=0;i<index2;i++) {
		previous2=current2;
		current2=current2.next;
	}
	if(previous1==null)
		list.head=current2;
	else previous1.next=current2;
	if(current1.next==current2) {
		current1.next=current2.next;
		current2.next=current1;
	}
	else {
		previous2.next=current1;
		Node temp=current1.next;
		current1.next=current2.next;
		current2.next=temp;
	}
}
public static int MiddleNode(MyLinkedList list) {
	if(list.head==null)
		return Integer.MAX_VALUE;
	if(list.head.next==null)
		return list.head.data;
	Node current=list.head;
	int x;
	if(ListSize(list)%2==0) {
		for(int i=0;i<ListSize(list)/2;i++) 
			current=current.next;
		x=current.data;
	}
	else{
		for(int i=0;i<ListSize(list)/2;i++)
			current=current.next;
		x=current.data;
	}
	return x;
}
public static void RemovePeaks(MyLinkedList list) {
	if(list.head==null||list.head.next==null||list.head.next.next==null)
		return;
	Node current=list.head;
	while(current.next.next!=null) {
		if(current.next.data>current.data&&current.next.data>current.next.next.data) {
			current.next=current.next.next;
			current=list.head;
		}
		else current=current.next;
	}
}
public static void RemovePairs(ArrayList<Integer> list,int k) {
	for(int i=0;i<list.size();i++) {
		for(int j=i+1;j<list.size();j++) {
			if(list.get(i)+list.get(j)==k) {
				list.remove(j);
				list.remove(i);
				i--;
				break;
			}
		}
	}
}
}