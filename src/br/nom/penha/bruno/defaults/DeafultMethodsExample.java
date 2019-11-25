package br.nom.penha.bruno.defaults;

import java.util.*;

public class DeafultMethodsExample {

    public static void main(String[] args) {
        /**
         * Lista os nomes na ordem alfabetica
         */
        List<String> stringList = Arrays.asList("Bruno", "Penha", "Joao", "Jose", "Mameluco");

        /**
         * Antes do Java 8
         */
//        Collections.sort(stringList);

        System.out.println("Using Collections:  " + stringList);

        /**
         * A partir do Java 8
         */
        stringList.sort(Comparator.naturalOrder());

        System.out.println("Using Streams:  " + stringList);

        stringList.sort(Comparator.reverseOrder());

        System.out.println("Using Streams:  " + stringList);

    }
}
