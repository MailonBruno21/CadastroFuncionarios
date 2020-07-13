package br.edu.ifmt.cba.projeto;

import br.edu.ifmt.cba.util.Teclado;

/**
 *
 * @author Mailon Bruno
 */
public class Main {

    private static final int nmrMaximoFuncionarios = 10;

    private static Funcionario funcionario[] = new Funcionario[nmrMaximoFuncionarios];

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        System.out.println("--------------------Menu-----------------------");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Pesquisar");

        int opcao = Teclado.leInt("Digite a Opção:");

        switch (opcao) {
            case 1:
                cadastrar();
                break;

            case 2:
                buscar();
                break;
        }
    }

    public static void cadastrar() {
        System.out.println("--------------------Cadastrar-----------------------");
        System.out.println("1 - Funcionario Horista");
        System.out.println("2 - Funcionario Supervisor");
        System.out.println("3 - Voltar");

        int opcao = Teclado.leInt("Digite a Opção:");

        switch (opcao) {
            case 1:
                int id = Teclado.leInt("Digite o numero de identificação: ");
                String nome = Teclado.leString("Digite o nome do funcionario: ");
                String cpf = Teclado.leString("Digite o CPF: ");
                double salario = Teclado.leDouble("Digite o salario: ");
                double valorHora = Teclado.leDouble("Digite o valor da hora: ");
                double qtdHora = Teclado.leDouble("Digite a quantidade de hora: ");

                for (int i = 0; i < nmrMaximoFuncionarios; i++) {

                    if (funcionario[i] == null) {
                        funcionario[i] = new FuncionarioHorista(id, nome, cpf, salario, valorHora, qtdHora);
                        menuPrincipal();
                    }
                }
                menuPrincipal();
                break;
            case 2:
                id = Teclado.leInt("Digite o numero de identificação: ");
                nome = Teclado.leString("Digite o nome do funcionario: ");
                cpf = Teclado.leString("Digite o CPF: ");
                salario = Teclado.leDouble("Digite o salario: ");
                double addSalario = Teclado.leDouble("Digite o valor do adicional do salario: ");

                for (int i = 0; i < nmrMaximoFuncionarios; i++) {

                    if (funcionario[i] == null) {
                        funcionario[i] = new FuncionarioSupervisor(id, nome, cpf, salario, addSalario);
                        menuPrincipal();
                    }
                }
                menuPrincipal();
                break;
            case 3:
                menuPrincipal();
                break;
            default:
                System.out.println("Opcao invalida");
                cadastrar();
        }
    }
    
    public static int buscar(){
        
        System.out.println("--------------------Pesquisar-----------------------");
        System.out.println("1 - Nome");
        System.out.println("2 - Identificador");
        
        int opcao = Teclado.leInt("Digite a Opção:");
        
        switch (opcao) {
            case 1:
                String nome = Teclado.leString("Digite o nome do funcionario: ");
                for(int i = 0; i < nmrMaximoFuncionarios; i++ ){
                    if(funcionario[i].getNome().equals(nome) && funcionario[i] != null){
                        return i;
                    }
                    
                }
                System.out.println("Nada Encontrado");
                menuPrincipal();
                
            case 2:
                int id = Teclado.leInt("Digite identificador do funcionario: ");
                for(int i = 0; i < nmrMaximoFuncionarios; i++ ){
                    if(funcionario[i].getId().equals(id) && funcionario[i] != null){
                        return i;
                    }
                    
                }
                System.out.println("Nada Encontrado");
                menuPrincipal();
        }
        return 0;
    }
}
