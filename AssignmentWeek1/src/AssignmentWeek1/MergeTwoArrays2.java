package AssignmentWeek1;
import java.util.*;
public class MergeTwoArrays2 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int n1=in.nextInt();
	ArrayList<Integer> list1= new ArrayList<Integer>();
	for(int i=0;i<n1;i++)
		list1.add(in.nextInt());
	int n2=in.nextInt();
	ArrayList<Integer> list2= new ArrayList<Integer>();
	for(int i=0;i<n2;i++)
		list2.add(in.nextInt());
	int n=n1+n2;
	in.close();
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<n1;i++)
		list.add(list1.get(i));
	for(int i=0;i<n2;i++)
		list.add(list2.get(i));
	System.out.print(list.get(0));
	for(int i=1;i<n;i++)
		System.out.print(" "+list.get(i));
}
}
