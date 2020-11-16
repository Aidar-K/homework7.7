package com.company;

import java.util.*;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ex = new ArrayList<>();
        ArrayList<String> trusted = new ArrayList<>();
        ArrayList<String> root = new ArrayList<>();


        Comparator<String> comparator = (o1, o2) -> {
            Integer i1 = o1.length();
            Integer i2 = o2.length();
            return i1.compareTo(i2);
        };

        addToCollection(ex, 5);
        printOut(ex);

        Iterator<String> iteratorA = ex.iterator();
        addToCollection(trusted, 5);
        printOut(trusted);

        Iterator<String> iteratorB = trusted.iterator();
        Collections.reverse(trusted);

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            root.add(iteratorA.next());
            root.add(iteratorB.next());
        }
        printOut(root);

        root.sort(comparator);
        printOut(root);

    }

    public static void addToCollection(Collection<String> collection, int quantity) {
        System.out.println("Введите 5 имен: ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < quantity; i++) {
            collection.add(s.nextLine());
        }
        System.out.println("Операция завершена.");

    }

    public static void printOut(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        System.out.println("__________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            try {
                sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("__________________");
    }
}
