package stack;

public class main {
public static void main(String[] args) {
	genericStack<String> ss=new genericStack<String>();
	ss.push("sameeh");
	ss.push("fawzi");
	System.out.println(ss.toString());
}
public static genericStack Reverse(genericStack<Integer> s) {
	genericStack<Integer> r=new genericStack();
	while(!s.isEmpty())
		r.push(s.pop());
	return r;
}
public static genericStack ReverseC(genericStack<Character> s) {
	genericStack<Character> r=new genericStack();
	while(!s.isEmpty())
		r.push(s.pop());
	return r;
}
public static void reverse(genericStack<Integer> s) {
    if (s.isEmpty()) {
        return;
    }
    int x = s.pop();
    reverse(s);
    insertAtBottom(s, x);
}
public static void insertAtBottom(genericStack<Integer> s, int x) {
    if (s.isEmpty()) {
        s.push(x);
        return;
    }
    int temp = s.pop();
    insertAtBottom(s, x);
    s.push(temp);
}
public static void Sort(genericStack<Integer> s) {
	genericStack<Integer> temp = new genericStack<>();
    while (!s.isEmpty()) {
        int x = s.pop();
        while (!temp.isEmpty() && temp.peek() > x)
            s.push(temp.pop());
        temp.push(x);
    }
    while (!temp.isEmpty())
        s.push(temp.pop());
}
public static void sort(genericStack<Integer> s) {
    if (!s.isEmpty()) {
        int x = s.pop();
        sort(s);
        insertSorted(s, x);
    }
}
private static void insertSorted(genericStack<Integer> s, int x) {
    if (s.isEmpty() || s.peek() <= x) {
        s.push(x);
        return;
    }
    int temp = s.pop();
    insertSorted(s, x);
    s.push(temp);
}
public static boolean  IsPalindrome(String s) {
	genericStack<Character> c=new genericStack<>();
	for(int i=0;i<s.length();i++)
		c.push(s.charAt(i));
	genericStack<Character> z=ReverseC(c);
	while(!z.isEmpty()||!c.isEmpty())
		if(c.pop()!=z.pop())
			return false;
	return true;
}
public static boolean  isPalindrome(String s) {
	genericStack<Character> c=new genericStack<>();
	for(int i=0;i<s.length();i++)
		c.push(s.charAt(i));
	for(int i=0;i<s.length();i++)
		if(c.pop()!=s.charAt(i)) 
			return false;
	return true;
}
}