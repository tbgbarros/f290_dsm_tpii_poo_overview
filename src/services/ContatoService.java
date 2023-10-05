package services;

import java.util.List;
import java.util.Objects;

import domain.ContatoVO;
import repositories.IContatoRepository;

public class ContatoService implements IContatoService{

    private final IContatoRepository repository;

    public ContatoService(IContatoRepository repository) {
        this.repository = repository;

    }

    @Override
    public void salvar(ContatoVO contato) {
        // TODO: validar o objero conforme a entidade contatos
        if(Objects.isNull(contato.getNome()) || contato.getNome().isEmpty()){
            throw new RuntimeException("O nome é obrigatório");
        }

        if(Objects.isNull(contato.getEmail()) || contato.getEmail().isEmpty()){
            throw new RuntimeException("O email é obrigatório");
        }

        repository.salvar(contato);

    }    
    

    @Override
    public void alterar(ContatoVO contato) {
        // TODO validar objeto confirme a entidade contatos

        //TODO consultar e recuperar contato

        //TOD alterar contato
    }

    @Override
    public ContatoVO buscarPorEmail(String email) {
        return null;
        // TODO validar por e-mail

        //TODO localizar contato e retpornar contato
    }

    @Override
    public void excluir(Integer id) {
        // TODO   validar id

        //TODO localizar contato e ecluir contato
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        return repository.buscarTodos();
    }
    
}
