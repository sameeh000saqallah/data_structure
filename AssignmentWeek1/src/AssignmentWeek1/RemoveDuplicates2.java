package AssignmentWeek1;
import java.util.*;
public class RemoveDuplicates2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n= in.nextInt();

	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i=0;i<n;i++) 
		list.add(in.nextInt());
	in.close();
	System.out.print(list.get(0));
	
	for(int i=1;i<n;i++)
		if (!list.get(i).equals(list.get(i - 1))) {
			System.out.print(" "+list.get(i));}
}
}
