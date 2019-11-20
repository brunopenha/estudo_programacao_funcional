package br.nom.penha.bruno.optional;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
        //Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student != null){
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptinal(){
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);


        if(student.isPresent()){
            return student.map(Student::getName); // Optinal<String>
        }

        return Optional.empty(); // Represent an Optional object with null value
    }

    public static void main(String[] args) {

        String name = getStudentName();

        if (name!= null){
            System.out.println("Length of the Name: " + name.length());
        }else{
            System.out.println("Name not found");
        }

        System.out.println("************");

        Optional<String> stringOptional = getStudentNameOptinal();

        if(stringOptional.isPresent()){
            System.out.println("Length of the name: " + stringOptional.get().length());
        }else{
            System.out.println("Name not found");
        }

    }
}
