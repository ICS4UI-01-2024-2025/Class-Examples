import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Controller implements ActionListener{

    private MainScreen screen;

    public Controller(){
        // create a screen
        this.screen = new MainScreen();
        // tell the screen Controller will handle button presses
        this.screen.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // get which button is pressed
        String command = e.getActionCommand();
        // determine the button
        if(command.equals("up")){
            this.screen.setDescription("up pressed");
        }else if(command.equals("right")){
            this.screen.setDescription("right pressed");
        }else if(command.equals("left")){
            
        }else if(command.equals("down")){
            
        }
    }

    
    public static void main(String[] args) {
        new Controller();
    }

    
}
