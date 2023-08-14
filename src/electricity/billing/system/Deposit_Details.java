package electricity.billing.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Deposit_Details extends JFrame implements ActionListener {

    Choice searchMeterCho, searchMonthCho;
    JButton search, print, close;
    JTable table;
    Deposit_Details(){
        super("Deposit Details");
        getContentPane().setBackground(new Color(192, 186, 245));

        JLabel searchMeter = new JLabel("Search by Meter number");
        searchMeter.setBounds(20, 20, 150, 20);
        add(searchMeter);

        searchMeterCho = new Choice();
        searchMeterCho.setBounds(180, 20, 150, 20);
        add(searchMeterCho);

        try{
            Database D = new Database();
            ResultSet resultSet = D.statement.executeQuery("select * from bill");
            while(resultSet.next()){
                searchMeterCho.add(resultSet.getString("meter_no"));
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }

        JLabel searchMonth = new JLabel("Search By Month");
        searchMonth.setBounds(400, 20, 100, 20);
        add(searchMonth);

        searchMonthCho = new Choice();
        searchMonthCho.add("January");
        searchMonthCho.add("February");
        searchMonthCho.add("March");
        searchMonthCho.add("April");
        searchMonthCho.add("May");
        searchMonthCho.add("June");
        searchMonthCho.add("July");
        searchMonthCho.add("August");
        searchMonthCho.add("September");
        searchMonthCho.add("October");
        searchMonthCho.add("November");
        searchMonthCho.add("December");
        searchMonthCho.setBounds(520, 20, 150, 20);
        add(searchMonthCho);

        table = new JTable();
        try{
            Database d = new Database();
            ResultSet resultSet = d.statement.executeQuery("select * from bill");

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
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBackground(Color.white);
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);

        close = new JButton("Close");
        close.setBackground(Color.white);
        close.setBounds(600, 70, 80, 20);
        close.addActionListener(this);
        add(close);

        setSize(700, 500);
        setLocation(400, 200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == search){
            String query_search = "select * from bill where meter_no = '"+searchMeterCho.getSelectedItem()+"' and month = '"+searchMonthCho.getSelectedItem()+"'";

            try{
                Database c = new Database();
                ResultSet resultSet = c.statement.executeQuery(query_search);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        else if (e.getSource() == print) {
            try{
                table.print();
            }
            catch(Exception ev){
                ev.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Deposit_Details();
    }
}
