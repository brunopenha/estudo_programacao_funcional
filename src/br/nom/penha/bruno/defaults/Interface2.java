package br.nom.penha.bruno.defaults;

public interface Interface2 extends Interface1 {

    default void methodB(){
        System.out.println("method b ");
    }

    default void methodA(){
        System.out.println("method a " + Interface2.class);
    }
}
