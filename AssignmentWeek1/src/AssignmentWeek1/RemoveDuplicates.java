package AssignmentWeek1;
import java.util.*;
public class RemoveDuplicates {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[]x=new int[n];
	for(int i=0;i<n;i++)
		x[i]=in.nextInt();
	in.close();
	if(n>0)
		System.out.print(x[0]);
	for(int i=1;i<n;i++)
    	if(x[i]!=x[i-1])
    		System.out.print(" "+x[i]);
			
}
}
