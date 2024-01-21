import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class e04 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.forEach(s -> System.out.println(s));
        System.out.println(list.remove(1));
        System.out.println(list.toString());

    }
}

class MyArrayList<E> {
    private Object[] elementData = {};
    private int size;
    private static final int DEDFAULT_CAPACITY = 10;

    public boolean add(E e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size++] = e;
        return true;
    }

    public void grow() {
        if (size == 0) {
            elementData = new Object[DEDFAULT_CAPACITY];
        } else {
            // elementData = Arrays.copyOf(elementData, elementData.length + elementData >>
            // 1);
            elementData = Arrays.copyOf(elementData, (int) (elementData.length * 1.5));
        }
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elementData[index];
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index + " Out of max length " + size);
        }
    }

    public E remove(int index) {
        checkIndex(index);
        int moveFlag = size - index - 1;
        E item = (E) elementData[index];
        if (moveFlag != 0) {
            // System.arraycopy(origin, copy start from, to result, where to copy, how many
            // items need copy)
            System.arraycopy(elementData, index + 1, elementData, index, moveFlag);
        }
        elementData[--size] = null;
        return item;
    }

    public int size() {
        return size;
    }

    public void forEach(MyConsumer<E> action) {
        // if (action == null) {
        // throw new NullPointerException();
        // }
        Objects.requireNonNull(action);
        for (int i = 0; i < size; i++) {
            action.accept((E) elementData[i]);
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < size; i++) {
            E e = (E)elementData[i];
            s.append(e).append(i == size - 1 ? "]" : ",");
        }
        return s.toString();
    }
}

/**
 * MyConsumer
 */
@FunctionalInterface
interface MyConsumer<E> {
    void accept(E e);
}