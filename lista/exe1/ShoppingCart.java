package lista.exe1;

import java.util.ArrayList;

public class ShoppingCart {
    private int id;
    private ArrayList<CarItem> carItens;

    public ShoppingCart() {
        this.carItens = new ArrayList();
    }

    public ShoppingCart(int id, ArrayList<CarItem> carItens) {
        this.id = id;
        this.carItens = carItens;
    }
    
    public void addCarItem(CarItem carItem){
        this.carItens.add(carItem);
    }
    
    public boolean removeCarItem(CarItem carItem){
        return this.carItens.remove(carItem);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCarItens(ArrayList<CarItem> carItens) {
        this.carItens = carItens;
    }

    public int getId() {
        return id;
    }

    public ArrayList<CarItem> getCarItens() {
        return carItens;
    }
    
    public float calculateTotal(){
        float total = 0;
        for(int i = 0; i < carItens.size(); i++){
            total += (carItens.get(i).getQuantity() * carItens.get(i).getProduct().getPrice());
        }
        return total;
    }

    @Override
    public String toString() {
        return "\n ShoppingCart{" + "\n id= " + id + ", \n carItens= " + carItens + "\nTotal: " + this.calculateTotal() + '}';
    }
}
