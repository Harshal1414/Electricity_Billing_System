package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NewCustomer extends JFrame implements ActionListener {
    JLabel heading, customerName, meterNum,meterNumText, address, city, state, email, phone;
    JButton next, cancel;
    TextField nameText, addressText, cityText, stateText, emailText, phoneText;
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

        meterNumText = new JLabel("");
        meterNumText.setBounds(180, 120, 150, 20);
        panel.add(meterNumText);

        address = new JLabel("Address");
        address.setBounds(50, 160, 100, 20);
        panel.add(address);

        addressText = new TextField();
        addressText.setBounds(180, 160, 150, 20);
        panel.add(addressText);

        city = new JLabel("City");
        city.setBounds(50, 200, 100, 20);
        panel.add(city);

        cityText = new TextField();
        cityText.setBounds(180, 200, 150, 20);
        panel.add(cityText);

        state = new JLabel("State");
        state.setBounds(50, 240, 100, 20);
        panel.add(state);

        stateText = new TextField();
        stateText.setBounds(180, 240, 150, 20);
        panel.add(stateText);

        email = new JLabel("Email");
        email.setBounds(50, 280, 100, 20);
        panel.add(email);

        emailText = new TextField();
        emailText.setBounds(180, 280, 150, 20);
        panel.add(emailText);

        phone = new JLabel("Phone");
        phone.setBounds(50, 320, 100, 20);
        panel.add(phone);

        phoneText = new TextField();
        phoneText.setBounds(180, 320, 150, 20);
        panel.add(phoneText);

        next = new JButton("Next");
        next.setBounds(120, 390, 100, 25);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        panel.add(next);

        cancel = new JButton("Cancel");
        cancel.setBounds(250, 390, 100, 25);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        panel.add(cancel);

        Random ran = new Random();
        long number = ran.nextLong() % 1000000;
        meterNumText.setText("" + Math.abs(number));

        setLayout(new BorderLayout());
        add(panel, "Center");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
        Image i2 = i1.getImage().getScaledInstance(230, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageLabel = new JLabel(i3);
        add(imageLabel, "West");

        setSize(700, 500);
        setLocation(400, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource() == next){
            String sname = nameText.getText();
            String smeter = meterNumText.getText();
            String saddress = addressText.getText();
            String scity = cityText.getText();
            String sstate = stateText.getText();
            String semail = emailText.getText();
            String sphone = phoneText.getText();

            String queryCustomer = "insert into newCustomer values('"+sname+"', '"+smeter+"', '"+saddress+"', '"+scity+"', '"+sstate+"', '"+semail+"', '"+sphone+"')";
            String querySignup = "insert into Signup values('"+smeter+"', '', '"+sname+"', '', '')";

            try{
                Database c = new Database();
                c.statement.executeUpdate(queryCustomer);
                c.statement.executeUpdate(querySignup);
                JOptionPane.showMessageDialog(null, "Customer Details added successfully");
                setVisible(false);
                new MeterInfo(smeter);
            }
            catch(Exception ec){
                ec.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}
