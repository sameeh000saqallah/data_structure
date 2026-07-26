package AssignmentWeek1;
import java.util.*;
public class CheckIfTheArrayIsAPalindrome2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	int n = in.nextInt();
	for(int i=0;i<n;i++) 
		list.add(in.nextInt());
	in.close();
	for(int i=0;i<n;i++)
		list2.add(list.get(n-1-i));
	boolean e=true;
	for(int i=0;i<n;i++) 
		if(list.get(i)!=list2.get(i)) {
			e=false;
			System.out.println("NO");
			return;
		}
	if(e==true)
		System.out.println("YES");
	
		
}
}
