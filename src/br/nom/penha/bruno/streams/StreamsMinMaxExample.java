package br.nom.penha.bruno.streams;

import java.util.*;

public class StreamsMinMaxExample {

    public static int encontreValorMax(List<Integer> listaInteiros){
        return listaInteiros.stream().reduce(0,(x,y) -> x>y ? x : y); // x começa com 0 (identidade) e depois é comparado com y
    }

    public static Optional<Integer> encontreValorMaxOptinal(List<Integer> listaInteiros){
        return listaInteiros.stream().reduce((x,y) -> x>y ? x : y); // x começa com 0 (identidade) e depois é comparado com y
    }

    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        System.out.println("valor maximo: " + encontreValorMax(integerList));

        System.out.println("valor maximo: " + encontreValorMax(new ArrayList<>())); // Porem zero não faz parte da lista

        Optional<Integer> max = encontreValorMaxOptinal(new ArrayList<>());
        System.out.println("max : " + max);
        if(max.isPresent()){
            System.out.println("valor maximo: " +  max.get()); //
        }else{
            System.out.println("Valor não encontrado");
        }

        max = encontreValorMaxOptinal(integerList);
        System.out.println("max : " + max);
        if(max.isPresent()){
            System.out.println("valor maximo: " +  max.get()); //
        }else{
            System.out.println("Valor não encontrado");
        }

    }
}
