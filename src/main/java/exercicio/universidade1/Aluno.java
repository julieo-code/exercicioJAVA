
package exercicio.universidade1;

public class Aluno extends Pessoa {
    private String ra;
    private String curso;
    private double mensalidade;
    
    public Aluno(String cpf, int id, String nome, String ra, String curso, double mensalidade) {
        super(cpf, id, nome);
        this.ra = ra;
        this.curso = curso;
        this.mensalidade = mensalidade;
    }

    public String getRa() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    
}
