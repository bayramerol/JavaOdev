/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaodev;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaOdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File notlarFile = new File("Notlar.txt");
        if (!notlarFile.exists()) {
            notlarFile.createNewFile();
        }
        File ogrencilerFile = new File("Ogrenciler.txt");
        if (!ogrencilerFile.exists()) {
            ogrencilerFile.createNewFile();
        }

        File hocalarFile = new File("Hocalar.txt");
        if (!hocalarFile.exists()) {
            hocalarFile.createNewFile();
        }

        File derslerFile = new File("Dersler.txt");
        if (!derslerFile.exists()) {
            derslerFile.createNewFile();
        }

        Scanner scan = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int k = 0;
        Ogrenci ogrenci = new Ogrenci();
        Hoca hoca = new Hoca();
        Not notSinif = new Not();
        String id;
        String adi;
        String soyadi;
        String not;

        System.out.println(
                "Ogrenci Otomasyon Sistemine Hosgeldiniz.");
        System.out.print(
                "Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
        while (true) {
            i = scan.nextInt();
            switch (i) {

                case 1:
                    //ogrenci islemleri
                    System.out.println("Ogrenci Eklemek icin: 1 \nOgrenci Guncellemek icin: 2 \nOgrenci Silmek icin: 3 \n"
                            + "Ogrenci notu girmek icin: 4 \nOgrenci notu guncellemek icin: 5 \n"
                            + "Ogrenci notu silmek icin: 6 \nOgrencinin istenen ders notunu listelemek icin:7 \n"
                            + "Ogrenci istenen dersinin not ortalamasini listelemek icin: 8 \n"
                            + "Bir ust menu icin 9 ye basiniz..\n");
                    j = scan.nextInt();
                    switch (j) {
                        case 1:
                            //ogrenci ekleme

                            System.out.println("Ogrenci id giriniz.");
                            id = scan.next();
                            ogrenci.setId(id);
                            System.out.println("Ogrenci adi giriniz.");
                            adi = scan.next();
                            ogrenci.setIsim(adi);
                            System.out.println("Ogrenci soyadi giriniz.");
                            soyadi = scan.next();
                            ogrenci.setSoyisim(soyadi);
                            ogrenci.Ekle("Ogrenciler.txt", id, adi, soyadi);
                            System.out.println("Ogrenci Basari ile eklendi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 2:
                            //ogrenci guncelleme

                            System.out.println("Guncellenecek Ogrenci id giriniz.");
                            id = scan.next();
                            ogrenci.setId(id);
                            System.out.println("Guncel Ogrenci adi giriniz.");
                            adi = scan.next();
                            ogrenci.setIsim(adi);
                            System.out.println("Guncel Ogrenci soyadi giriniz.");
                            soyadi = scan.next();
                            ogrenci.setSoyisim(soyadi);
                            ogrenci.Guncelle("Ogrenciler.txt", id, adi, soyadi);
                            System.out.println("Ogrenci Basari ile guncellendi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 3:
                            //ogrenci silme

                            System.out.println("Ogrenci id giriniz.");
                            id = scan.next();
                            ogrenci.setId(id);
                            System.out.println("Ogrenci adi giriniz.");
                            adi = scan.next();
                            ogrenci.setIsim(adi);
                            System.out.println("Ogrenci soyadi giriniz.");
                            soyadi = scan.next();
                            ogrenci.setSoyisim(soyadi);
                            ogrenci.Sil("Ogrenciler.txt", id, adi, soyadi);
                            System.out.println("Ogrenci Basari ile silindi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 4:
                            //ogrenci notu girme

                            System.out.println("Ogrenci id giriniz.");
                            id = scan.next();
                            ogrenci.setId(id);
                            System.out.println("Ders adi giriniz.");
                            adi = scan.next();
                            ogrenci.setIsim(adi);
                            System.out.println("Sinav adi giriniz.");
                            //soyadi burada sinav adi yerine kullanildi
                            soyadi = scan.next();
                            ogrenci.setSoyisim(soyadi);
                            System.out.println("Sinav notu giriniz.");
                            not = scan.next();
                            ogrenci.setNot(not);
                            ogrenci.notEkle(id, adi, soyadi, not);
                            System.out.println("Not Basari ile eklendi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 5:
                            //ogrenci not guncelle

                            System.out.println("Ogrenci id giriniz.");
                            id = scan.next();
                            ogrenci.setId(id);
                            System.out.println("Ders adi giriniz.");
                            adi = scan.next();
                            ogrenci.setIsim(adi);
                            System.out.println("Sinav adi giriniz.");
                            //soyadi burada sinav adi yerine kullanildi
                            soyadi = scan.next();
                            ogrenci.setSoyisim(soyadi);
                            System.out.println("Sinav notu giriniz.");
                            not = scan.next();
                            ogrenci.setNot(not);
                            ogrenci.notGuncelle(id, adi, soyadi, not);
                            System.out.println("Not Basari ile guncellendi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 6:
                            //ogrenci not silme

                            System.out.println("Ogrenci id giriniz.");
                            id = scan.next();
                            ogrenci.setId(id);
                            System.out.println("Ders adi giriniz.");
                            adi = scan.next();
                            ogrenci.setIsim(adi);
                            System.out.println("Sinav adi giriniz.");
                            //soyadi burada sinav adi yerine kullanildi
                            soyadi = scan.next();
                            ogrenci.setSoyisim(soyadi);
                            System.out.println("Sinav notu giriniz.");
                            not = scan.next();
                            ogrenci.setNot(not);
                            ogrenci.notSil(id, adi, soyadi, not);
                            System.out.println("Not Basari ile silindi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 7:
                            //ogrenci istenen notu listeleme

                            System.out.println("Ogrenci id giriniz.");
                            id = scan.next();
                            ogrenci.setId(id);
                            System.out.println("Ders adi giriniz.");
                            adi = scan.next();
                            ogrenci.setIsim(adi);
                            System.out.println("Sinav adi giriniz.");
                            //soyadi burada sinav adi yerine kullanildi
                            soyadi = scan.next();
                            ogrenci.setSoyisim(soyadi);
                            System.out.println(notSinif.Goster(id, adi, soyadi));
                            System.out.println("Not Basari ile gosterildi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 8:
                            //ogrenci not ortlamasi listeleme
                            System.out.println("Ogrenci id giriniz.");
                            id = scan.next();
                            ogrenci.setId(id);
                            System.out.println("Ders adi giriniz.");
                            adi = scan.next();
                            ogrenci.setIsim(adi);
                            System.out.println(notSinif.Ortalama(id, adi));
                            System.out.println("Not Basari ile gosterildi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 9:
                            //ust menuye don
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        default:
                            System.out.println("Yanlis deger girdiniz");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                    }
                    break;
                case 2:
                    //hoca islemleri
                    System.out.println("Hoca Eklemek icin: 1 \nHoca Guncellemek icin: 2 \nHoca Silmek icin: 3 \n"
                            + "Hocaya ders eklemek icin: 4 \nHocadan ders silmek icin: 5 \n"
                            + "Bir ust menu icin 9 ye basiniz..\n");
                    k = scan.nextInt();
                    switch (k) {
                        case 1:
                            //Hoca ekleme

                            System.out.println("Hoca id giriniz.");
                            id = scan.next();
                            hoca.setId(id);
                            System.out.println("Hoca adi giriniz.");
                            adi = scan.next();
                            hoca.setIsim(adi);
                            System.out.println("Hoca soyadi giriniz.");
                            soyadi = scan.next();
                            hoca.setSoyisim(soyadi);
                            hoca.Ekle("Hocalar.txt", id, adi, soyadi);
                            System.out.println("Hoca Basari ile eklendi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 2:
                            //Hoca guncelleme

                            System.out.println("Guncellenecek Hoca id giriniz.");
                            id = scan.next();
                            hoca.setId(id);
                            System.out.println("Guncel Hoca adi giriniz.");
                            adi = scan.next();
                            hoca.setIsim(adi);
                            System.out.println("Guncel Hoca soyadi giriniz.");
                            soyadi = scan.next();
                            hoca.setSoyisim(soyadi);
                            hoca.Guncelle("Hocalar.txt", id, adi, soyadi);
                            System.out.println("Hoca Basari ile guncellendi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 3:
                            //Hoca silme

                            System.out.println("Hoca id giriniz.");
                            id = scan.next();
                            hoca.setId(id);
                            System.out.println("Hoca adi giriniz.");
                            adi = scan.next();
                            hoca.setIsim(adi);
                            System.out.println("Hoca soyadi giriniz.");
                            soyadi = scan.next();
                            hoca.setSoyisim(soyadi);
                            hoca.Sil("Hocalar.txt", id, adi, soyadi);
                            System.out.println("Hoca Basari ile silindi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 4:
                            // Hocaya ders ekleme
                            System.out.println("Hoca id giriniz.");
                            id = scan.next();
                            hoca.setId(id);
                            System.out.println("Ders adi giriniz.");
                            //adi burda ders adi olarak kullanildi.
                            adi = scan.next();
                            hoca.setIsim(adi);
                            hoca.dersEkle(id, adi);
                            System.out.println("Ders Basari ile eklendi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        case 5:
                            //Hocadan ders silme
                            System.out.println("Hoca id giriniz.");
                            id = scan.next();
                            hoca.setId(id);
                            System.out.println("Ders adi giriniz.");
                            //adi burda ders adi olarak kullanildi.
                            adi = scan.next();
                            hoca.setIsim(adi);
                            hoca.dersSil(id, adi);
                            System.out.println("Ders Basari ile silindi");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");

                            break;
                        case 9:
                            //ust menuye don
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                        default:
                            System.out.println("Yanlis deger girdiniz");
                            System.out.println("Otomatik olarak ust menuye yonlendirildiniz..");
                            System.out.print("Ogrenci islemleri icin: 1 e basiniz..\nOgretim gorevlisi islemleri icin: 2 ye basiniz..\n");
                            break;
                    }
                    break;
                default:
                    System.out.println("Yanlis deger girdiniz. Lutfen tekrar deger giriniz..");
                    break;

            }

        }
    }

}
