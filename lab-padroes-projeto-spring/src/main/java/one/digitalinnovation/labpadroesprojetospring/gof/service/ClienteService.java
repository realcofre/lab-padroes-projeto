package one.digitalinnovation.labpadroesprojetospring.gof.service;

import one.digitalinnovation.labpadroesprojetospring.gof.model.Cliente;
import org.springframework.stereotype.Service;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
