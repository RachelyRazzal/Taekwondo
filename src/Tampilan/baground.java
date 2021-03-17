package Tampilan;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SUTI ALAWIYAH
 */
public class baground extends JPanel {
    private Image image;
   
    public baground(){
        image = new ImageIcon(getClass().getResource("/gambar/bgrnd.jpg")).getImage();
        
    }
    
    @Override
    protected void paintComponent (Graphics grphcs) {
        super.paintComponent (grphcs);
        
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(image, 0, 0, getWidth(), getHeight(),null);
        gd.dispose();
        
    }
}
