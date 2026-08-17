package MyArrayList;
import java.util.ArrayList;
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

    public boolean isEmpty() {
        return size == 0;
    }

    public E get(int index) {
        return data[index];
    }

    public E set(int index, E e) {
        E old = data[index];
        data[index] = e;
        return old;
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

    public void add(int index, E e) {

        if (size == data.length) {
            E[] temp = (E[]) new Object[data.length * 2];

            for (int i = 0; i < data.length; i++)
                temp[i] = data[i];

            data = temp;
        }

        for (int i = size; i > index; i--)
            data[i] = data[i - 1];

        data[index] = e;
        size++;
    }

    public E remove(int index) {

        E removed = data[index];

        for (int i = index; i < size - 1; i++)
            data[i] = data[i + 1];

        data[--size] = null;

        return removed;
    }

    public boolean contains(Object e) {

        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return true;
        }

        return false;
    }

    public int indexOf(Object e) {

        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }

        return -1;
    }

    public void clear() {

        for (int i = 0; i < size; i++)
            data[i] = null;

        size = 0;
    }
    public boolean containsAll(ArrayList list) {

        for (int i = 0; i < list.size(); i++) {

            Object item = list.get(i);
            boolean found = false;

            for (int j = 0; j < size; j++) {

                if (data[j].equals(item)) {
                    found = true;
                    break;
                }

            }

            if (!found)
                return false;
        }

        return true;
    }
    public boolean retainAll(Object[] arr) {

        int deleted = 0;

        for (int i = 0; i < size; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {

                if (data[i].equals(arr[j])) {
                    found = true;
                    break;
                }

            }

            if (!found) {

                for (int k = i; k < size - 1; k++)
                    data[k] = data[k + 1];

                size--;
                deleted++;
                i--;
            }

        }

        return deleted > 0;
    }
}