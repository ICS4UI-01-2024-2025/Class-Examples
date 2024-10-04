package DrawingExample;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 * DrawExample
 */
public class DrawExample extends JComponent implements MouseMotionListener, MouseListener{

    // class constants
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    // class variables
    private BasicStroke thickerLine = new BasicStroke(4);
    private BasicStroke normalLine = new BasicStroke(1);
    private int mouseX = 0;
    private int mouseY = 0;

    // constructor to make the window
    public DrawExample(){
        // make the main window
        JFrame frame = new JFrame("My Game");
        // make sure you can close the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // show the window
        frame.setVisible(true);

        // set the size of MY window
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // add MY window to the frame
        frame.add(this);
        // set it so we can't resize the window
        frame.setResizable(false);
        // resize the frame to fit the window
        frame.pack();

        // make sure my window listens to the mouse
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    // Overide the paintComponent method
    // make my own version of paintComponent
    @Override
    public void paintComponent(Graphics g){
        // more advanced graphics
        Graphics2D g2d = (Graphics2D)g;
        // clear the window
        g.clearRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g2d.setStroke(this.thickerLine);
        g.drawRect(mouseX, mouseY, 50, 20);
    }





    public static void main(String[] args) {
        DrawExample window = new DrawExample();

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.mouseX = e.getX();
        this.mouseY = e.getY();
        // change to the screen has happened
        // redraw it
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    
}
