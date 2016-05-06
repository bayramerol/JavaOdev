/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaodev;

import java.io.IOException;


public interface HocaInterface {

    public void dersEkle(String hocaid, String dersadi) throws IOException;

    public void dersSil(String hocaid, String dersadi) throws IOException;

}
