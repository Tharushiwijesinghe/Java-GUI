import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class marks extends JFrame{
    private JPanel mpanel;
    private JLabel marks;
    private JLabel stid;
    private JTextField id;
    private JLabel stname;
    private JTextField name;
    private JLabel ca;
    private JTextField c;
    private JLabel theory;
    private JTextField t;
    private JLabel practical;
    private JTextField p;
    private JButton view;
    private JButton save;

    public marks() {
        setContentPane(mpanel);
        setVisible(true);
        setSize(500,500);
        setLocation(30,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View();
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopmarks","root","1234");
                    String sql = "INSERT INTO oopstmrks(stid,stname,ca,theory,practical) VALUES (?,?,?,?,?)";
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1,id.getText());
                    st.setString(2,name.getText());
                    st.setInt(3,Integer.parseInt(c.getText()));
                    st.setInt(4,Integer.parseInt(t.getText()));
                    st.setInt(5,Integer.parseInt(p.getText()));
                    st.executeUpdate();
                    st.close();
                    con.close();
                    JOptionPane.showConfirmDialog(marks,"connection successuful","information",JOptionPane.INFORMATION_MESSAGE);

                } catch (ClassNotFoundException ex) {
                    JOptionPane.showConfirmDialog(marks,"jdbc connection unsuccessuful","error",JOptionPane.ERROR_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showConfirmDialog(marks,"database connection unsuccessuful","error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }



}
