package Guıaction;

import GUI.MainWindow;
import GUI.OgrenciWindow;
import GUI.OgretmenIslemleriWindow;
import GUI.OgretmenWindow;
import GUI.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.management.Query.or;


public class OgretmenAction implements ActionListener{
    MainWindow m;
    panel p;
    OgretmenWindow o;
    
    public OgretmenAction(OgretmenWindow o) {
        this.o= o;
        m=new MainWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==o.getBtn()){
            p= new OgretmenIslemleriWindow ();
            o.getPanel().setVisible(false);
            o.getPanel().removeAll();
            o.getPanel().add(p.getPanel());

            o.getPanel().setVisible(true);

            o.getPanel().repaint(); 
       }
       
       
      
    }
}