package dev.marcos.edlist12.core;

public class Node<T> {

    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}