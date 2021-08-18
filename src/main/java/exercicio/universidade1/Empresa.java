package exercicio.universidade1;

public class Empresa extends Entidade {
    private String cnpj;
    private double pago;
    private double recebido;
    
    public Empresa(int id, String nome, String cnpj, double pago, double recebido) {
        super(id, nome);
        this.cnpj = cnpj;
        this.pago = pago;
        this.recebido = recebido;
    }
    
    public Empresa(int id, String nome, String cnpj) {
        this(id, nome, cnpj, 0.0, 0.0);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getRecebido() {
        return recebido;
    }

    public void setRecebido(double recebido) {
        this.recebido = recebido;
    }
   
}
