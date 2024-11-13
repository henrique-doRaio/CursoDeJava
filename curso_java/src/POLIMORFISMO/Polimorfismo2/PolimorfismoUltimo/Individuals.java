package POLIMORFISMO.Polimorfismo2.PolimorfismoUltimo;

public class Individuals extends Dados {
    private Double healthExpenditure;

    public Individuals(){
        super();
    }


    public Individuals(String name , Double annualIncome,Double healthExpenditure ){
        super(name,annualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    public void setHealthExpenditure(Double healthExpenditure){
        this.healthExpenditure = healthExpenditure;
    }

    public Double getHealthExpenditure(){
        return healthExpenditure;
    }

    @Override
    public Double tax() {
        Double percente = 0.0;
        if(getAnnualIncome() < 20000){
            percente += (getAnnualIncome() * 0.15) - (healthExpenditure * 0.5);
        } else if (getAnnualIncome() > 20000) {
            percente += (getAnnualIncome() * 0.25) - (healthExpenditure * 0.5);
        }
        return percente;
    }

}
