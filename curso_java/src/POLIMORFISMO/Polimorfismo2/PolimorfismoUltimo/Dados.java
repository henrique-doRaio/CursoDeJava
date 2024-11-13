package POLIMORFISMO.Polimorfismo2.PolimorfismoUltimo;

public abstract class Dados {
    private String name;
    private Double annualIncome;

    public Dados(){
    }

    public Dados(String name, Double annualIncome){
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract Double tax();


}
