package electricity.billing.system;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Customer_Details extends JFrame {
    Choice searchMeterCho, searchNameCho;
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

            table.setModel(DbUtils.);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        setSize(700, 500);
        setLocation(400, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Customer_Details();
    }
}
