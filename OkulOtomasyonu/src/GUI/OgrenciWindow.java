/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;


import Guıaction.OgrenciAction;
import Guıaction.OgretmenAction;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class OgrenciWindow implements panel{
    
    private JPanel panel;
    private JButton ogrencibtn,ogretmenbtn,btn1;
    private JLabel Baslık;
    private JLabel l1,l2,l3,l4;
    private JTextField t1,t2,t3;
    
    private JPasswordField pf;

    public JPasswordField getPf() {
        if(this.pf==null){
            pf=new JPasswordField();
            pf.setBounds(160, 280, 200, 40);
        
        }
        return pf;
    }

    public void setPf(JPasswordField pf) {
        this.pf = pf;
    }


    

    /*
    public JButton getBtn() {
        if(this.btn==null){
            btn=new JButton("Giriş Yap");
            btn.setBounds(200, 350, 100, 40);
        
        }
        return btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }
*/

    public JButton getBtn1() {
        if(this.btn1==null){
            btn1=new JButton("Giriş Yap");
            btn1.setBounds(200, 350, 100, 40);
            this.btn1.addActionListener( new OgrenciAction(this));
        
        }
        
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
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

    public JTextField getT3() {
        if(this.t3==null){
            t3=new JTextField();
            t3.setBounds(160, 220, 200, 40);
        
        }
        return t3;
    }

    public void setT3(JTextField t3) {
        this.t3 = t3;
    }
/*
    public JTextField getT4() {
        
        if(this.t4==null){
            t4=new JTextField();
            t4.setBounds(160, 280, 200, 40);
        
        }
        return t4;
    }

    public void setT4(JTextField t4) {
        this.t4 = t4;
    }
*/

    public JLabel getL1() {
        if(this.l1==null){
            l1=new JLabel("Ad");
            l1.setBounds(50, 100, 100, 40);
        
        }
        return l1;
    }

    public void setL1(JLabel l1) {
        this.l1 = l1;
    }

    public JLabel getL2() {
        
        if(this.l2==null){
            l2=new JLabel("SoyAd");
            l2.setBounds(50, 160, 100, 40);
        
        }
        return l2;
    }

    public void setL2(JLabel l2) {
        this.l2 = l2;
    }

    public JLabel getL3() {
        if(this.l3==null){
            l3=new JLabel("ÖğrenciNo");
            l3.setBounds(50, 220, 100, 40);
        
        }
        return l3;
    }

    public void setL3(JLabel l3) {
        this.l3 = l3;
    }

    public JLabel getL4() {
        if(this.l4==null){
            l4=new JLabel("Şifre");
            l4.setBounds(50, 280, 100, 40);
        
        }
        return l4;
    }

    public void setL4(JLabel l4) {
        this.l4 = l4;
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
            this.getPanel().add(this.getL3());
            this.getPanel().add(this.getL4());
            this.getPanel().add(this.getT1());
            this.getPanel().add(this.getT2());
            this.getPanel().add(this.getT3());
            this.getPanel().add(this.getPf());
            this.getPanel().add(this.getBtn1());
            

            this.panel.setBackground(Color.ORANGE);
            panel.setLayout(null);
        }
        
        
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getOgrencibtn() {
        
        if(this.ogrencibtn==null){
            ogrencibtn=new JButton("Ögrenci Girişi");
            ogrencibtn.setBounds(150, 100, 150, 30);
            
        }
        return ogrencibtn;
       
    }

    public void setOgrencibtn(JButton ogrencibtn) {
        this.ogrencibtn = ogrencibtn;
    }

    public JButton getOgretmenbtn() {
        
        if(this.ogretmenbtn==null){
            ogretmenbtn=new JButton("Ögretmen Girişi");
            ogretmenbtn.setBounds(150, 100, 150, 30);
         }
        return ogretmenbtn;
    }

    public void setOgretmenbtn(JButton ogretmenbtn) {
        this.ogretmenbtn = ogretmenbtn;
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
