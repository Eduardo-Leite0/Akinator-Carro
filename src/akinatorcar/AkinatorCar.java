/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package akinatorcar;

import javax.swing.JFrame;

/**
 *
 * @author Eduardo
 */
public class AkinatorCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Akinator Car");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new CarrosForms1());
            frame.pack();
            frame.setVisible(true);

            JFrame frame2 = new JFrame("Akinator Car - Forms2");
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.getContentPane().add(new CarrosForms2());
            frame2.pack();
            frame2.setVisible(true);
        });
    }

}
