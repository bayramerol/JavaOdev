/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaodev;

import java.io.IOException;


public interface OgrenciInterface {

    public void notEkle(String ogrenciid, String dersadi, String sinavadi, String dersnotu) throws IOException;

    public void notSil(String ogrenciid, String dersadi, String sinavadi, String dersnotu) throws IOException;

    public void notGuncelle(String ogrenciid, String dersadi, String sinavadi, String dersnotu) throws IOException;
}
