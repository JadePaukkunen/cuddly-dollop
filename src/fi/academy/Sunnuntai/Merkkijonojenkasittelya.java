package fi.academy.Sunnuntai;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Merkkijonojenkasittelya {


    public String sananKaantaminen(String sana){
        String kaannettysana = "";
        for (int s = sana.length()-1; s >= 0; s--) {
            kaannettysana = kaannettysana + "" +sana.charAt(s);
        }
        return kaannettysana;

    }

    public boolean onkoPalindromi (String sananen){
        String palindromi = sananKaantaminen(sananen);
        if (sananen.equalsIgnoreCase(palindromi)){
            return true;
        }
        return false;
    }

    public boolean onkoAnagrammi (String sana1, String sana2){
        List<Character> kirjaimet1 = new ArrayList<>();
        List<Character> kirjaimet2 = new ArrayList<>();

        for (int i = 0; i<sana1.length();i++){
            kirjaimet1.add(sana1.charAt(i));
        }

        for (int i = 0; i<sana2.length();i++){
            kirjaimet2.add(sana2.charAt(i));
        }

        Collections.sort(kirjaimet1);
        Collections.sort(kirjaimet2);
        System.out.println(kirjaimet1);
        System.out.println(kirjaimet2);

        if (sana1.length() == sana2.length()){                      // onko sanojen pituus sama kts. viimeinen kommentti
            for (int i = 0; i< sana2.length();i++){                 // sanan pituuden verran luuppia
                if (kirjaimet1.get(i).equals(kirjaimet2.get(i))){   // onko aakkostetut kirjaimet samat
                }else{                                              // jos on, jatka seuraavaan kirjaimeen
                    return false;                                   // jos ei, palauta false
                }
            }
            return true;                                            // jos kaikki kirjaimet samat, palauta true
        }
        return false;                                               // jos sanat eri mittaiset, palauta false
    }



}
