package br.nom.penha.bruno.streams;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    /**
     *
     * @param listaInteiros
     * @return Optional - LIda com valores não nulos, para evitar erros
     */
    public static Optional<Integer> realizaMultiplicacaoSemIdentidade(List<Integer> listaInteiros){
        return listaInteiros.stream()
                .reduce((a,b) -> a*b);
    }

    public static int realizaMultiplicacao(List<Integer> listaInteiros){

        return listaInteiros.stream()
                // Da lista 1,3,5,7
                // A primeira iteração irá considerar o primeiro parametro passado (que é 1) // Se for 0, o resultado final sera 0
                // e ira colocar na variavel a, ficando:
                // a = 1 e  b = 1 (b é obtido do Stream()) -> resultado é 1
                // a = 1 e  b = 3 (do Stream()) -> resultado é 3
                // a = 3 e  b = 5 (do Stream()) -> resultado é 15
                // a = 15 e b = 7 (do Stream()) -> resultado é 105
                .reduce(1,(a,b) -> a*b);
    }

    public static int realizaMultiplicacao(Integer identidade, List<Integer> listaInteiros){

        return listaInteiros.stream()
                // Da lista 1,3,5,7
                // A primeira iteração irá considerar o primeiro parametro passado (que é 1) // Se for 0, o resultado final sera 0
                // e ira colocar na variavel a, ficando:
                // a = 1 e b = 1 (b é obtido do Stream()) -> resultado é 1
                // a = 1 e b = 3 (do Stream()) -> resultado é 3
                // a = 3 e b = 5 (do Stream()) -> resultado é 15
                // a = 15 e b = 7 (do Stream()) -> resultado é 105
                .reduce(identidade,(a,b) -> a*b);
    }

    public static Optional<Student> getMaiorGPAEstudate(){

        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);


    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,3,5,7);

        System.out.println(realizaMultiplicacao(integerList));

        System.out.println(realizaMultiplicacao(0,integerList));
        System.out.println(realizaMultiplicacao(3,integerList));
        System.out.println(realizaMultiplicacao(2,integerList));

        Optional<Integer> resultado = realizaMultiplicacaoSemIdentidade(integerList);
        System.out.println(resultado.isPresent());
        System.out.println(resultado.get());

        Optional<Integer> resultado1 = realizaMultiplicacaoSemIdentidade(new ArrayList<>());
        System.out.println(resultado1.isPresent()? resultado1.get(): "No values");
        System.out.println(resultado1.orElse(99));

        Optional<Student> estudanteOptional = getMaiorGPAEstudate();
        if(estudanteOptional.isPresent()){
            System.out.println(estudanteOptional.get());
        }
    }
}
