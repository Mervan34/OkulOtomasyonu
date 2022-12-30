/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author MERVAN
 */
import Guıaction.OgretmenAction;
import Guıaction.mainwindowaction;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class OgretmenWindow implements panel{
    
    private JPanel panel;
    private JButton btn;
    private JLabel Baslık;
    private JLabel l1,l2;
    private JTextField t1;
    private JPasswordField pass;
    

    public JPasswordField getPass() {
        if(this.pass==null){
            pass=new JPasswordField();
            pass.setBounds(160, 160, 200, 40);
        
        }
        return pass;
    }

    public void setPass(JPasswordField pass) {
        this.pass = pass;
    }

    
    public JButton getBtn() {
        if(this.btn==null){
            btn=new JButton("Giriş Yap");
            btn.setBounds(200, 250, 100, 40);
            this.btn.addActionListener( new OgretmenAction(this));
        }
        return btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }

   

    public JTextField getT1() {
        if(this.t1==null){
            t1=new JTextField();
            t1.setBounds(160, 100, 200, 40);
        
        }
        return t1;
    }

    public void setT1(JTextField t1) {
        this.t1 = t1;
    }
/*
    public JTextField getT2() {
        
       if(this.t2==null){
            t2=new JTextField();
            t2.setBounds(160, 160, 200, 40);
        
        }
        return t2;
    }

    public void setT2(JTextField t2) {
        this.t2 = t2;
    }

*/


    public JLabel getL1() {
        if(this.l1==null){
            l1=new JLabel("Kullanıcı Adı");
            l1.setBounds(50, 100, 100, 40);
        
        }
        return l1;
    }

    public void setL1(JLabel l1) {
        this.l1 = l1;
    }
    
    public JLabel getL2() {
        
        if(this.l2==null){
            l2=new JLabel("Şifre");
            l2.setBounds(50, 160, 100, 40);
        
        }
        return l2;
    }
    
    public void setL2(JLabel l2) {
        this.l2 = l2;
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
            this.getPanel().add(this.getL1());
            this.getPanel().add(this.getL2());
        
            this.getPanel().add(this.getT1());
            this.getPanel().add(this.getPass());
           
            this.getPanel().add(this.getBtn());

            
            this.panel.setBackground(Color.CYAN);
            panel.setLayout(null);
        }
        
        return panel;
    }
    
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }



    public JLabel getBaslık() {
        
        if(this.Baslık==null){
            Baslık=new JLabel("Yeni Pencere");
            Baslık.setBounds(200, 50, 250, 40);
        }
        return Baslık;
    }
    
    public void setBaslık(JLabel Baslık) {
        this.Baslık = Baslık;
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

