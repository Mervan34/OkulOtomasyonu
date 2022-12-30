/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guıaction;

import GUI.MainWindow;
import GUI.OgrenciIslemleriWindow;
import GUI.OgrenciWindow;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author MERVAN
 */
public class OgrenciAction implements ActionListener{
    
    MainWindow m;
    Panel p;  
    OgrenciWindow ow;

    public OgrenciAction(OgrenciWindow ow) {
        this.ow= ow;
        m=new MainWindow();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==ow.getBtn1()){
            
            OgrenciIslemleriWindow p= new OgrenciIslemleriWindow();
            
            ow.getPanel().setVisible(false);
            ow.getPanel().removeAll();
            ow.getPanel().add(p.getPanel());
            ow.getPanel().setVisible(true);
            
            ow.getPanel().repaint();

       }
       
    }
                    
 
    
}
