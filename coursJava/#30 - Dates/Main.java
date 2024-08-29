/*
    LocalDateTime
    LocalDate
    LocalTime
    Ils ont des constantes static EPOCH, MAX, MIN
    et des methodes tq .now(), .of(), .format(), .get*(), .is*()
    utliser les methodes pour les operations de temps
    getlong() aussi pour faire les calculs de temps

    
    Pour le calcul Java utilse deux types:
        > Duration: pour les calculs plus petits que des heures
        > Period: pour les calculs plus petits que les annees

    
    ZoneId
    ZonedDateTime

    DateTimeFormatter;
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Main
{
    public static void main(String[] args) {

    //*******************************************************//
        LocalDateTime ldt = LocalDateTime.now();
        LocalTime lt = LocalTime.now();
        LocalDate ld = LocalDate.now();

        //System.out.println(ld);
        //System.out.println(lt);
        //System.out.println(ld.plusYears(22).getDayOfWeek());

//************************************************************//

        // Duration du = Duration.ofHours(3);
        // System.out.println(du);

        // LocalTime nowplusthree = lt.plus(du);
        // System.out.println(nowplusthree);

        // Period pe = Period.of(12, 3, 2);
        // System.out.println(pe);

        // LocalDate nowplus = ld.plus(pe);
        // System.out.println(nowplus);

        // LocalDate myBirth = LocalDate.of(2002, 11, 21);
        // System.out.println(ld.minus(Period.ofYears(22)));

        //Trouver mon age en annee mois et jours
        // int annee = ld.minusYears(myBirth.getYear()).getYear();
        // int mois = ld.minusMonths(myBirth.getMonthValue()).getMonthValue();
        // int jours = ld.minusDays(myBirth.getDayOfMonth()).getDayOfMonth();
        // System.out.println(annee+" ans "+mois+" mois et "+ jours+ " jours.");

        // ZoneId gmt = ZoneId.of("GMT");
        // ZonedDateTime time = ZonedDateTime.of(ld, lt, gmt);
        // System.out.println(time);

//************************************************************//

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
        String txtDate = ldt.format(fmt);

        System.out.println(txtDate);




    }
}