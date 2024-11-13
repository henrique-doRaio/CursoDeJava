package POLIMORFISMO.Polimorfismo2;

public class ImportedProduct extends Product {
    private final Double customsFee;

    public Double getCustomsFee(){
        return customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }



    @Override
    public String priceTag(){
        return getName() + " $ " + totalPrice() + "(Customs fee: $" + customsFee + ")" ;
    }
}
