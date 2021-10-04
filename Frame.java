package Project.Virus;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Frame() {

        ImageIcon imageIcon = new ImageIcon("logo_lock.png");

        JLabel label = new JLabel();
        label.setText("Your Computer Has VIRUS");
        label.setBounds(15,4,350,100);
        label.setIcon(imageIcon);
        label.setOpaque(true);
        label.setVisible(true);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("WARNING");
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);


        this.add(label);
    }


}
