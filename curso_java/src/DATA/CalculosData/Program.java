package DATA.CalculosData;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeek = d04.minusDays(7);
        LocalDate nextWeek = d04.plusDays(7);

        int hora = 4;

        LocalDateTime nextHours = d05.plusHours(hora);
        LocalDateTime pastHours = d05.minusHours(06);
        LocalDateTime pastDaysTime = d05.minusDays(5);

        Instant nextWeekInstant = d06.plus(hora, ChronoUnit.DAYS);
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);

        System.out.println("PastWeek = " + pastWeek);
        System.out.println("nextWeek = " + nextWeek);
        System.out.println("nextHours = " + nextHours);
        System.out.println("pastHours = " + pastHours);

        //Não suporta minutos e segundos

        Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastDaysTime , d05);
        Duration t3 = Duration.between(nextWeekInstant, d06);

        System.out.println("t1 = " + t1.toDays());
        System.out.println("t2 = " + t2.toDays());
        System.out.println("t3 = " + t3.toDays());
    }
}