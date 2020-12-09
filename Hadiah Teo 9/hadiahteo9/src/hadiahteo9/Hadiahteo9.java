/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahteo9;

/**
 *
 * @author Evelyn Wijaya
 */
import javax.swing.*;
import java.awt.event.*;
public abstract class Hadiahteo9 {

    /**
     * @param args the command line arguments
     */
    private static void createAndShowGUI() {
        // TODO code application logic here
        JFrame frame = new JFrame("I am a Frame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,20,450,200);
        frame.getContentPane().setLayout(null);
        
        JButton butt1 = new JButton("Nama");
        frame.getContentPane().add(butt1);
        butt1.setBounds(20,20,200,20);
        JButton butt2 = new JButton("NIM");
        frame.getContentPane().add(butt2);
        butt2.setBounds(20,60,200,20);
        JButton butt3 = new JButton("Alamat");
        frame.getContentPane().add(butt3);
        butt3.setBounds(20,100,200,20);
        
        Hadiahteo9 app = new Hadiahteo9() {};
        
        app.label1= new JLabel("Nama saya adalah");
        app.label1.setBounds(240,20,200,20);
        frame.getContentPane().add(app.label1);
        app.label2= new JLabel("NIM saya adalah");
        app.label2.setBounds(240,60,200,20);
        frame.getContentPane().add(app.label2);
        app.label3= new JLabel("Alamat saya adalah");
        app.label3.setBounds(240,100,200,20);
        frame.getContentPane().add(app.label3);
        
        
        butt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.actionPerformed1();
            }
        });
        butt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.actionPerformed2();
            }
        });
        butt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.actionPerformed3();
            }
        });
        frame.setVisible(true);
    }
    
    public void actionPerformed1() {
        label1.setText("Faustine Wijaya");
    }
    
    public void actionPerformed2() {
        label2.setText("51018006");
    }
    
    public void actionPerformed3() {
        label3.setText("lompo battang");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                createAndShowGUI();
            }
        });
    }
    JLabel label1,label2,label3;
}
