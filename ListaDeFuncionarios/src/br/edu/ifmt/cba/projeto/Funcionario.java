/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifmt.cba.projeto;

/**
 *
 * @author Mailon Bruno
 */
public class Funcionario {
    
    private int id;
    private String nome;
    private String cpf;
    private double salario;
    private final String tipoFuncionario;

    public Funcionario(int id, String nome, String cpf, double salario, String tipoFuncionario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
    }

    public Funcionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
