package AssignmentWeek1;
import java .util.*;
public class CheckIfTheArrayIsAPalindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x= new int[n];
		int[] y= new int[n];
		for (int i=0;i<n;i++) 
			x[i]=in.nextInt();
		in.close();
		for(int i=0;i<n;i++) 
		    y[i]=x[n-1-i];
		boolean e=true;
		for (int i=0;i<n;i++)
			if(x[i]!=y[i]) {
				e = false;
				System.out.println("NO");
				return;
			}
        if(e==true)
        	System.out.println("YES");
}
}