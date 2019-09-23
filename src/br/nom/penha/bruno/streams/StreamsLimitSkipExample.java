package br.nom.penha.bruno.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {


    public static Optional<Integer> limite(List<Integer> inteiros){
        return inteiros.stream()
                .limit(3) // ira restringir apenas os tres primeiros 6,7,8
                .reduce((x,y) -> x + y);
    }

    public static Optional<Integer> pula(List<Integer> inteiros){
        return inteiros.stream()
                .skip(3) // ira pular os tres primeiros
                .reduce((x,y) -> x + y);
    }

    public static void main(String[] args) {

        List<Integer> listaIntegers = Arrays.asList(6,7,8,9,10);

        Optional<Integer> limite = limite(listaIntegers);
        if(limite.isPresent()){
            System.out.println("Limite " + limite.get());
        }else{
            System.out.println("Não ha valores");
        }

        Optional<Integer> pula = pula(listaIntegers);
        if(pula.isPresent()){
            System.out.println("Pulou " + pula.get());
        }else{
            System.out.println("Não ha valores");
        }
    }
}
