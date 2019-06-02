package br.nom.penha.bruno.lambdas;

public class JavaLambdaExample {

    public static void main(String[] args) {
        System.out.println("Iniciando");
        /**
         * Prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1!");
            }
        };

        new Thread(runnable).start();

        // Java 8 Lambda

        // () -> {}Con;

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };


        new Thread(runnableLambda).start();

        new Thread(() -> System.out.println("Inside Runnable 3")).start();
    }
}
