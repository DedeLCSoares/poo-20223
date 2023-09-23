/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

/**
 *
 * @author 1090482211039
 */
public class Assistente extends Funcionario {

    private float horaExtra;

    public Assistente() {
        super();
    }

    public Assistente(float horaExtra, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario);
        this.setHoraExtra(horaExtra);
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public final void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return "Assitente{" + "horaExtra=" + horaExtra + super.toString() + '}';
    }
    
   @Override
    public float calculaSalario(){
        return this.salario + (this.horaExtra * 30); 
    }
}
