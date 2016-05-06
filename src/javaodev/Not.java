/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaodev;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Not extends Insan{

    private String str;
    private String sonuc;
    private String puanString;
    private Integer ortalama;
    private int i;
    private int puan;
    private int son_satir;
    private String[] dStrings = new String[4];

    public String Goster(String ogrenciid, String dersadi, String sinavadi) throws IOException {

        File file = new File("Notlar.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);

        str = ogrenciid + " " + dersadi + " " + sinavadi;
        String line;
        sonuc = "";
        i = 0;
        while ((line = bReader.readLine()) != null) {

            if (line.contains(str)) {
                sonuc = line;
                i = 1;
            } else if (i != 1) {
                sonuc = "Sonuc bulunamadi.";
            }
        }
        return sonuc;
    }

    public String Ortalama(String ogrenciid, String dersadi) throws IOException {

        File file = new File("Notlar.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);

        str = ogrenciid + " " + dersadi;
        String line;
// ogrenciid dersadi sinavadi sinavnotu /n
// ogrenciid dersadi sinavadi 100 /n
        sonuc = "";
        puanString = "";
        puan = 0;
        ortalama = 0;
        i = 0;
        son_satir = 0;
        while ((line = bReader.readLine()) != null) {

            if (line.contains(str)) {
                i++;
                dStrings = line.split(" ");
                puanString = dStrings[3];
                //son_satir = line.length();
                //puanString = line.substring(son_satir - 3, son_satir);
                puan = Integer.parseInt(puanString);
                ortalama += puan;

            } else {

                sonuc = "Sonuc bulunamadi.";
            }
        }
        if (ortalama != 0) {

            ortalama = ortalama / i;
            sonuc = ortalama.toString();
        }

        return sonuc;

    }

}
