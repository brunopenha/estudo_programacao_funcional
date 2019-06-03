package br.nom.penha.bruno.funcionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predicate = (i) -> {return i%2==0;};
    static Predicate<Integer> predicate1 = (i) -> i%2==0;
    static Predicate<Integer> predicate2 = (i) -> i%5==0;

    public static void predicateAnd(){
        System.out.println("Predicate and Result is: " + predicate1.and(predicate2).test(10));

        System.out.println("Predicate and Result is: " + predicate1.and(predicate2).test(9));

    }

    public static void predicateOr(){
        System.out.println("Predicate or Result is: " + predicate1.or(predicate2).test(10));

        System.out.println("Predicate or Result is: " + predicate1.or(predicate2).test(8));

    }

    public static void predicateNegative(){
        System.out.println("Predicate Negative Result is: " + predicate1.negate().test(10));

    }

    public static void main(String[] args) {

        System.out.println(predicate.test(4));

        System.out.println(predicate2.test(4));

        predicateAnd();
        predicateOr();
        predicateNegative();
    }
}
