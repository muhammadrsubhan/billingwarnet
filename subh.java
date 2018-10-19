
package tugas;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
class subh extends JFrame {    
    JLabel lblnama=new JLabel("Nama");
    JTextField txnama=new JTextField(25);    
    JLabel lblbox=new JLabel("No Box");    
    JTextField txbox=new JTextField(2);    
    JLabel lblpaket=new JLabel("Jenis Paket");    
    JRadioButton reguler=new JRadioButton("Reguler");    
    JRadioButton game=new JRadioButton("Game");    
    ButtonGroup billing=new ButtonGroup();    
    JLabel lblbiling=new JLabel("Billing");    
    JCheckBox tiga=new JCheckBox("3 Jam");    
    JCheckBox lima=new JCheckBox("5 Jam");    
    JCheckBox tujuh=new JCheckBox("7 Jam");    
    JButton start=new JButton("START");    
    JTextArea hasil=new JTextArea(); 
 
   subh()    {       
       setTitle("Billing WARNET");
       setLocation(300,100);       
       setSize(300,320);       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
   } 
 
   void KomponenVisual()    
   {       
       getContentPane().setLayout(null);
       getContentPane().add(lblnama);       
       lblnama.setBounds(10,10,80,20);       
       getContentPane().add(txnama);       
       txnama.setBounds(105,10,175,20);       
       getContentPane().add(lblbox);       
       lblbox.setBounds(10,33,80,20);       
       getContentPane().add(txbox);       
       txbox.setBounds(105,33,70,20);       
       getContentPane().add(lblpaket);       
       lblpaket.setBounds(10,56,80,20);       
       billing.add(reguler);       
       billing.add(game);      
       getContentPane().add(reguler);      
       reguler.setBounds(105,56,70,20);       
       getContentPane().add(game); 
       game.setBounds(170,56,70,20);       
       getContentPane().add(lblbiling);       
       lblbiling.setBounds(10,80,70,20);       
       getContentPane().add(tiga);       
       tiga.setBounds(105,80,100,20);       
       getContentPane().add(lima);       
       lima.setBounds(105,103,100,20);       
       getContentPane().add(tujuh);       
       tujuh.setBounds(105,126,100,20);       
       getContentPane().add(start);       
       start.setBounds(10,150,270,20);       
       getContentPane().add(hasil);       
       hasil.setBounds(10,180,270,100);       
       setVisible(true);    
   } 
 
   void AksiReaksi()   
   {
       start.addActionListener(new ActionListener()               
       {
       public void actionPerformed(ActionEvent e)          
       {
       hasil.append(txnama.getText()+"\n");  
       hasil.append(txbox.getText()+"\n");            
       if(reguler.isSelected()==true)             
       {                
hasil.append(reguler.getText()+"\n");            
}             else             {                
hasil.append(game.getText()+"\n");             
} 
 
            if(tiga.isSelected()==true)            
{               
hasil.append(tiga.getText()+"\n");             
}             if(lima.isSelected()==true)             {  
hasil.append(lima.getText()+"\n");             }         
if(tujuh.isSelected()==true)             {           
hasil.append(tujuh.getText()+"\n");             
} 
   }       
       });    
   } 
 
   public static void main(String args[])    {       
       subh e5=new subh();       
       e5.KomponenVisual();       
       e5.AksiReaksi();    
   } 
} 
