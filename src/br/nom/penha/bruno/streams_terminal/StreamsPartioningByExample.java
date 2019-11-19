package br.nom.penha.bruno.streams_terminal;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartioningByExample {

    public static void partitioningByPredicateGpa(){

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean,List<Student>> listMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

        System.out.println("partitioningMap: " + listMap);
    }

    public static void partitioningByPredicateGpaByMap(){

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean,Set<Student>> setMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate,
                        Collectors.toSet()));

        System.out.println("partitioningMap : " + setMap);
    }

    public static void main(String[] args) {

        System.out.println("********************");
        partitioningByPredicateGpa();
        System.out.println("********************");
        partitioningByPredicateGpaByMap();
    }
}
