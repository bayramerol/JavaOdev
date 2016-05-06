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

public abstract class Insan {

    private static String isim;
    private static String soyisim;
    private static String id;
    private static String not;
    private static String inputString1;

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String str;

    public void Ekle(String dosyaadi, String ogrenciid, String ogreciadi, String ogrencisoyadi) throws IOException {

        File file = new File(dosyaadi);
        if (!file.exists()) {
            file.createNewFile();
        }

        str = ogrenciid + " " + ogreciadi + " " + ogrencisoyadi + "\n";
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();

    }

    public void Sil(String dosyaadi, String ogrenciid, String ogreciadi, String ogrencisoyadi) throws IOException {

        File file = new File(dosyaadi);
        //File gecicifile = new File("gecicifile.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);
        //FileWriter fileWriter = new FileWriter(gecicifile, false);
        //BufferedWriter bWriter = new BufferedWriter(fileWriter);
        str = ogrenciid + " " + ogreciadi + " " + ogrencisoyadi;
        String line;
        inputString1 = "";
        while ((line = bReader.readLine()) != null) {

            if (line.contains(str) != true) {
                inputString1 += line + "\n";
                //inputString.add(line);
            }
            //bWriter.write(line);            
        }

        FileWriter fileWriter = new FileWriter(dosyaadi, false);
        //FileOutputStream file2 = new FileOutputStream(dosyaadi);
        //file2.write(inputString.toString().getBytes());
        //file2.write(inputString.toString().getBytes(), 1, inputString.toString().length()-1);
        //file2.write(inputString1.getBytes());
        //file3.flush();
        fileWriter.write(inputString1);
        bReader.close();
        fileWriter.close();
        //bWriter.close();
        //gecicifile.renameTo(file);
    }

    public void Guncelle(String dosyaadi, String ogrenciid, String ogreciadi, String ogrencisoyadi) throws IOException {

        File file = new File(dosyaadi);
        //File gecicifile = new File("gecicifile.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);
        //FileWriter fileWriter = new FileWriter(gecicifile, false);       
        str = ogrenciid + " " + ogreciadi + " " + ogrencisoyadi;
        String line;
        inputString1 = "";
        while ((line = bReader.readLine()) != null) {

            if (line.contains(ogrenciid)) {
                line = str;
            }
            inputString1 += line + "\n";

        }
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(inputString1);

        bReader.close();
        bWriter.close();
    }

}

//public static void deleteLine()
//    {
//        try
//        {
//                BufferedReader file = new BufferedReader(new FileReader("data/line.txt"));
//                String line;
//                String input = "";
//                while ((line = file.readLine()) != null) 
//                {
//                    //System.out.println(line);
//                    if (line.contains("Username:"))
//                    {
//                        line = "";
//                        System.out.println("Line deleted.");
//                    }
//                    input += line + '\n';
//                }
//                FileOutputStream File = new FileOutputStream("data/line.txt");
//                File.write(input.getBytes());
//                file.close();
//                File.close();
//        }
//        catch (Exception e)
//        {
//                System.out.println("Problem reading file.");
//        }
//    }
//
//
//
//public static void removeLines(final File targetFile,
//    final Charset charSet,
//    final Collection<Integer> lineNumbers) throws IOException{
//    final List<String> lines = Files.readLines(targetFile, charSet);
//    // line numbers need to be sorted in reverse.
//    // if they are, you can replace everything from Ordering until )){
//    // with 'lineNumbers){'
//    for(final Integer lineNumber : Ordering
//        .natural()
//        .reverse()
//        .immutableSortedCopy(lineNumbers)){
//        lines.remove(lineNumber.intValue());
//    }
//    Files.write(Joiner.on('\n').join(lines), targetFile, charSet);
//}
