import javax.naming.StringRefAddr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Month;

public class RegistrationForm extends JFrame implements ActionListener{
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mobile;
    private JTextField tmobile;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gendergp;
    private JLabel dob;
    private JComboBox date;
    private  JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea resultsText;
    private JCheckBox checkbox;
    private JButton submitButton;
    private JButton ResetButton;
    private JTextArea resadd;
    private JLabel res;

    private final String[] dates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private final String[] Month = {"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
    private final String[] years = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
    private Container c;

    public RegistrationForm()
    {
        setTitle("Registration Form");
        setBounds(300,90,900,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(300,30);
        c.add(title);

        name = new JLabel("Name:");
        name.setFont(new Font("Arial",Font.PLAIN,20));
        name.setSize(100,20);
        name.setLocation(100,100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial",Font.PLAIN,15));
        tname.setSize(200,40);
        tname.setLocation(300,100);
        c.add(tname);

        mobile = new JLabel("Mobile:");
        mobile.setFont(new Font("Arial",Font.PLAIN,20));
        mobile.setSize(100,20);
        mobile.setLocation(100,170);
        c.add(mobile);

        tmobile = new JTextField();
        tmobile.setFont(new Font("Arial",Font.PLAIN,15));
        tmobile.setSize(200,40);
        tmobile.setLocation(300,170);
        c.add(tmobile);

        gender = new JLabel("Gender:");
        gender.setFont(new Font("Arial",Font.PLAIN,20));
        gender.setSize(100,20);
        gender.setLocation(100,240);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial",Font.PLAIN,15));
        male.setSelected(true);
        male.setSize(75,20);
        male.setLocation(300,240);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial",Font.PLAIN,15));
        female.setSelected(false);
        female.setSize(100,20);
        female.setLocation(400,240);
        c.add(female);

        gendergp = new ButtonGroup();
        gendergp.add(male);
        gendergp.add(female);

        dob = new JLabel("DOB:");
        dob.setFont(new Font("Arial",Font.PLAIN,20));
        dob.setSize(100,20);
        dob.setLocation(100,310);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial",Font.PLAIN,20));
        date.setSize(70,30);
        date.setLocation(300,310);
        c.add(date);

        month = new JComboBox(Month);
        month.setFont(new Font("Arial",Font.PLAIN,20));
        month.setSize(70,30);
        month.setLocation(370,310);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial",Font.PLAIN,20));
        year.setSize(70,30);
        year.setLocation(440,310);
        c.add(year);

        add = new JLabel("Address:");
        add.setFont(new Font("Arial",Font.PLAIN,20));
        add.setSize(100,20);
        add.setLocation(100,380);
        c.add(add);

        resultsText = new JTextArea();
        resultsText.setFont(new Font("Arial",Font.PLAIN,15));
        resultsText.setSize(200,75);
        resultsText.setLocation(300,380);
        resultsText.setLineWrap(true);
        c.add(resultsText);

        checkbox = new JCheckBox("Accept terms And Conditions.");
        checkbox.setFont(new Font("Arial",Font.PLAIN, 15));
        checkbox.setSize(250,20);
        checkbox.setLocation(200,470);
        c.add(checkbox);

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial",Font.PLAIN, 15));
        submitButton.setSize(100,20);
        submitButton.setLocation(150,520);
        submitButton.addActionListener(this);
        c.add(submitButton);

        ResetButton = new JButton("Reset");
        ResetButton.setFont(new Font("Arial",Font.PLAIN, 15));
        ResetButton.setSize(100,20);
        ResetButton.addActionListener( this);
        ResetButton.setLocation(300,520);
        c.add(ResetButton);

        res = new JLabel("");
        res.setFont(new Font("Arial",Font.PLAIN, 15));
        res.setSize(100,400);
        res.setLocation(150,640);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial",Font.PLAIN,15));
        resadd.setSize(250,400);
        resadd.setLocation(600,30);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    //@Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == submitButton) {
            if(checkbox.isSelected()){
                String data1;
                String data = "Name: " + tname.getText() + "\n"+ "Mobile:" + tmobile.getText() + "\n" ;
                if(male.isSelected())
                    data1 = "Gender: Male" + "\n";
                else data1 = "Gender: Female" + "\n";
                String data2 = "DOB: " + date.getSelectedItem() + "/" +month.getSelectedItem() + "/" +year.getSelectedItem() + "\n";
                String data3 = "Address: " + resultsText.getText();
                resadd.setText((data +data1+data2+data3));
                res.setText("Registration success.");
            }else {
               // tout.setText("");
                resadd.setText("");
                res.setText("Please accept the " + "terms and conditions...");
            }
            } else if (e.getSource()==ResetButton){
                String def = "";
                tname.setText(def);
                add.setText(def);
                tmobile.setText(def);
                res.setText(def);
                submitButton.setSelected(false);
                date.setSelectedIndex(0);
                month.setSelectedIndex(0);
                year.setSelectedIndex(0);
                resadd.setText(def);
            }
        }
}
