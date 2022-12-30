/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author MERVAN
 */
public class PersonelEntity extends Insan{
    
    private String gorev;


    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
    
    
    @Override
    public String toString() {
        return this.getId()+" "+this.getAd()+" "+this.getSoyad()+" "+this.getYas()+" "+this.getGorev();
    }
    
    
}
