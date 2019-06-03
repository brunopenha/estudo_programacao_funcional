package br.nom.penha.bruno.funcionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unary = (s) -> s.concat(" Default");
    public static void main(String[] args) {

        System.out.println(unary.apply("java8"));
    }
}
