package AssignmentWeek1;
import java.util.*;
public class RotateTheArray2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	k=k%n;
	ArrayList<Integer> list=new ArrayList<Integer>();
	ArrayList<Integer> list1=new ArrayList<Integer>();
	for(int i=0;i<n;i++)
		list.add(in.nextInt());
	in.close();
	if(n==k||k==0) {
		System.out.print(list.get(0));
		for(int i=1;i<n;i++)
			System.out.print(" "+list.get(i));
		return;
	}
	for(int i=0;i<n;i++)
		list1.add(0);
	for(int i = 0; i < n; i++) {
		int w=(i+k)%n;
		list1.set(w,list.get(i));
	}
	
	System.out.print(list1.get(0));
	for(int i=1;i<n;i++)
		System.out.print(" "+list1.get(i));
		
		
}
}
