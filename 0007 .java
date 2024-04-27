package April2024;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Tgl27A{
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Universitas Sulawesi Barat");
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        ImageIcon image = new ImageIcon("src/April2024/Universitas_Sulawesi_Barat.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0x800000));
    }
}
