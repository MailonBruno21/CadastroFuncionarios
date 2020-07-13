
package br.edu.ifmt.cba.projeto;

/**
 *
 * @author Mailon Bruno
 */
public class FuncionarioSupervisor extends Funcionario{
    
    private double adicionalSalario;
    
    public FuncionarioSupervisor(int id, String nome, String cpf, double salario, double addSalario) {
        super(id, nome, cpf, salario, "Supervisor");
       setAdicionalSalario(addSalario);
    }

    public double getAdicionalSalario() {
        return adicionalSalario;
    }

    public void setAdicionalSalario(double adicionalSalario) {
        this.adicionalSalario = adicionalSalario;
    }

    public FuncionarioSupervisor() {
        super("Supervisor");
    }
    
}
