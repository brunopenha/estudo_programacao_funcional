package br.nom.penha.bruno.streams;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyEstudante(double nota){
        // adam, jenny, emily
        return StudentDataBase.getAllStudents().stream()
                .filter( estudante -> estudante.getGpa() >= nota )
                .findAny();
    }

    public static Optional<Student> findFirstEstudante(double nota){
        // adam, jenny, emily
        return StudentDataBase.getAllStudents().stream()
                .filter( estudante -> estudante.getGpa() >= nota )
                .findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> estudante = findAnyEstudante(3.9);

        if(estudante.isPresent()){
            System.out.println("Estudante encontrado " + estudante.get());
        }else{
            System.out.println("Nimguem foi encontrado");
        }

        estudante = findFirstEstudante(3.9);

        if(estudante.isPresent()){
            System.out.println("Estudante encontrado " + estudante.get());
        }else{
            System.out.println("Nimguem foi encontrado");
        }
    }
}
