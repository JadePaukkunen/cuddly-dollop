package fi.academy.Maanantai;

import javafx.print.Collation;

import java.text.Collator;
import java.util.*;

public class Localejutut {
    public static void main(String[] args) {

//        Locale kieli = new Locale("fi");
//
//        Locale.setDefault(kieli);
        List<String> sanalista = new ArrayList<>(Arrays.asList( "vaari", "pêche", "persikka", "väärä", "auto", "älämölö", "Java"));

        tulosta(sanalista, Locale.ITALIAN);
    }

    private static void tulosta(List<String> sanalista, Locale loc) {
        Collator kollaattori = Collator.getInstance(loc);
        Collections.sort(sanalista, kollaattori::compare);
        System.out.println(loc.getDisplayName(new Locale("it", "IT")));
        System.out.println("\t" + sanalista);

    }
        }


