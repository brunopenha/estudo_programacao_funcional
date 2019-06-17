package br.nom.penha.bruno.streams;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static List<String> getNames(){

        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                // Student as an input to get Studant name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // Stream<String> -> upcase operation for each input
            .collect(Collectors.toList()); // List<String>
    }

    public static Set<String> getNamesSet(){

        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                // Student as an input to get Studant name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // Stream<String> -> upcase operation for each input
                .collect(Collectors.toSet()); // Set<String>
    }

    public static void main(String[] args) {

        System.out.println(getNames());
        System.out.println(getNamesSet());

    }
}
