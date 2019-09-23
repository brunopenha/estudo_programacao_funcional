package br.nom.penha.bruno.streams;

import br.nom.penha.bruno.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch(double valor){

        return StudentDataBase.getAllStudents().stream()
                .allMatch(estudante -> estudante.getGpa() >= valor);
    }

    public static boolean anyMatch(double valor){

        return StudentDataBase.getAllStudents().stream()
                .anyMatch(estudante -> estudante.getGpa() >= valor);
    }

    public static boolean noneMatch(double valor){

        return StudentDataBase.getAllStudents().stream()
                .noneMatch(estudante -> estudante.getGpa() >= valor);
    }


    public static void main(String[] args) {

        System.out.println("Resultado da combinacao:" + allMatch(3.9) ); // Nem todos os estudantes tem media maior 3.9
        System.out.println("Resultado da combinacao:" + allMatch(3.5) );


        System.out.println("Resultado da combinacao:" + anyMatch(4.0) );// Algum estudante tem media maior 4.0
        System.out.println("Resultado da combinacao:" + anyMatch(4.1) );// Nenhum estudante tem media maior 4.1

        System.out.println("Resultado da combinacao:" + noneMatch(4.0) );// Tem estudantes que não tem media maior 4.0
        System.out.println("Resultado da combinacao:" + noneMatch(4.1) );// Tem estudantes que não tem media maior 4.1



    }
}

