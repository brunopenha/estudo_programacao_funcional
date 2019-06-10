package br.nom.penha.bruno.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Joao");
        names.add("Jose");
        names.add("Maria");

        names.remove(0);

        System.out.println(names);

        for (String name :
                names) {
            System.out.println(name);
        }


        Stream<String> nameStream = names.stream();

        nameStream.forEach(System.out::println);
    }
}
