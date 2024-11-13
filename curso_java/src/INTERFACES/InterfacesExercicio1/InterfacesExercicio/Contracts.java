package INTERFACES.InterfacesExercicio1.InterfacesExercicio;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Contracts {
    private Integer contractNumber;
    private LocalDate contractDate;
    private Double totalContractValue;

    private List<Installment> installments = new ArrayList<>();

    public Contracts(){}

    public Contracts(Integer contractNumber , LocalDate contractDate, Double totalContractValue){
        this.contractDate = contractDate;
        this.contractNumber = contractNumber;
        this.totalContractValue = totalContractValue;
    }

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public Double getTotalContractValue() {
        return totalContractValue;
    }

    public void setTotalContractValue(Double totalContractValue) {
        this.totalContractValue = totalContractValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
