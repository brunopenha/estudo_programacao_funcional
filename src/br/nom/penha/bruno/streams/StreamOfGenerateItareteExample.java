package br.nom.penha.bruno.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateItareteExample {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Adam", "dan", "julie");

        stringStream.forEach(System.out::println);

        Stream.iterate(1, x-> x * 2)
                .limit(11)
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;

        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
