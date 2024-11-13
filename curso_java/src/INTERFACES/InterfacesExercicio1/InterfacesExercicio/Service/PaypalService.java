package INTERFACES.InterfacesExercicio1.InterfacesExercicio.Service;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double paymentsFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(Double amount, Integer months) {
        return amount * 0.01 * months;
    }
}

