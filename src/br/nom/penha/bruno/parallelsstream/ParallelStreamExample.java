package br.nom.penha.bruno.parallelsstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {



    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes){
        final long startTime = System.currentTimeMillis();
        for (int i=0; i<numberOfTimes;i++){
            supplier.get();
        }
        final long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public static int sumSequencialStream(){
        return IntStream.rangeClosed(1,100000)
                .sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,100000)
                .parallel() // Split the data in to multiple parts
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("We have " + Runtime.getRuntime().availableProcessors() + " cores");

        System.out.println("Sequential result: " + checkPerformanceResult(ParallelStreamExample::sumSequencialStream,20)+ "ms");
        System.out.println("Parallel   result: " + checkPerformanceResult(ParallelStreamExample::sumParallelStream,20) + "ms");
    }
}
