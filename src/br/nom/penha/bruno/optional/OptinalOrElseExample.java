package br.nom.penha.bruno.optional;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.Optional;

import static java.util.stream.Stream.ofNullable;

public class OptinalOrElseExample {

    //orElse
    public static String optionalOrElse(){
        Optional<Student> studentOptinal =  Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = studentOptinal.map(Student::getName).orElse("Default");
        return name;
    }
    public static String optionalOrElseNull(){
        Optional<Student> studentOptinal =  Optional.ofNullable(null);
        String name = studentOptinal.map(Student::getName).orElse("Default");
        return name;
    }

    public static String optionalOrElseGet(){
        Optional<Student> studentOptinal =  Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = studentOptinal.map(Student::getName).orElseGet(() -> "Default Get");
        return name;
    }

    public static String optionalOrElseGetNull(){
        Optional<Student> studentOptinal =  Optional.ofNullable(null);
        String name = studentOptinal.map(Student::getName).orElseGet(() -> "Default Get");
        return name;
    }

    public static String optionalOrElseThrow(){
        Optional<Student> studentOptinal =  Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = studentOptinal.map(Student::getName).orElseThrow(() ->  new RuntimeException());
        return name;
    }

    public static String optionalOrElseThrowNull(){
        Optional<Student> studentOptinal =  Optional.ofNullable(null);
        String name = studentOptinal.map(Student::getName).orElseThrow(() ->  new RuntimeException());
        return name;
    }

    public static void main(String[] args) {

        System.out.println("***************");
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseNull());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseGetNull());
        System.out.println(optionalOrElseThrow());
        System.out.println(optionalOrElseThrowNull());
    }
}
