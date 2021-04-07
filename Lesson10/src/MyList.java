import java.util.*;

public class MyList<T> extends AbstractList<T> {

    private T[] innerArray;
    private int size;

    @Override
    public T get(int index) {
        if (index > innerArray.length - 1) {
            throw new IndexOutOfBoundsException(index);
        }

        return innerArray[index];
    }

    @Override
    public int size() {
        return size;
    }

    public MyList() {
        innerArray = (T[])(new Object[10]);
    }

    public MyList(int capacity) {
        innerArray = (T[])(new Object[capacity]);
    }

    @Override
    public boolean add(T t) {
        return super.add(t);
    }

    @Override
    public T set(int index, T element) {
        innerArray[index] = element;
        return element;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return super.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return super.lastIndexOf(o);
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return super.addAll(index, c);
    }

    @Override
    public Iterator<T> iterator() {
        return super.iterator();
    }

    @Override
    public ListIterator<T> listIterator() {
        return super.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return super.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return super.subList(fromIndex, toIndex);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
       return super.hashCode();
    }

    @Override
    public void removeRange(int fromIndex, int toIndex) {
        super.removeRange(fromIndex, toIndex);
    }
}
