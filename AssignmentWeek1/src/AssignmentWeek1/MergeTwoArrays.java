package AssignmentWeek1;
import java.util.*;
public class MergeTwoArrays {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n1 = in.nextInt();
	int[] x1=new int[n1];
	for(int i=0;i<n1;i++)
		x1[i]=in.nextInt();
	int n2 = in.nextInt();
	int[] x2=new int[n2];
	for(int i=0;i<n2;i++)
		x2[i]=in.nextInt();
	in.close();
	int n = n1+n2;
	int[] x=new int[n];
	for(int i=0;i<n1;i++)
		x[i]=x1[i];
	for (int i=n1;i<n;i++)
		x[i]=x2[i-n1];
	System.out.print(x[0]);
	for(int i=1;i<n;i++)
		System.out.print(" "+x[i]);
		
}
}
