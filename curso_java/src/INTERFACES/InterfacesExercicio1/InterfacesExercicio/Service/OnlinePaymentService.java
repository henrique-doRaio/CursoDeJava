package INTERFACES.InterfacesExercicio1.InterfacesExercicio.Service;

import INTERFACES.InterfacesExercicio1.InterfacesExercicio.Contracts;

public interface OnlinePaymentService{
    double paymentsFee(double amount);
    double interest(Double amount, Integer months);

}
