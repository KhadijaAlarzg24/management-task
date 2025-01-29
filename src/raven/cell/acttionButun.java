/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.cell;
import java.awt.geom.Ellipse2D.Double;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author pc
 */
public class acttionButun  extends JButton {
    
   private boolean mousePress;

    public acttionButun() {
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                mousePress = true;
            }

            public void mouseReleased(MouseEvent me) {
                mousePress = false;
            }
        });
    }


     protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (g instanceof Graphics2D) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int width = getWidth();
            int height = getHeight();
            int size = Math.min(width, height);
            int x = (width - size) / 2;
            int y = (height - size) / 2;

            if (mousePress) {
                g2.setColor(new Color(199, 199, 199)); // Set gray for pressed state
            } else {
                g2.setColor(Color.yellow); // Set yellow for non-pressed state
            }

            g2.fill(new Ellipse2D.Double(x, y, size, size));
        }
    }
}