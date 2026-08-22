package FinalTrainArrayList;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		//1. [Easy] Create an ArrayList, add 10 numbers, and print all elements.
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println(list.toString());
		//2. [Easy] Write code to find the maximum and minimum value in an ArrayList.
		int max=list.get(0);
		for(int i=0;i<list.size();i++) {
			if(max<list.get(i))
				max=list.get(i);
		}
		int min=list.get(0);
		for(int i=0;i<list.size();i++) {
			if(max>list.get(i))
				min=list.get(i);
		}
		System.out.println("max value : "+max);
		System.out.println("min value : "+min);
		//3. [Easy] Remove all occurrences of a given value from an ArrayList.
		int n =5;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==n) {
				list.remove(i);
				i--;
			}
		}
		//4. [Easy] Insert an element at a specific index and explain what happens to the other elements.
		// all element after this index +1
		n=6;
		list.add(n,5);
	}
	//5. [Medium] Write a method that reverses an ArrayList without using Collections.reverse().
	public static ArrayList<Integer> reverse(ArrayList<Integer> list1){
		ArrayList<Integer> list2=new ArrayList<Integer>();
		for (int i=list1.size()-1;i>=0;i--)
			list2.set(list1.size()-i+1,list1.get(i));
		return list2;
	}
	//6. [Medium] Remove duplicate elements from an ArrayList while preserving their original order.
	public static void removeDublecates(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					list.remove(j);
					i--;
				}
			}
		}
	}
	//7. [Medium] Merge two sorted ArrayLists into one sorted ArrayList.
	public static ArrayList<Integer> Merge(ArrayList<Integer> list1,ArrayList<Integer> list2){
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0,j=0;i<list1.size()||j<list2.size();) {
			if(list1.get(i)>=list2.get(j)) {
				list.add(list1.get(i));
				i++;
			}
			else {
				list.add(list2.get(j));
				j++;
			}
		}
		return list;
	}
	//9. [Hard] Analyze the time complexity of add, get, remove, and contains for ArrayList.
	//get : O(1) | add : O(n) | remove : O(n) | contains : O(n).
}
