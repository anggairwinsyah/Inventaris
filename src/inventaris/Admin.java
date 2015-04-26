/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventaris;

/**
 *
 * @author ANGGA IRWINSYAH
 */
public class Admin {
    Inventaris a = new Inventaris();
    
    void insertData(){
        a.setGedung("GKB III");
        a.setRuang("6.12");
        a.setJlhKursi(40);
        a.setJlhPapantulis(1);
        a.setJlhPintu(2);
        a.setJlhJendela(6);
        a.setPRuang(7);
        a.setLRuang(5);
    }
    
       
    void cetakData(){
        System.out.println("=======================================================");
        System.out.println("--------------------- DATA KELAS ----------------------");
        System.out.println("=======================================================");
        System.out.println("Gedung                  : "+a.getGedung());
        System.out.println("Ruang                   : "+a.getRuang());
        System.out.println("Jumlah Kursi            : "+a.getJlhKursi());
        System.out.println("Jumlah Papan Tulis      : "+a.getJlhPapantulis());
        System.out.println("Jumlah Pintu            : "+a.getJlhPintu());
        System.out.println("Jumlah Jendela          : "+a.getJlhJendela());
        System.out.println("Panjang Ruangan (meter) : "+a.getPRuang());
        System.out.println("Lebar Ruangan (meter)   : "+a.getLRuang());
        System.out.println("Luas Ruangan (meter2)   : "+a.getPRuang()*a.getLRuang());
        System.out.println("=======================================================");
    }
}