package fi.academy.Maanantai;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;


public class MainPVM {
    public static void main(String[] args) {

        Perjantai13 perjantai = new Perjantai13();
        SimpleDateFormat pvmMalli = new SimpleDateFormat("dd.MM.yyyy");

//        Date tanaan = new Date();
//        System.out.println(tanaan);
//        Date aikojaSitten = new Date(118, 3, 13);
//        System.out.println(aikojaSitten);
//        Date mikaPaiva = new Date (1912, 3, 15);
//        System.out.println(mikaPaiva);
//
//        Calendar tamaPaiva = new GregorianCalendar(2018, 8, 17);
//        System.out.println(tamaPaiva.getTime());
//        tamaPaiva.add(Calendar.MONTH, 1);
//        System.out.println(tamaPaiva.getTime());
//        tamaPaiva.roll(Calendar.MONTH, 1);
//        System.out.println(tamaPaiva.getTime());
//
//        Calendar karkauspaiva = new GregorianCalendar(2018, 1, 29);
//        System.out.println(karkauspaiva.getTime());
//
//        Date karkauspaiva2 = new Date(2018, 1, 29);
//        System.out.println(karkauspaiva2);

        LocalDate tanaan = LocalDate.now();
        LocalDate aiemmin = LocalDate.of(2018, 4, 13);
        LocalDate vuodenensimmainen = LocalDate.of(2019, 1, 1);
        LocalDate vuodenEnsimmainenPerjantai = vuodenensimmainen.plusDays(3);

//        perjantai.perjantai13();

        LocalDate jadenSynttarit = LocalDate.of(1988, 7, 27);
        LocalDate jempunSynttarit = LocalDate.of(1993, 4, 10);
        LocalDate valmistuminen = LocalDate.of(2018, 11, 30);
        Period synttareidenVali = Period.between(jempunSynttarit, jadenSynttarit);
        System.out.println(synttareidenVali);




    }
}
