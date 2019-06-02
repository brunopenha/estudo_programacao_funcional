package br.nom.penha.bruno.funcionalinterfaces;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){

        BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println(name + ":" +activities);

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.println("a: " + a + "b: " + b);
        };

        biConsumer.accept("Java7","JAva8");

        BiConsumer<Integer, Integer> multiply = (a,b) -> {
            System.out.println("Multiplication  = [" + (a * b) + "]");
        };

        BiConsumer<Integer, Integer> divisao = (a,b) -> {
            System.out.println("Division = [" + (a/b)  + "]");
        };

        multiply.andThen(divisao).accept(10,5);

        nameAndActivities();
    }
}
