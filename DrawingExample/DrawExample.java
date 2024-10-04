package DrawingExample;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

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
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    // constructor to make the window
    public DrawExample(){
        // make the main window
        JFrame frame = new JFrame("My game");        // change to the screen has happened
       
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
        // set colour to draw with
        g.setColor(Color.BLACK);
        // adjust outline size
        g2d.setStroke(this.thickerLine);
        // drawing a rectangle
        g.drawRect(mouseX, mouseY, 50, 20);

        // draw all stamped retangles
        for(int i = 0; i < rectangles.size(); i++){
            // take a rectangle from the list
            Rectangle r = rectangles.get(i);
            g.setColor(Color.RED);
            g.fillRect(r.x, r.y, r.width, r.height);
        }
    }


    public void run(){
        // game loop
        while(true){
            // do the things you need to do


            // update the screen
            repaint();
            // wait a little bit
            try{
                Thread.sleep(10);
            }catch(Exception e){

            }
        }
    }





    public static void main(String[] args) {
        DrawExample window = new DrawExample();
        // start the game loop
        window.run();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // make rectangle where I click
        Rectangle r = new Rectangle(e.getX(), e.getY(), 50, 20);
        // add it to the rectangle list
        rectangles.add(r);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.mouseX = e.getX();
        this.mouseY = e.getY();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // make rectangle where I click
        Rectangle r = new Rectangle(e.getX(), e.getY(), 50, 20);
        // add it to the rectangle list
        rectangles.add(r);
        System.out.println(rectangles.size());
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
