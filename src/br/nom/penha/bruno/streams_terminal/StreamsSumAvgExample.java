package br.nom.penha.bruno.streams_terminal;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    public static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNotebooks));
    }

    public static double avg(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNotebooks));
    }

    public static void main(String[] args) {

        System.out.println("Summing: " + sum());
        System.out.println("Averaging : " + avg());


    }
}
