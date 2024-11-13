package PedidoCliente.PedidoClienteOrder;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity , Double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double setPrice(){
        return price;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public double subTotal(){
        return quantity * price;
    }

    @Override
    public String toString(){
         return
                 getPrice() +
                " , $ " +
                String.format("%.2f", price) +
                ", Quantity: "
                + quantity +
                ", Subtotal: $" +
                String.format("$ %.2f" , subTotal());
    }

}
