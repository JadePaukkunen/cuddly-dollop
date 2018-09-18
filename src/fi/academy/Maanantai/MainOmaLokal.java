package fi.academy.Maanantai;

import java.util.Locale;
import java.util.ResourceBundle;

public class MainOmaLokal {
    public static void main(String[] args) {
        Locale englanniksi = new Locale("en");
        Locale suomeksi = new Locale ("fi");
        Locale ruotsiksi = new Locale("sv");
        ResourceBundle rb = ResourceBundle.getBundle("OmaLokal", ruotsiksi);
        System.out.println(rb.getString("kissa"));
    }
}
