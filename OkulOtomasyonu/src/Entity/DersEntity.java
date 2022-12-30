/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author MERVAN
 */
public class DersEntity extends Insan{
    
    private int kredi;

    

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }
    
    @Override
    public String toString() {
        return this.getId()+" "+this.getAd()+" "+this.getKredi();
    }
    
            
    
}
