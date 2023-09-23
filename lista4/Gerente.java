/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

/**
 *
 * @author 1090482211039
 */
public class Gerente extends Funcionario {

    private float bonus;

    public Gerente() {
        super();
    }

    public Gerente(float bonus, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonus=" + bonus + super.toString() + '}';
    }

    @Override
    public float calculaSalario(){
        return this.salario + this.bonus;
    }
}
