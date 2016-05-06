/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaodev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ogrenci extends Insan implements OgrenciInterface {

    private String str;
    private String inpString;

    @Override
    public void notEkle(String ogrenciid, String dersadi, String sinavadi, String dersnotu) throws IOException {

        File file = new File("Notlar.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        str = ogrenciid + " " + dersadi + " " + sinavadi + " " + dersnotu + "\n";
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();
    }

    public void notSil(String ogrenciid, String dersadi, String sinavadi, String dersnotu) throws IOException {

        File file = new File("Notlar.txt");

        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);
//        FileWriter fileWriter = new FileWriter(gecicifile, false);
//        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        str = ogrenciid + " " + dersadi + " " + sinavadi + " " + dersnotu;
        String line;
        inpString = "";
        while ((line = bReader.readLine()) != null) {

            if (line.contains(str) != true) {
                inpString += line + "\n";
            }
        }
        FileWriter fileWriter = new FileWriter("Notlar.txt", false);
        fileWriter.write(inpString);
        bReader.close();
        fileWriter.close();
    }

    public void notGuncelle(String ogrenciid, String dersadi, String sinavadi, String dersnotu) throws IOException {

        File file = new File("Notlar.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);

        str = ogrenciid + " " + dersadi + " " + sinavadi + " " + dersnotu;
        String line;
        inpString = "";
        while ((line = bReader.readLine()) != null) {

            if (line.contains(ogrenciid) && line.contains(dersadi) && line.contains(sinavadi)) {

                line = str;
            }
            inpString += line + "\n";
        }

        FileWriter fileWriter = new FileWriter("Notlar.txt", false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(inpString);
     
        bReader.close();
        bWriter.close();
    }

}
