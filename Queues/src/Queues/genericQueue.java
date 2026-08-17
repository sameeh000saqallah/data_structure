package Queues;
import java.util.LinkedList;

public class genericQueue<E> {
	private LinkedList<E> list=new LinkedList<E>();
	public void enqueue(E e) {
		list.add(e);
	}
	public E dequeue() {
		return list.removeFirst();
	}
	public int getSize() {
		return list.size();
	}
	public String toString() {
		return "Queue: "+list.toString();
	}
}
