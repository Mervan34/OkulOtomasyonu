package Guıaction;

import GUI.MainWindow;
import GUI.OgrenciWindow;
import GUI.OgretmenWindow;
import GUI.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainwindowaction implements ActionListener{
    MainWindow m;
    panel p;

    public mainwindowaction(MainWindow m) {
        this.m = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==m.getOgrencibtn()){
           p= new OgrenciWindow ();
           m.getPanel().setVisible(false);
               m.getPanel().removeAll();
            m.getPanel().add(p.getPanel());

            m.getPanel().setVisible(true);

            m.getPanel().repaint(); 
       }
       
       
           if(e.getSource()==m.getÖgrtbtn()){
           p= new OgretmenWindow ();
           m.getPanel().setVisible(false);
               m.getPanel().removeAll();
            m.getPanel().add(p.getPanel());

            m.getPanel().setVisible(true);

            m.getPanel().repaint(); 
       }
    }
}