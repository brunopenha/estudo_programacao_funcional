package br.nom.penha.bruno.streams;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents().stream() // Stream<Studant>
                .filter((student -> student.getGender().equals("female"))) // Stream<Student> filtered by whose gender is female
                .filter(student -> student.getGpa() >= 3.8)
                .collect(Collectors.toList());  // List<String>
    }

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
