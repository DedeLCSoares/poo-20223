/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

/**
 *
 * @author 1090482211039
 */
public class Testa {
    public static void Mostra(Funcionario objeto){
        System.out.println(objeto.toString());
        System.out.println(objeto.calculaSalario());
    }
    
    public static void main(String[] args) {
        Assistente objAss = new Assistente(3, "Fulano", "123", "123", 3000);
        Mostra(objAss);
        
        Gerente objGer = new Gerente(1000, "Beltrano", "Franca", "456", 4000);
        Mostra(objGer);
        
        Diretor objDir = new Diretor(1000, "Ciclano", "Franca", "789", 6000);
        Mostra(objDir);
    }
}
