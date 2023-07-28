package Entidade;

/** Classe que representa a entidade cliente. Este pode fazer um pedido. */
public class Cliente {

    /** Nome completo do cliente.*/
    private String nome;

     /* Número de CPF(Cadastro de Pessoa Física) do cliente. */
    private String cpf;

    public Cliente() {
        this.nome = "Fulano";
        this.cpf = "258";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{ nome='" + nome + "'}";
    }
}
