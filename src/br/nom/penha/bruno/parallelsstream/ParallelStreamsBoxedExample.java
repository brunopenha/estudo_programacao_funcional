package br.nom.penha.bruno.parallelsstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamsBoxedExample {

    public static int sequentialSum(List<Integer> listInteger){

        final long start = System.currentTimeMillis();

        int sum = listInteger
                .stream()
                .reduce(0,(x,y) -> x+y);

        final long end = System.currentTimeMillis();
        System.out.println("Duration Sequential: " + (end - start));

        return sum;
    }

    public static int parallelSum(List<Integer> listInteger){

        final long start = System.currentTimeMillis();
        int sum = listInteger
                .stream()
                .parallel()
                .reduce(0,(x,y) -> x+y); // perform the unboxing from Integer to int

        final long end = System.currentTimeMillis();
        System.out.println("Duration Parallel: " + (end - start));

        return sum;
    }

    public static void main(String[] args) {

        final long start = System.currentTimeMillis();
        List<Integer> integerList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(Collectors.toList());

        sequentialSum(integerList);
        parallelSum(integerList);

    }
}
