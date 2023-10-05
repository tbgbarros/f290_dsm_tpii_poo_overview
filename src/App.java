import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import dao.factories.ConexaoFactory;
import dao.factories.ContatoMySqlDAO;
import dao.factories.IContatoDAO;
import domain.ContatoVO;
import repositories.ContatoInMemoryRepository;
import repositories.ContatoMySqlRepository;
import repositories.IContatoRepository;
import services.ContatoService;
import services.IContatoService;

public class App {
    public static void main(String[] args) throws Exception {

        // Connection conexao = ConexaoFactory.getConexao();
        // IContatoDAO dao = new ContatoMySqlDAO(conexao);
        // IContatoRepository repository = new ContatoMySqlRepository(dao);
        IContatoRepository repository = new ContatoInMemoryRepository();

        IContatoService service = new ContatoService(repository);

        //TODO criar objeto contatoVO e realizar chamada do metodo salvar de service 
        ContatoVO contato1 = new ContatoVO(
        null, 
        "Jose Joaquim", 
        "jose@gmail.com", 
        "19998763456", 
        "JoseJoka");

        service.salvar(contato1);

        //busca contatos na base cadastrada
        List<ContatoVO> contatos = service.buscarTodos();
        System.out.println(contatos);



        // ResultSet rst = ConexaoFactory.getConexao()
        //         .createStatement()
        //         .executeQuery("select version() as versao;");

        // if(rst.next()) {
        //     System.out.println(rst.getString("versao"));
        // }
    }
}
