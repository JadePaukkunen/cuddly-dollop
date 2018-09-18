package fi.academy.Sunnuntai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kontinkieli {

    List<String> vokaalit = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "y", "å", "ä", "ö"));


    public void konttiGeneraattori(String lause){
        List<String> alut = new ArrayList<>();
        List<String> loput = new ArrayList<>();
        String[] sanat= lause.split(" ");

        for(String s:sanat){
            int a=0;
            int v=0;
            while (a<s.length()) {
                if (!vokaalit.contains(""+s.charAt(a))) {
                    alut.add("" + s.charAt(a));
                    a++;
                }
                if (vokaalit.contains(""+s.charAt(a))){
                    alut.add("" + s.charAt(a));
                    a++;
                    v=a;
                    break;
                }

            }
            while (v<s.length()){
                loput.add("" + s.charAt(v));
                v++;
            }

            String alku = String.join("", alut);
            String loppu = String.join("", loput);

            System.out.println("ko"+loppu+" "+alku+"ntti");
            alut.clear();
            loput.clear();

        }



    }
    public void konttiKaantaja(String sanajono){
        List<String> alut = new ArrayList<>();
        List<String> loput = new ArrayList<>();


        String[] ketjut= sanajono.split(" ");
        System.out.println(ketjut);





    }
}
