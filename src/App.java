import domain.Usuario;

import java.util.Arrays;

import domain.Curso;
import domain.Professor;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // criação de um objseto

        System.out.println("----------------------------------------------------------------------------------------");
        Professor professor1 = new Professor("chaves", "19999887766", "jose@hotmail.om", "tbgbarros", 9988);
        System.out.println("----------------------------------------------------------------------------------------");
        Professor professor2 = new Professor("madruga", "19999887766", "XXXXXXXXXXXXXXX", "tbgbarros", 9988);
        System.out.println("----------------------");
        // System.out.println(usuario1 instanceof ISoneto);-
        // System.out.println("----------------------");
        System.out.println(professor2 instanceof Usuario);
        System.out.println("----------------------");
        System.out.println(professor1);
        System.out.println("----------------------");
        // Usuario usuario2 = new Usuario();

        // usuario1.autenticar("user", "123");

        String nomeCurso = "Desenvolvimento";
        List<String> Lista_de_conhecimentos = Arrays.asList("Java", "Python", "C++");

        Curso curso = new Curso(nomeCurso, Lista_de_conhecimentos);
        professor1.ensina(curso);

        System.out.println(curso);
    }
}
