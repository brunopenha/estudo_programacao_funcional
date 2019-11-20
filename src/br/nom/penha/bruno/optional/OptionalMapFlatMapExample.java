package br.nom.penha.bruno.optional;

import br.nom.penha.bruno.data.Bike;
import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    // filter
    public static void opitionalFilter(){

        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        optionalStudent
                .filter(student1 -> student1.getGpa() >= 3.5)
                .ifPresent(student -> System.out.println(student));
    }

    // map
    public static void optionalMap(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if(optionalStudent.isPresent()){
            Optional<String> stringOptional =optionalStudent.filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    // flatmap
    public static void optionalFlatMap(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<String> name = optionalStudent
                .filter(student -> student.getGpa() >= 3.5) // Optional<Student <Optional<Bike>>
                .flatMap(Student::getBike) // return -> Optional<Bike>
                .map(Bike::getName);

        if(name.isPresent()){
            System.out.println(name.get());
        }


    }


    public static void main(String[] args) {

        System.out.println("*************");
        opitionalFilter();
        optionalMap();
        optionalFlatMap();

    }
}
