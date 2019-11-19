package br.nom.penha.bruno.streams_terminal;

import br.nom.penha.bruno.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    public static long counting(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println("Counting: " + counting());
    }
}
