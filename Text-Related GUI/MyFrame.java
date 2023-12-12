import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame()
    {
        getContentPane().setLayout(null);
        setTitle("Name and Age");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

      //JLabel
        JLabel nameLable = new JLabel("Name:");
        nameLable.setFont(new Font("Arial",Font.PLAIN,15));
        nameLable.setSize(300,30);
        nameLable.setLocation(50,20);
        add(nameLable);

      //JTextField
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial",Font.PLAIN,15));
        nameTextField.setSize(300,30);
        nameTextField.setLocation(200,20);
        add(nameTextField);

      // JTextArea
        JTextArea resultsText = new JTextArea();
        resultsText.setFont(new Font("Arial",Font.PLAIN,15));
        resultsText.setSize(300,100);
        resultsText.setLocation(150,230);
        resultsText.setLineWrap(true);
        add(resultsText);

      //JButton
        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial",Font.PLAIN, 15));
        submitButton.setSize(100,20);
        submitButton.setLocation(150,150);
        add(submitButton);

      // JCheckBox
        JCheckBox checkBox = new JCheckBox("Accept Terms.");
        checkBox.setFont(new Font("Arial",Font.PLAIN,15));
        checkBox.setSize(250,20);
        checkBox.setLocation(145,190);
        add(checkBox);

      //JRadioButton
        JRadioButton male = new JRadioButton("Male");
        male.setFont(new Font("Arial",Font.PLAIN,15));
        male.setSelected(true);
        male.setSize(75,20);
        male.setLocation(200,100);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Arial",Font.PLAIN,15));
        female.setSelected(false);
        female.setSize(80,20);
        female.setLocation(275,100);
        add(female);

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

      //JComboBox
        String[] course = {"CT","ET","CS"};
        JComboBox courseCombo = new JComboBox(course);
        courseCombo.setSize(90,20);
        courseCombo.setLocation(200,70);
        add(courseCombo);
    }
}
