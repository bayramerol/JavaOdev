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

public class Hoca extends Insan implements HocaInterface {

    private String str;
    private String inputString;
    @Override
    public void dersEkle(String hocaid, String dersadi) throws IOException {

        File file = new File("Dersler.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        str = hocaid + " " + dersadi + "\n";
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();
    }

    @Override
    public void dersSil(String hocaid, String dersadi) throws IOException {

        File file = new File("Dersler.txt");

        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);      
        str = hocaid + " " + dersadi;
        String line;
        inputString = "";
        while ((line = bReader.readLine()) != null) {

            if (line.contains(str) != true) {
                inputString+= line + "\n";
            }

        }
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(inputString);
        bReader.close();
        bWriter.close();

    }
    

}
