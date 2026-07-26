package AssignmentWeek1;
import java.util.*;

public class  MaximumValue{
public static void main (String[] args) {
Scanner in = new Scanner(System.in);
int N = in.nextInt();
int[] x= new int[N];
int max = -1000;

for(int i = 0 ; i < N ; i++)
{

	x[i] = in.nextInt();
	if(x[i] > max)
		max = x[i];
}
System.out.println(max);
in.close();
}

}
