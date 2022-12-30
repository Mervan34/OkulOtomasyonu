/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author MERVAN
 */
public class OgrenciIslemleriWindow implements panel{
    
    private JPanel panel;
    private JTable table1,table2;
    private JScrollPane pane;
    private JLabel label1,label2;



    public JLabel getLabel1() {
        if(this.label1==null){
            label1=new JLabel("DERS PROGRAMI");
            label1.setBounds(180, 15, 150, 20);
        
        }
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }
    
    
        
    public JLabel getLabel2() {
        if(this.label2==null){
            label2=new JLabel("DERS KREDİLERİ");
            label2.setBounds(180, 300, 150, 20);
        
        }
        
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }



    public JScrollPane getPane() throws IOException{
        if(this.pane==null){
            this.pane = new JScrollPane(this.getList());
            this.pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            this.pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            this.pane.setBounds(160, 370, 300, 140);
            pane=new JScrollPane(table1);
            
            
        
        }
        return pane;
    }

    public void setPane(JScrollPane pane) {
        this.pane = pane;
    }

  



    public JTable getTable1() {

        String[][] veri = {{"PAZARTESİ","NESNE YÖNELİK PRG","PROGRAM YAPISI "},
                            {"SALI","VERİ YAPILARI","NESNE YÖNELİK PRG"},
                            {"ÇARŞAMBA","OLASILI VE İSTATİSTİK","-"},
                            {"PERŞEMBE","VERİ YAPILARI","SAYISAL ANALİZ"},
                            {"CUMA","PROGRAM YAPISI","-"}};
        
        String[] baslik = {"GÜN","DERS","NOT"};
        table1 =new JTable(veri,baslik);
        table1.setBounds(30, 40, 400, 200);
        
        pane =new JScrollPane(table1);
        
        
        return table1;
    }

    public void setTable1(JTable table1) {
        this.table1 = table1;
    }
    
    public JTable getTable2() {
        
        String[][] veri1 ={{"VERİ YAPILARI","6"},
                           {"OLASILI VE İSTATİSTİK","4"},
                           {"PROGRAM YAPISI","5"},
                           {"NESNE YÖNELİK PROG","6"},
                           {"SAYISAL ANALİZ","4"},
        
        
        };
        String [] baslik1 ={"ders","kredi"};
        
        table2=new JTable(veri1,baslik1);
        table2.setBounds(30, 320, 400, 200);
        
        return table2;
    }

    public void setTable2(JTable table2) {
        this.table2 = table2;
    }
    
        public JPanel getPanel() {
            if(this.panel==null){
                panel=new JPanel();
                panel.setSize(600,600);
                
                this.getPanel().add(getLabel1());
                this.getPanel().add(getLabel2());
                this.getPanel().add(getTable1());
                this.getPanel().add(getTable2());
                try {
                    this.getPanel().add(this.getPane());
                } catch (IOException ex) {
                    Logger.getLogger(OgrenciIslemleriWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.panel.setBackground(Color.ORANGE);
                this.panel.setLayout(null);
                
            
            }
        
          
        
        
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    private Component getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
