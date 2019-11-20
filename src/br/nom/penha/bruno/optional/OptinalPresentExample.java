package br.nom.penha.bruno.optional;

import br.nom.penha.bruno.data.Student;

import java.util.Optional;

public class OptinalPresentExample {

    public static void main(String[] args) {
        // idPresent
        Optional<String> optionalString = Optional.ofNullable("Ola Optional");
        System.out.println(optionalString.isPresent());

        if(optionalString.isPresent()){
            System.out.println(optionalString.get());
        }

        // ifPresent

        optionalString.ifPresent( s -> System.out.println(s));
    }
}
