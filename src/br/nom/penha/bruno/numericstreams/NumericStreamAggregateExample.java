package br.nom.penha.bruno.numericstreams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int soma = IntStream.rangeClosed(1,50).sum();

        System.out.println("Soma eh: "+ soma);

        OptionalInt optionalInt = IntStream.rangeClosed(1,50).max();

        System.out.println("O valor maximo eh : " + (optionalInt.isPresent() ? optionalInt.getAsInt() : 0));
        System.out.println("O valor maximo eh: " + optionalInt);

        OptionalLong optionalLong = LongStream.rangeClosed(50,100).min();
        System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);

        OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0.0);

    }
}
