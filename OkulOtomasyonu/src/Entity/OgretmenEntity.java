/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author MERVAN
 */
public class OgretmenEntity extends Insan{

    private String bolum;



    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    
        @Override
    public String toString() {
        return this.getId()+" "+this.getAd()+" "+this.getSoyad()+" "+this.getYas()+" "+this.getBolum();
    }
    
    
}
