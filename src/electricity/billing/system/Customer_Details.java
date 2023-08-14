package electricity.billing.system;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Customer_Details extends JFrame {
    Choice searchMeterCho, searchNameCho;
    JButton search, print, close;
    JTable table;
    Customer_Details(){
        super("Customer Details");
        getContentPane().setBackground(new Color(192, 186, 245));

        JLabel searchMeter = new JLabel("Search by Meter number");
        searchMeter.setBounds(20, 20, 150, 20);
        add(searchMeter);

        searchMeterCho = new Choice();
        searchMeterCho.setBounds(180, 20, 150, 20);
        add(searchMeterCho);

        try{
            Database D = new Database();
            ResultSet resultSet = D.statement.executeQuery("select * from newCustomer");
            while(resultSet.next()){
                searchMeterCho.add(resultSet.getString("meter_no"));
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }

        JLabel searchName = new JLabel("Search By Name");
        searchName.setBounds(400, 20, 100, 20);
        add(searchName);

        searchNameCho = new Choice();
        searchNameCho.setBounds(520, 20, 150, 20);
        add(searchNameCho);

        try{
            Database D = new Database();
            ResultSet resultSet = D.statement.executeQuery("select * from newCustomer");
            while(resultSet.next()){
                searchNameCho.add(resultSet.getString("name"));
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }

        table = new JTable();
        try{
            Database d = new Database();
            ResultSet resultSet = d.statement.executeQuery("select * from newCustomer");

            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception e){
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 100, 700, 400);
        scrollPane.setBackground(Color.white);
        add(scrollPane);

        search = new JButton("Search");
        search.setBackground(Color.white);
        search.setBounds(20, 70, 80, 20);
        add(search);

        print = new JButton("Print");
        print.setBackground(Color.white);
        print.setBounds(120, 70, 80, 20);
        add(print);

        close = new JButton("Close");
        close.setBackground(Color.white);
        close.setBounds(600, 70, 80, 20);
        add(close);

        setSize(700, 500);
        setLocation(400, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Customer_Details();
    }
}
