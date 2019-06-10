package br.nom.penha.bruno.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {

        // Variavel local
        int i = 0; // Nao pode usar a mesma variavel nesse escopo

        Consumer<Integer> c1 = (value) -> System.out.println("O valor eh: " + i);

        c1.accept(5);
    }
}
