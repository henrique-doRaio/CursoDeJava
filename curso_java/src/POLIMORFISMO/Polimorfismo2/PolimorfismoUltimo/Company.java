package POLIMORFISMO.Polimorfismo2.PolimorfismoUltimo;

public class Company extends Dados{

    private int numberEmployee;

    public Company(){
        super();
    }

    public Company(String name , Double annualIncome, int numberEmployee){
        super(name,annualIncome);
        this.numberEmployee = numberEmployee;
    }

    public void setNumberEmployee(int numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public int getNumberEmployee(){
        return numberEmployee;
    }


    @Override
    public Double tax() {
        Double percente = 0.0;
        if (numberEmployee < 10){
            percente += getAnnualIncome() * 0.16;
        } else if (numberEmployee > 10) {
            percente += getAnnualIncome() * 0.14;
        }
        return percente;
    }


}
