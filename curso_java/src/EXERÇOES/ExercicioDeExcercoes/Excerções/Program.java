package EXERÇOES.ExercicioDeExcercoes.Excerções;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //RuntimeException = não precisa usar Throws
        //Exception precisa usar throws
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            try {

                System.out.println("Hotel of room data: ");
                System.out.println("Enter the room number");
                Integer roomNumber = sc.nextInt();
                sc.nextLine();
                System.out.println("Check-in date (dd/MM/yyyy)");
                Date checkIn = sdf.parse(sc.next());
                System.out.println("Check-out (dd/MM/yyyy)");
                Date checkOut = sdf.parse(sc.next());

                Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
                System.out.println("Reservation: " + reservation);

                System.out.println("Enter data to update the reservation: ");
                System.out.println("Check-in date (dd/MM/yyyy)");
                checkIn = sdf.parse(sc.next());
                System.out.println("Check-out (dd/MM/yyyy)");
                checkOut = sdf.parse(sc.next());
                System.out.println("Reservation: " + reservation);

                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }
            catch (ParseException e){
                System.out.println("Invalid date format");
            } catch (DomainException e) {
                System.out.println("Error in reservation " + e.getMessage());
            }catch (RuntimeException e){
                System.out.println("Unexpected error");
            }

        sc.close();
    }
}
