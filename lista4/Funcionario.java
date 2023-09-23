/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

/**
 *
 * @author 1090482211039
 */
public abstract class Funcionario {
    protected String nome, endereco, cpf;
    protected float salario;

    public Funcionario() {
    }
    
    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setCpf(cpf);
        this.setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public final void setSalario(float salario) {
        this.salario = salario;
    }

    @Override //anulação de método
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
    
    public float calculaSalario(){
        return this.salario;
    }    
}
