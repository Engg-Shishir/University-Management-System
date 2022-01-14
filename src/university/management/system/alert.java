/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author ASUS
 */
public class alert extends JFrame implements  ActionListener {
     JLabel checkMark,close,title,background,head;
     JButton ok;
     String text = "";
    alert(String s,String imgs){
        
        
        background=new JLabel();
        background.setBounds(0,0,500,500);
        background.setLayout(null);
        background.setOpaque(true);
        background.setBackground(new Color(0, 10, 66));
        
        head = new JLabel();
        head.setOpaque(true);
        head.setBounds(0,1,500,50);    
        
        title = new JLabel(s);
        title.setFont(new Font("Arial",Font.BOLD,18));
        title.setBounds(10,5,450,40);
        if(imgs.equals("tik.gif")){ 
            head.setBackground(new Color(0,3,66));
            title.setForeground(Color.white);
        }else{ 
            head.setBackground(new Color(168, 14, 0));
            title.setForeground(Color.black);
        }
        
               
        background.add(head);
        head.add(title);
        
        
        
        
       close = new JLabel();
       close.setBounds(450,10,30,30);
       close.setCursor(new Cursor(Cursor.HAND_CURSOR));
       ImageIcon closeIcon = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/Button/close1.png"));
       Image img = closeIcon.getImage().getScaledInstance(30, 30,Image.SCALE_FAST);
       ImageIcon icon = new ImageIcon(img);
       close.setIcon(icon);
       head.add(close);
        

        
        checkMark = new JLabel();
        checkMark.setBounds(0,0,500,500);
        checkMark.setCursor(new Cursor(Cursor.HAND_CURSOR));
//        Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
//        file.setBorder(border); 
       ImageIcon f = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/"+imgs));
       Image i3f = f.getImage().getScaledInstance(500, 500,Image.SCALE_FAST);
       ImageIcon icc3f = new ImageIcon(i3f);
       checkMark.setIcon(icc3f);
       background.add(checkMark);
       
        
        
        close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                dispose(); 
            }

        });
        
        
        
        add(background);
        
        
        setUndecorated(true);
        setVisible(true);
        setSize(500,500);
        setLocationRelativeTo(null);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
    }
    
    
    public static void main(String[ ] arg){
        new alert("Data Inserted Successfully !","tik.gif").setVisible(true);
    }
}
