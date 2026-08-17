package MyArrayList;
import  java.util.*;
public class main {
	public static void main(String[] args) {
		ArrayList<String> t=new ArrayList<String>();
		t.add("cat");
		t.add("act");
		t.add("tac");
		t.add("lama");
		t.add("car");
		t.add("racam");
		t.add("macar");
		ArrayList<String> las=star(t);
		System.out.println(las.toString());
		
	}
	public static ArrayList<String> star(ArrayList<String> list) {
		prime(list);
		for(int i=0;i<list.size();i++) {
			if(!deagram(list,i)) {
				list.remove(i);
				i--;
			}
		}
		sort(list);
		return list;
	}
	public static ArrayList<String> prime(ArrayList<String> s) {
		for(int i=0;i<s.size();i++) {
			if(s.get(i).length()%2==0) {
				s.remove(i);
				i--;
				continue;
			}
		}
		return s;
	}
	public static  boolean deagram(ArrayList<String> s,int x) {
		for(int i=0;i<s.size();i++) {
			if (i==x||s.get(x).length()!=s.get(i).length())
				continue;
			boolean test=true;
			int[] count=new int[300];
  		  for (int k = 0; k < s.get(x).length(); k++) {
				  count[s.get(x).charAt(k)]++;
				  count[s.get(i).charAt(k)]--;
			    }
		    for (int k = 0; k < count.length; k++) {
		        if (count[k] != 0)
		            test=false;
		    }
		    if(test)
		    	return true;
			}
		return false;
	}
	public static ArrayList<String> sort(ArrayList<String> s){
		for(int i=1;i<s.size();i++) {
			if (s.get(i).length()<s.get(i-1).length()) {
				String swap=s.get(i);
				s.set(i,s.get(i-1));
				s.set(i-1, swap);
				i=0;
			}
		}
		return s;
	}
}