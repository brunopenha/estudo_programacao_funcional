package br.nom.penha.bruno.streams_terminal;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joiningAllTogether(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joiningWithDelimiter(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joiningWithPrefixSufix(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }

    public static void main(String[] args) {
        System.out.println("joiningAllTogether: " + joiningAllTogether()) ;
        System.out.println("joiningWithDelimiter: " + joiningWithDelimiter()) ;
        System.out.println("joiningWithPrefixSufix: " + joiningWithPrefixSufix()) ;

    }
}
