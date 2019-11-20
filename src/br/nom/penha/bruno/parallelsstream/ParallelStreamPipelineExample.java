package br.nom.penha.bruno.parallelsstream;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamPipelineExample {

    public static List<String> printSequencialStudentActivities(){

        final long startTime = System.currentTimeMillis();

        List<String> stingList = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // Stream<String> -> with distinct function performed
                .sorted()
                .collect(Collectors.toList()); // List<String>

        final long endTime = System.currentTimeMillis();

        final long duration = endTime - startTime;

        System.out.println("Duration Sequential : " + duration);

        return stingList;
    }

    public static List<String> printParallelStudentActivities(){

        final long start = System.currentTimeMillis();
        List<String> listString =  StudentDataBase.getAllStudents().stream() // Stream<Student>
                .parallel()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // Stream<String> -> with distinct function performed
                .sorted()
                .collect(Collectors.toList()); // List<String>
        final long end = System.currentTimeMillis();

        System.out.println("Duration Parallel: " + (end - start));

        return listString;
    }


    public static void main(String[] args) {

        printSequencialStudentActivities();
        printParallelStudentActivities();

    }
}
