/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.exe1;

/**
 *
 * @author 1090482211039
 */
public class CarItem {
    private int quantity;
    private Product product;
    
    public CarItem() {
    }

    public CarItem(int quantity, Product product) {
        this.setQuantity(quantity);
        this.setProduct(product);
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "carItem{" + "quantity= " + quantity + ", product= " + product + '}';
    }
}
