package domain;

//import java.util.Objects;

public class Professor extends Usuario {

    private Integer matricula;

    public Professor(String nome, String telefone, String email, String github, Integer matricula) {
        super(nome, telefone, email, github);
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        //String retorno = super.toString();
        //return retorno .concat("\nMatricula: ").concat(matricula.toString());
        return String.format("%s\nMatricula: %s", super.toString(), matricula);
    }
    
}
