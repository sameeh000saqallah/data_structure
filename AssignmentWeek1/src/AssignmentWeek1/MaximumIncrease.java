package AssignmentWeek1;
import java.util.*;
public class MaximumIncrease {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] x=new int[n];
	for(int i=0;i<n;i++)
		x[i]=in.nextInt();
	in.close();
	int max=1;
	int t=1;
	for(int i=1;i<n;i++) {
		if(x[i]>x[i-1])
			t+=1;
		else t=1;
		if(t>max)
			max=t;
	}
System.out.println(max);
}
}
