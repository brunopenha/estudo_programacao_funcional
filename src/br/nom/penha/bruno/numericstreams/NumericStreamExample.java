package br.nom.penha.bruno.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {


    public static int somaDeEneNumeros(List<Integer> listaInteiros){
        return listaInteiros.stream().reduce(0, (x,y) -> x + y);
    }

    public static int somaDeNumerosIntStream(){
        return IntStream.rangeClosed(1,6) // 1,2,3,4,5,6
                // 1
                // 2
                // 3
                // 4
                // 5
                //6
                 .sum();
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println("A soma dos N numeros eh: " + somaDeEneNumeros(integerList));

        System.out.println("A soma dos N numeros usando IntStream eh: " + somaDeNumerosIntStream());
    }
}
