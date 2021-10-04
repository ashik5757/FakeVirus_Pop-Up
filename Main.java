package Project.Virus;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Main  {

    public static Frame frame;


    public static int random(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static void main(String[] args)  {



//        Frame frame = new Frame();  //1400,800
//        frame.setBounds(1600,900,300,140);

        for (int i=0; i<=1000; i++) {
            frame = new Frame();  //1400,800
            frame.setBounds(random(1600),random(900),300,140);

            //JOptionPane.showMessageDialog(frame,"Your computer has VIRUS", "Warning",JOptionPane.WARNING_MESSAGE);

        }


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                if (e.getWindow()==frame)
                System.out.println("Closed");

            }
        });









    }

}
