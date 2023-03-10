/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OgrenciDAO extends DAOAbstract implements InterfacesDAO {
    
    
    @Override
    public boolean sifreKontrol(String dosya, String str) {

        FileReader fr = null;
        try {
            File f = new File(dosya);
            if (!f.exists()) {
                try {
                    f.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(OgrenciDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }   fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            str = str + "&";
            String templine = "";
            try {
                while ((templine = br.readLine()) != null) {
                    if (templine.contains(str)) {
                        return true;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(OgrenciDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(OgrenciDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OgrenciDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(OgrenciDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;

    }
    
    

}
