package br.nom.penha.bruno.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10) //int
                .boxed() // Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> listaInteiros){
        // wrapper -> primitive
        return listaInteiros.stream()
                .mapToInt(Integer::intValue) // Wrapper valores inteiros
                .sum();

    }

    public static void main(String[] args) {

        System.out.println("Boxing: " + boxing());

        System.out.println("********");

        System.out.println("Unboxing: " + unBoxing(boxing()));

    }
}
