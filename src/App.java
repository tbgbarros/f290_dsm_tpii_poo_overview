import domain.Usuario;
import domain.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        // criação de um objseto
       
        System.out.println("----------------------------------------------------------------------------------------");
        Professor professor1 = new Professor("marcos", "19999887766", "jose@hotmail.om", "tbgbarros",9988);
        System.out.println("----------------------------------------------------------------------------------------");
        Usuario usuario1 = new Usuario("thiago", "19999887766", "jose@hotmail.om", "tbgbarros");
        System.out.println("----------------------");
        //System.out.println(usuario1 instanceof ISoneto);
        //System.out.println("----------------------");
        System.out.println(usuario1 instanceof Usuario);
        System.out.println("----------------------");
        System.out.println(professor1);
        System.out.println("----------------------");
        //Usuario usuario2 = new Usuario();

    }
}
