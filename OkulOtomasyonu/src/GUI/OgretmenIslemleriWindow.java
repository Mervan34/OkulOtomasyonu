/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author MERVAN
 */
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class OgretmenIslemleriWindow implements panel{
    
    private JPanel panel;
    private JButton ogrenciekle,ogrencisil,ögrencilistele;

    public JButton getOgrenciekle() {
        if(this.ogrenciekle==null){
            ogrenciekle=new JButton("ögrenci ekle");
            ogrenciekle.setBounds(50, 50, 200, 40);
        
        }
        return ogrenciekle;
    }

    public void setOgrenciekle(JButton ogrenciekle) {
        this.ogrenciekle = ogrenciekle;
    }

    public JButton getOgrencisil() {
        if(this.ogrencisil==null){
            ogrencisil=new JButton("ogrenci sil");
            ogrencisil.setBounds(50, 100, 200, 40);
        
        }
        return ogrencisil;
    }

    public void setOgrencisil(JButton ogrencisil) {
        this.ogrencisil = ogrencisil;
    }

    public JButton getÖgrencilistele() {
        
        if(this.ögrencilistele==null){
            ögrencilistele=new JButton("ogrencı listele");
            ögrencilistele.setBounds(50, 150, 200, 40);
        
        }
        return ögrencilistele;
    }

    public void setÖgrencilistele(JButton ögrencilistele) {
        this.ögrencilistele = ögrencilistele;
    }


   


    public JPanel getPanel() {
        if(this.panel==null){
            panel=new JPanel();
            panel.setSize(600,600);
            /*
            this.getPanel().add(this.getBaslık());
            this.getPanel().add(this.getOgretmenbtn());
            this.getPanel().add(this.getOgrencibtn());
            */
            this.getPanel().add(this.getOgrenciekle());
            this.getPanel().add(this.getOgrencisil());
        
            this.getPanel().add(this.getÖgrencilistele());
            

            
            this.panel.setBackground(Color.CYAN);
            panel.setLayout(null);
        }

        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    
     /*
    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel=new JPanel ();
            this.panel.add(this.getGiris());
            
            
            this.panel.setSize(1000, 800);
            this.panel.setVisible(true);
            this.panel.setLayout(null);
            this.panel.setBackground(Color.red);
            
        }
                        
        return panel;
    }

    
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
*/
    
/*    
    public JButton getGiris() {
        if(this.giris==null){
            this.giris=new JButton("Giriş");
            this.giris.setBounds(200, 100, 100, 40);
            this.giris.setBackground(Color.blue);
            this.giris.addActionListener(new MainWindowAction(this));
            
        }
        return giris;
    }

    public void setGiris(JButton giris) {
        this.giris = giris;
    }
    
*/  
    
}


