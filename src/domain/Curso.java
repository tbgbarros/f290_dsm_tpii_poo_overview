package domain;

import java.util.ArrayList;
import java.util.List;

import javax.naming.LimitExceededException;

public class Curso {

    private String nome;
    private List<String> conhecimentos = new ArrayList<>();

    public Curso(String nome, List<String> conhecimentos) {
        this.nome = nome;
        this.conhecimentos = conhecimentos;
    }

    @Override
    public String toString() {
        return "Curso [nome=" + nome + "]";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getConhecimentos() {
        return conhecimentos;
    }

}