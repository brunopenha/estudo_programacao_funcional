package br.nom.penha.bruno.streams;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){

        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // Stream<String> -> with distinct function performed
                .sorted()
                .collect(Collectors.toList()); // List<String>
    }

    public static long printStudentActivitiesCount(){

        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // Stream<String> -> with distinct function performed
                .count();
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(printStudentActivitiesCount());
    }
}
