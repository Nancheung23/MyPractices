import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class e04 {
    public static void main(String[] args) {

    }
}

class MyArrayList <E> implements List {
    private static final int DEFAULT_LENGTH = 10;
    private static final int TRESHOLD = 6;
    private static final Object[] INITARRAY = {};
    private Object[] elementData;

    public MyArrayList() {
        this.elementData = INITARRAY;
    }

    public MyArrayList (int size){
        if (size < 0) {
            throw new IllegalArgumentException("Can't create MyArrayList", "Invalid input size.");
        } else {
            if (size == 0) {
                this.elementData = INITARRAY;
            } else if (size <= 10 && size > 0) {
                this.elementData = new Object[DEFAULT_LENGTH];
            } 
            else {
                int beyond = (size - DEFAULT_LENGTH) % 6;
                int containLoops = ((size - beyond) / TRESHOLD) + 1;
                this.elementData = new Object[containLoops * DEFAULT_LENGTH];
            }
        }
    }

    public MyArrayList (Collection <? extends E> input) {
        Object[] arr = input.toArray();
        size = arr.length;
        if (size != 0) {
            if (input.getClass.equals(arr.getClass())) {
                this.elementData = arr;
            } else {
                this.elementData = Arrays.copyOf(input, DEFAULT_LENGTH, Object[size]);
            }
        } else {
            this.elementData = INITARRAY;
        }
    }

    public int size() {
        return this.elementData.length;
    }

    public void addItem(E item) {
        if (item != null) {
            if (item.getClass().equals(this.elementData.getClass())) {
                int length = this.elementData.length;
                this.elementData = Arrays.copyOf(this.elementData, length + 1);
                this.elementData[length] = item;
                // need to write grow();
            } else {
                throw new IllegalArgumentException("Need to be same type as element in ArrayList", "Input Error");
            }
        } else {
            throw new NullPointerException("Need input item", "Input Error");
        }
    }

    public E get(int index) {
        Object.checkIndex(index,size());
        return (E) elementData[index];
    };
}