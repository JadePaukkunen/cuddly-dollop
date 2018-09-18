package fi.academy.Maanantai;

import java.text.Collator;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class PvmTulostuksia {
    public static void main(String[] args) {
        LocalDateTime tanaan = LocalDateTime.now();
        System.out.println(tanaan.toLocalDate());
        System.out.println(tanaan.toLocalTime());

        System.out.println(tanaan.getLong(ChronoField.DAY_OF_MONTH));
        //tulosta();
    }
   /* private static void tulosta(LocalDateTime, Locale loc) {
        Collator kollaattori = Collator.getInstance(loc)
        System.out.println(loc.getDisplayName(new Locale("it", "IT")));
        System.out.println("\t" + tanaan);

    }*/
}
