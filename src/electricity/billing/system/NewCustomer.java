package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class NewCustomer extends JFrame {
    JLabel heading, customerName, meterNum;
    TextField nameText, meterNumText;
    NewCustomer(){
        super("New Customer");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(252, 186, 3));
        add(panel);

        heading = new JLabel("New Customer");
        heading.setBounds(100,10,200,20);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(heading);

        customerName = new JLabel("New Customer");
        customerName.setBounds(50,80,100,20);
        panel.add(customerName);

        nameText = new TextField();
        nameText.setBounds(180, 80, 150, 20);
        panel.add(nameText);

        meterNum = new JLabel("Meter Number");
        meterNum.setBounds(50, 120, 100, 20);
        panel.add(meterNum);

        meterNumText = new TextField();
        meterNumText.setBounds(180, 120, 150, 20);
        panel.add(meterNumText);

        setSize(700, 500);
        setLocation(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}
