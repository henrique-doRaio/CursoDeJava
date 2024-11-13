package INTERFACES.InterfacesExercicio1.InterfacesExercicio;

import INTERFACES.InterfacesExercicio1.InterfacesExercicio.Service.ContractService;
import INTERFACES.InterfacesExercicio1.InterfacesExercicio.Service.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the contract data: ");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("Date (dd/MM/yyyy)");
            LocalDate date = LocalDate.parse(sc.next(), fmt);
            System.out.print("Value of contract: ");
            Double value = sc.nextDouble();

            Contracts contracts = new Contracts(number, date, value);
            System.out.println("Enter the number of installments : ");
            int n = sc.nextInt();
            ContractService contractService = new ContractService(new PaypalService());
            contractService.processContract(contracts, n);

            System.out.println("PARCELS: ");
            for (Installment installment : contracts.getInstallments()) {
                System.out.println(installment);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
