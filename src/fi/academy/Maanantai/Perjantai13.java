package fi.academy.Maanantai;

import java.time.LocalDate;

public class Perjantai13 {

    public void perjantai13() {
        LocalDate vuodenensimmainen = LocalDate.of(2019, 1, 1);

        LocalDate vuodenEnsimmainenPerjantai = vuodenensimmainen.plusDays(3);

        int weeks = 1;
        while (weeks <100){

            if (vuodenEnsimmainenPerjantai.plusWeeks(weeks).getDayOfMonth() == 13){
                LocalDate perjantai13 = vuodenEnsimmainenPerjantai.plusWeeks(weeks);
                System.out.println(perjantai13);
                ++weeks;
            }
            if (vuodenEnsimmainenPerjantai.plusWeeks(weeks).getDayOfMonth() != 13){
                ++weeks;
            }
    }


    }
}
