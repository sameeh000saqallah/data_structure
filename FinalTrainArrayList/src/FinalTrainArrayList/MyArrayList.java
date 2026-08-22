//8. [Hard] Implement your own MyArrayList using a generic array, including add, get, remove,
//size, and contains
package FinalTrainArrayList;

public class MyArrayList<E> {
    private E[] data;
    private int size;
    public MyArrayList() {
        data = (E[]) new Object[10];
        size = 0;
    }
    public int size() {
        return size;
    }
    public E get(int index) {
        return data[index];
    }
    public void add(E e) {
        if (size == data.length) {
            E[] temp = (E[]) new Object[data.length * 2];
            for (int i = 0; i < data.length; i++)
                temp[i] = data[i];
            data = temp;
        }
        data[size++] = e;
    }
    public boolean contains(Object e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return true;
        }
        return false;
    }
    public E remove(int index) {
        E removed = data[index];
        for (int i = index; i < size - 1; i++)
            data[i] = data[i + 1];
        data[--size] = null;
        return removed;
    }
    //10. [Hard] Write a method that rotates an ArrayList to the right by k positions in O(n) time.
    public void rotateRight() {
    	E temp=data[size-1];
    	for(int i=size-1;i>0;i++) {
    		data[i]=data[i-1];
    	}
    	data[0]=temp;
    }
}
