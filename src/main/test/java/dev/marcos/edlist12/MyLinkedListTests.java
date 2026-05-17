package dev.marcos.edlist12;

import dev.marcos.edlist12.core.MyLinkedList;

public class MyLinkedListTests {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        System.out.println("Lista vazia? " + list.isEmpty());

        list.addFirst(10);

        list.addLast(30);

        list.addLast(20);

        System.out.println("Tamanho: " + list.size());

        System.out.println("Elemento índice 0: " + list.get(0));
        System.out.println("Elemento índice 1: " + list.get(1));
        System.out.println("Elemento índice 2: " + list.get(2));

        System.out.println("Contém 20? " + list.contains(20));

        System.out.println("Contém 100? " + list.contains(100));

        System.out.println("\nLista antes da ordenação:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.sort();

        System.out.println("\nLista após ordenação:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(20);

        System.out.println("\nApós remover 20:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.removeFirst();

        System.out.println("\nApós removeFirst:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.removeLast();

        System.out.println("\nApós removeLast:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nLista vazia? " + list.isEmpty());
    }
}
