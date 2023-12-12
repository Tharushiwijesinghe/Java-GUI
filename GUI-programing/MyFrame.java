import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
     private final JButton cancelButton;
     private final JButton okButton;

     public MyFrame(){
         Container contentPane = getContentPane();

         setSize(FRAME_WIDTH,FRAME_HEIGHT);
         setResizable(false);
         setTitle("Program JButton Frame");
         setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

         contentPane.setLayout(new FlowLayout());

         okButton = new JButton("OK");
         contentPane.add(okButton);

         cancelButton = new JButton("CANCEL");
         contentPane.add(cancelButton);

         setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
}
