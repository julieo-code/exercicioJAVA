
package exercicio.universidade1;

public abstract class Pessoa extends Entidade {
    private String cpf;
    private int idade;

    public Pessoa(String cpf, int id, String nome) {
        super(id, nome);
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
