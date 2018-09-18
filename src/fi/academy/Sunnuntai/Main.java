package fi.academy.Sunnuntai;

public class Main {
    public static void main(String[] args) {


        Merkkijonojenkasittelya merkit = new Merkkijonojenkasittelya();
        Kontinkieli kontti = new Kontinkieli();
//        System.out.println(merkit.sananKaantaminen("hevonen"));
//        System.out.println(merkit.onkoPalindromi("saippuakauppias"));
//        System.out.println(merkit.onkoPalindromi("kissa"));
//        System.out.println(merkit.onkoAnagrammi("sisko", "kana"));
//        System.out.println(merkit.onkoAnagrammi("silta", "atlis"));
//        System.out.println(merkit.onkoAnagrammi("kissa", "missa"));
        kontti.konttiGeneraattori("traktori vektori kreemi presidentti");
        kontti.konttiKaantaja("koktori trantti koktori ventti koemi krentti kosidentti prentti");
    }
}
