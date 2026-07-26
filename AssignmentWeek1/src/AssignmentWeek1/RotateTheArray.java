package AssignmentWeek1;
import java.util.*;
public class RotateTheArray {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	k=k%n;
	int[] x= new int[n];
	int[] y= new int[n];
	for(int i=0;i<n;i++)
		x[i]=in.nextInt();
	in.close();
	if(n==k||k==0) {
		System.out.print(x[0]);
		for(int i=1;i<n;i++)
			System.out.print(" "+x[i]);
		return;
	}
	 for(int i = 0; i < n; i++) 
         y[(i + k) % n] = x[i];
    
	System.out.print(y[0]);
	for(int i=1;i<n;i++)
		System.out.print(" "+y[i]);
}
}
