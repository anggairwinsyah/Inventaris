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
public class Inventaris {
    String Gedung;
    String Ruang;
    int JlhKursi;
    int JlhPapantulis;
    int JlhPintu;
    int JlhJendela;
    int PRuang;
    int LRuang;
        
    void setGedung (String Gedung){
        this.Gedung=Gedung;
    }
    String getGedung(){
        return this.Gedung;
    }
    void setRuang (String Ruang){
        this.Ruang=Ruang;
    }
    String getRuang(){
        return this.Ruang;
    }
    void setJlhKursi (int JlhKursi){
        this.JlhKursi=JlhKursi;
    }
    int getJlhKursi(){
        return this.JlhKursi;
    }
    void setJlhPapantulis (int JlhPapantulis){
        this.JlhPapantulis=JlhPapantulis;
    }
    int getJlhPapantulis(){
        return this.JlhPapantulis;
    }
    void setJlhPintu (int JlhPintu){
        this.JlhPintu=JlhPintu;
    }
    int getJlhPintu(){
        return this.JlhPintu;
    }
    void setJlhJendela (int JlhJendela){
        this.JlhJendela=JlhJendela;
    }
    int getJlhJendela(){
        return this.JlhJendela;
    }
    void setPRuang (int PRuang){
        this.PRuang=PRuang;
    }
    int getPRuang(){
        return this.PRuang;
    }
    void setLRuang (int LRuang){
        this.LRuang=LRuang;
    }
    int getLRuang(){
        return this.LRuang;
    }
}