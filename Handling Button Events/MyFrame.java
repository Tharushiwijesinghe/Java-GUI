import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class MyFrame extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN =150;
    private static final int FRAME_Y_ORIGIN =250;

    private final JButton cancelBttn;
    private final JButton okBttn;

    public MyFrame(){
       Container contentPane = getContentPane();

    setSize(FRAME_WIDTH,FRAME_HEIGHT);
    setResizable(false);
    setTitle("Programme JButtonFrame");
    setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

    contentPane.setLayout(new FlowLayout());

    okBttn = new JButton("OK");
    contentPane.add(okBttn);

    cancelBttn = new JButton("CANCEL");
    contentPane.add(cancelBttn);

    cancelBttn.addActionListener(this);
    okBttn.addActionListener(this);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

//    public void actionPerformed(ActionEvent event)
//    {
//       JButton clickedButton = (JButton) event.getSource();
//       String buttonText = clickedButton.getText();
//       setTitle("You clicked" + buttonText);
//    }


    @Override
    public void actionPerformed(ActionEvent event) {
       JButton clickedButton = (JButton) event.getSource();
       String buttonText = clickedButton.getText();
       setTitle("You clicked" + buttonText);
    }
 }
