package br.nom.penha.bruno.defaults;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();

        List<Integer> integerList = Arrays.asList(1,3,5);

        System.out.println("Result is: " + multiplier.multiply(integerList));

        System.out.println("Size is: " + multiplier.size(integerList));

        System.out.println("Is empty: " + Multiplier.isEmpty(integerList));

        System.out.println("Is empty: " + Multiplier.isEmpty(new ArrayList<>()));

    }
}
