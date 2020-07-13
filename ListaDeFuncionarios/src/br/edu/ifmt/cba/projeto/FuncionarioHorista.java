package br.edu.ifmt.cba.projeto;

/**
 *
 * @author Mailon Bruno
 */
public class FuncionarioHorista extends Funcionario {
    
    private double valorHora;
    private double qtdHora;
    
    public FuncionarioHorista(int id, String nome, String cpf, double salario, double valorHora, double qtdHora) {
        super(id, nome, cpf, salario, "Horista");
        this.valorHora = valorHora;
        this.qtdHora = qtdHora;
    }

    public FuncionarioHorista(String tipoFuncionario) {
        super("Horista");
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(double qtdHora) {
        this.qtdHora = qtdHora;
    }
    
    @Override
    public double getSalario(){
        return super.getSalario() + (getQtdHora() + getValorHora());
    }
    
    
    
}
