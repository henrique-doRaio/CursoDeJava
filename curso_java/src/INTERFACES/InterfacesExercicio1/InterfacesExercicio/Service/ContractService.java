package INTERFACES.InterfacesExercicio1.InterfacesExercicio.Service;

import INTERFACES.InterfacesExercicio1.InterfacesExercicio.Contracts;
import INTERFACES.InterfacesExercicio1.InterfacesExercicio.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contracts contracts, int months){
        double basicQuota = contracts.getTotalContractValue() / months;
        for (int i = 1 ; i <= months; i++){
            LocalDate dueDate = contracts.getContractDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota , i);
            double fee = onlinePaymentService.paymentsFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contracts.getInstallments().add(new Installment(dueDate, quota));

        }
    }
}
