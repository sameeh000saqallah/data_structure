package AssignmentWeek1;
import java.util.*;
 public class MaximumValue2 {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	Scanner in = new Scanner(System.in);
	int n= in.nextInt();
	int max= -1000;
	
	if (n<1||n>100) {
		System.out.println("Error: The array size must be between 1 and 100.");
		return;
	}
	for(int i=0;i<n;i++) {
		list.add(in.nextInt());
		if(list.get(i)<-1000||list.get(i)>1000) {
			System.out.println("Error: The entered value must be between -1000 and 1000.");
			return;
		}
	}
	for(int i=0;i<n;i++) {
		if(list.get(i)>max)
			max=list.get(i);
	}
System.out.println(max);
in.close();
}
}
 
