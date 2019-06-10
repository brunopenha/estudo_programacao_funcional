package br.nom.penha.bruno.methodreferences;

import java.util.function.Function;

public class FuncionMethodReferenceExample {

    static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();

    static Function<String, String> toUpperCaseMethodReference = String::toUpperCase; // Selecione a expressão em Lambda e pressione ALT + ENTER

    public static void main(String[] args) {

        System.out.println(toUpperCaseLambda.apply("java8"));
        System.out.println("***************");
        System.out.println(toUpperCaseMethodReference.apply("java8"));

    }
}
