package Negocio;

import Baseados.Banco;
import Entidade.Cliente;
import Entidade.Pedido;
import Entidade.Produto;

import java.util.Optional;

/** Classe para manipular a entidade {@link Cliente}. */

public class ClienteNegocio {

    /** {@inheritDoc}. */
    private Banco bancoDados;

    /** Construtor.
     * @param banco Banco de dados para ter acesso aos clientes cadastrados */

    public ClienteNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    /** Consulta o cliente pelo seu CPF.
     * @param cpf CPF de um cliente
     * @return O cliente que possuir o CPF passado. */

    public Optional<Cliente> consultar(String cpf) {

        if (bancoDados.getCliente().getCpf().equals(cpf)) {
            return Optional.of(bancoDados.getCliente());
        } else {
            return Optional.empty();
        }
    }

    /**
     * Cadastra um novo cliente.
     *
     * @param cliente Novo cliente que terá acesso a aplicação
     */
    //TODO Fazer a inclusão de cliente
    public void cadastrarCliente(Produto cliente) {
        bancoDados.adicionarCliente(cliente);
    }

    /**
     * Exclui um cliente específico.
     *
     * @param cpf CPF do cliente
     */
    //TODO Fazer a exclusão de cliente
    public void excluirCliente(String cpf) {
       Optional<Cliente> clienteOpt = consultar(cpf);
        bancoDados.removerCliente(clienteOpt.get());
    }

}
