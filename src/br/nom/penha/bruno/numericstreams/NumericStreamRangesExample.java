package br.nom.penha.bruno.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1,50);
        System.out.println(intStream.count());

        IntStream.range(1,50).forEach(value -> System.out.print(value + ","));

        System.out.println("\n*******");

        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ","));

        System.out.println("\n*******");

        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ","));

        System.out.println("\n*******");

        LongStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value + ","));


    }
}
