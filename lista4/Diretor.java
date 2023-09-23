/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

/**
 *
 * @author 1090482211039
 */
public class Diretor extends Funcionario {
    private float acoesEmpresa;

    public Diretor() {
        super();
    }

    public Diretor(float acoesEmpresa, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(float acoesEmpresa) {
        this.setAcoesEmpresa(acoesEmpresa);
    }
    
    @Override
    public String toString() {
        return "Diretor{" + "acoesEmpresa=" + acoesEmpresa + '}';
    }
    
    @Override
    public float calculaSalario(){
        return this.salario + (8 * this.acoesEmpresa) / 12;
    }
}
