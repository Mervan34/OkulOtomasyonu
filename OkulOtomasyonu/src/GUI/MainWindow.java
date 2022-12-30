package GUI;

import Guıaction.mainwindowaction;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author semih
 */
public class MainWindow implements panel {
private JFrame frame;
private JPanel panel;
private JButton ogrencibtn,ögrtbtn;
private  JLabel baslik;


public void ac(){
    this.getFrame();
}

    public JFrame getFrame() {
        if(this.frame==null){
            frame=new  JFrame("Okul Otomasyonu");
            frame.add(this.getPanel());
               this.frame.setContentPane(this.getPanel());
            frame.setSize(600,600);
            frame.setLayout(null);
             this.frame.setLocation(300, 80);
          this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
        }
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }


   

    public JButton getOgrencibtn() {
        if(this.ogrencibtn==null){
            ogrencibtn=new JButton("Ögrenci Girişi");
            ogrencibtn.setBounds(350, 100, 150, 30);
            this.ogrencibtn.addActionListener( new mainwindowaction(this));
        }
        return ogrencibtn;
    }

    public void setOgrencibtn(JButton ogrbtn) {
        
        this.ogrencibtn = ogrbtn;
    }

    public JButton getÖgrtbtn() {
        if(this.ögrtbtn==null){
            ögrtbtn=new JButton("Ögretmen Girişi");
            ögrtbtn.setBounds(120, 100, 150, 30);
             this. ögrtbtn.addActionListener( new mainwindowaction(this));
        }
        return ögrtbtn;
    }

    public void setÖgrtbtn(JButton ögrtbtn) {
        this.ögrtbtn = ögrtbtn;
    }

    public JLabel getBaslik() {
        if(this.baslik==null){
            baslik= new JLabel("OKUL OTOMASYONU");
            baslik.setBounds(230, 50, 250, 40);
            baslik.setForeground(Color.WHITE);
        }
        return baslik;
    }

    public void setBaslik(JLabel baslik) {
        this.baslik = baslik;
    }

    @Override
    public JPanel getPanel() {
             if(this.panel==null){
            panel=new JPanel();
            panel.setSize(600,600);
            this.getPanel().add(this.getBaslik());
            this.getPanel().add(this.getÖgrtbtn());
            this.getPanel().add(this.getOgrencibtn());
            this.panel.setBackground(Color.gray);
            panel.setLayout(null);
        }
        return panel;
    }

 
 public void setPanel(JPanel panel) {
        this.panel = panel;
    }
   
}
