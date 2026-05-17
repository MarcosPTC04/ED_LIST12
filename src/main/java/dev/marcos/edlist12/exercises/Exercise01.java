package dev.marcos.edlist12.exercises;

import dev.marcos.edlist12.core.MyLinkedList;

public class Exercise01 {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
