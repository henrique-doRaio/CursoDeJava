package exemplo;

public class pedido {
    public String name;
    public double price;
    public int quantity;

    public pedido(String name, double price , int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public pedido(String name, double price) {
        this.name = name;
        this.quantity = 0;
        this.price = price;
    }

    public double totalValuesStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + price + ", " + quantity + " units " + ", Total: $ " + totalValuesStock();
    }
}
