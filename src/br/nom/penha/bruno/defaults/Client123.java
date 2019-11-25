package br.nom.penha.bruno.defaults;

public class Client123 implements Interface1, Interface2, Interface3 {

    public void methodA(){
        System.out.println("method a: " + Client123.class);
    }

    public static void main(String[] args) {
        Client123 client123 = new Client123();

        // 1 -> class that implements the interface
        // 2 -> the sub interface that extends the interface

        client123.methodA(); // always will resolve to child implementation
        client123.methodB();
        client123.methodC();
    }
}
