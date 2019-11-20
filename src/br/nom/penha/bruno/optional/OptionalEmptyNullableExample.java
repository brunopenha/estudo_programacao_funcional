package br.nom.penha.bruno.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEmptyNullableExample {

    public static Optional<String> ofNullable(){
        Optional<String> stringOptional = Optional.ofNullable(null);
        //Optional<String> stringOptional = Optional.ofNullable("Ola");

        return stringOptional;
    }

    public static Optional<String> of(){
        Optional<String> stringOptional = Optional.of("Hello");
        //Optional<String> stringOptional = Optional.of(null);

        return stringOptional;
    }

    public static Optional<String> empty(){

        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println("***********");
        System.out.println(ofNullable());
        System.out.println("***********");
        System.out.println(of());
        System.out.println("***********");
        System.out.println(empty());
    }
}
