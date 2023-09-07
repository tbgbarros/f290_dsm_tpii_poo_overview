package domain;

public class Aluno extends Usuario
{
    private Integer ra;



    public Aluno(String nome, String telefone, String email, String github, Integer ra)
    {
        super(nome, telefone, email, github);
        this.ra = ra;
    
    }

    public Integer getRa() {
        return ra;
    }

    @Override
    public String toString() {
        return String.format("%sAluno : %s", super.toString(),ra);
        //return "Aluno [ra=" + ra + "]";
    }

    @Override
    public void autenticar(String username, String senha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Metodo implementado 'autenticar'");
    }
    
}
    

