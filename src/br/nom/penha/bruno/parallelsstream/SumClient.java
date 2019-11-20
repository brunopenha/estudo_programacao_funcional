package br.nom.penha.bruno.parallelsstream;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                // 1, 2, 3, ... , 10000
                .parallel() // before parallel 500500
                .forEach(sum::performSum);

        System.out.println("Total : " + sum.getTotal());
    }
}
