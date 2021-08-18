
package exercicio.universidade1;

public class Professor extends Pessoa {
    private int funcional;
    private String disciplina;
    private double salario;
    
    public Professor(String cpf, int id, String nome, int funcional, String disciplina, double salario) {
        super(cpf, id, nome);
        this.funcional = funcional;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public int getFuncional() {
        return funcional;
    }

    public void setFuncional(int funcional) {
        this.funcional = funcional;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
