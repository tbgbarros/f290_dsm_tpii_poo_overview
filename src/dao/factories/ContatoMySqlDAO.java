package dao.factories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import domain.ContatoVO;

public class ContatoMySqlDAO implements IContatoDAO {

    private final Connection connection;
    private Logger logger;

    public ContatoMySqlDAO(Connection connection) {
        this.connection = connection;
        this.logger = Logger.getLogger(this.getClass().getSimpleName());
    }

    @Override
    public void salvar(ContatoVO contato) {
        StringBuilder builder = new StringBuilder();
        builder.append("INSERT INTO contatos (")
                .append("nome, email, telefone, linkedin) ")
                .append("values('%s', '%s', '%s', '%s')");

        String query = String.format(builder.toString(),
                contato.getNome(),
                contato.getEmail(),
                contato.getTelefone(),
                contato.getLinkedin());
                
        try (Statement stm = connection.createStatement()) {
            stm.execute(query);
        } catch (SQLException e) {
           e.printStackTrace();
        }

    }

    @Override
    public void atualizar(ContatoVO contato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void excluir(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        // TODO Auto-generated method stub
        List<ContatoVO> contatos = new ArrayList<>();
        String query = "SELECT id, nome, email, telefone, linkedin FROM contatos";
        try (Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery(query))
            {
                //todo para percorrer result e preencher a lista de contatos
                while(rst.next()) {
                    ContatoVO contato = new ContatoVO(
                    rst.getInt("id"),
                    rst.getString("nome"),
                    rst.getString("email"),
                    rst.getString("telefone"),
                    rst.getString("linkedin"));
                //todo adicionar o objeto criado a base na consuulta para a lista
                contatos.add(contato);
                }
            }
            catch (Exception e) {
            // TODO: handle exception
            //TODO: adicionar log e retornar lista vazia
            logger.log(Level.SEVERE, "Falha ao colsultar contatos", e);

        }
        return contatos;
        
        }
    
            
         
    

    @Override
    public ContatoVO buscarPorEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorEmail'");
    }

}
