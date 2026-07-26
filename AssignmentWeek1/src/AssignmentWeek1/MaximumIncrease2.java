package AssignmentWeek1;
import java.util.*;
public class MaximumIncrease2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	ArrayList<Integer> list =new ArrayList<Integer>();
	for(int i=0;i<n;i++)
		list.add(in.nextInt());
	in.close();
	int max=1;
	int t=1;
	for(int i=1;i<n;i++) {
		if(list.get(i)>list.get(i-1))
			t+=1;
		else t=1;
		if (t>max)
			max=t;
	}
	System.out.println(max);
}
}
