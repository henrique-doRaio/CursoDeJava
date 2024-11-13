package POLIMORFISMO.Polimorfismo2.PolimorfismoExercicio;

public class OutSourcedEmployee extends Employee {
    private Double additioonalCharge;

    Employee employee;

    public OutSourcedEmployee(){
        super();
    }

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additioonalCharge) {
        super(name, hours, valuePerHour);
        this.additioonalCharge = additioonalCharge;
    }


    @Override
    public Double paymennt(){
        return super.paymennt() + additioonalCharge * 1.1;
    }

    public String toString(){
        return getName() + " - $ " + paymennt();
    }
}
