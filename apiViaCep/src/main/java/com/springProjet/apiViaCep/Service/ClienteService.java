 
package com.springProjet.apiViaCep.Service;

import com.springProjet.apiViaCep.Model.Cliente;

public interface ClienteService {
    

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);
    
    void deletar(Long id);
}
