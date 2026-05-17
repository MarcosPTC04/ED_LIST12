package dev.marcos.edlist12.core;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {

    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public void addFirst(T value) {

        Node<T> newNode = new Node<>(value);

        newNode.next = head;

        head = newNode;

        size++;
    }

    @Override
    public void addLast(T value) {

        Node<T> newNode = new Node<>(value);

        if (head == null) {

            head = newNode;

        } else {

            Node<T> current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    @Override
    public boolean remove(T value) {

        if (head == null) {
            return false;
        }

        if (head.value.equals(value)) {

            head = head.next;

            size--;

            return true;
        }

        Node<T> current = head;

        while (current.next != null) {

            if (current.next.value.equals(value)) {

                current.next = current.next.next;

                size--;

                return true;
            }

            current = current.next;
        }

        return false;
    }

    @Override
    public T removeFirst() {

        if (head == null) {
            return null;
        }

        T removed = head.value;

        head = head.next;

        size--;

        return removed;
    }

    @Override
    public T removeLast() {

        if (head == null) {
            return null;
        }

        if (head.next == null) {

            T removed = head.value;

            head = null;

            size--;

            return removed;
        }

        Node<T> current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        T removed = current.next.value;

        current.next = null;

        size--;

        return removed;
    }

    @Override
    public boolean contains(T value) {

        Node<T> current = head;

        while (current != null) {

            if (current.value.equals(value)) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    @Override
    public T get(int index) {

        if (index < 0 || index >= size) {
            return null;
        }

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void sort() {

        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;

        do {

            swapped = false;

            Node<T> current = head;

            while (current.next != null) {

                if (current.value.compareTo(current.next.value) > 0) {

                    T temp = current.value;
                    current.value = current.next.value;
                    current.next.value = temp;

                    swapped = true;
                }

                current = current.next;
            }

        } while (swapped);
    }
}
