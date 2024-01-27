import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class View extends JFrame{
    private JPanel view;
    private JLabel View;
    private JTable table1;
    private DefaultTableModel tableModel;

    public View(){
        setSize(500,500);
        setLocation(40,100);
        setContentPane(view);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        createtable();
    }

    private void createtable() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopmarks","root","1234");
            String sql = "SELECT * FROM oopstmrks";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            tableModel = new DefaultTableModel();
            table1.setModel(tableModel);

            tableModel.setColumnIdentifiers(new String[]{"stid","stname","ca","theory","practical","total","average"});

            while (rs.next())
            {
                String stid = rs.getString("stid");
                String stname = rs.getString("stname");
                int ca = rs.getInt("ca");
                int theory = rs.getInt("theory");
                int practical = rs.getInt("practical");
                int total = ca + theory + practical;
                int average = total/3;

                Object[] row={
                        stid,
                        stname,
                        theory,
                        practical,
                        total,
                        average
                };
                tableModel.addRow(row);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
