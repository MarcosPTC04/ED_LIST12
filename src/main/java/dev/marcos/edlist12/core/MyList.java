package dev.marcos.edlist12.core;

public interface MyList<T> {

    void addFirst(T value);

    void addLast(T value);

    boolean remove(T value);

    T removeFirst();

    T removeLast();

    boolean contains(T value);

    T get(int index);

    int size();

    boolean isEmpty();

    void sort();
}