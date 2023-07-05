package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class MainClass extends JFrame {
    MainClass(){
        super("Home Page");
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icon/ebs.png"));
        Image image = imageIcon.getImage().getScaledInstance(1530,830, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon2);
        add(imageLabel);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(menu);

        JMenuItem newCustomer = new JMenuItem("New Customer");
        newCustomer.setFont((new Font("monospaced", Font.PLAIN, 14)));
        ImageIcon customerImg = new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image customerImage = customerImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newCustomer.setIcon(new ImageIcon(customerImage));
        menu.add(newCustomer);

        JMenuItem customerDetails = new JMenuItem("Customer Details");
        customerDetails.setFont((new Font("monospaced", Font.PLAIN, 14)));
        ImageIcon customerDetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image customerDetailsImage = customerDetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerDetails.setIcon(new ImageIcon(customerDetailsImage));
        menu.add(customerDetails);

        JMenuItem depositDetails = new JMenuItem("Deposit Details");
        depositDetails.setFont((new Font("monospaced", Font.PLAIN, 14)));
        ImageIcon depositDetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/depositdetails.png"));
        Image depositDetailsImage = depositDetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositDetails.setIcon(new ImageIcon(depositDetailsImage));
        menu.add(depositDetails);

        JMenuItem calculateBills = new JMenuItem("Calculate Bills");
        calculateBills.setFont((new Font("monospaced", Font.PLAIN, 14)));
        ImageIcon calculateBillsImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image calculateBillsImage = calculateBillsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculateBills.setIcon(new ImageIcon(calculateBillsImage));
        menu.add(calculateBills);

        JMenu info = new JMenu("Information");
        info.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(info);

        JMenuItem upInfo = new JMenuItem("Update Information");
        upInfo.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon updateInfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image updateInformationImg = updateInfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        upInfo.setIcon(new ImageIcon(updateInformationImg));
        info.add(upInfo);

        JMenuItem viewInfo = new JMenuItem("View Information");
        viewInfo.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon viewInfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
        Image viewInformationImg = viewInfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewInfo.setIcon(new ImageIcon(viewInformationImg));
        info.add(viewInfo);

        JMenu user = new JMenu("User");
        user.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(user);

        JMenuItem payBill = new JMenuItem("View Information");
        payBill.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon payBillImg = new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image payBillImage = payBillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        payBill.setIcon(new ImageIcon(payBillImage));
        user.add(payBill);

        JMenuItem billDetails = new JMenuItem("Bill Details");
        billDetails.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon billDetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image billDetailsImage = billDetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billDetails.setIcon(new ImageIcon(billDetailsImage));
        user.add(billDetails);

        JMenu bill = new JMenu("Bill");
        bill.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(bill);

        JMenuItem genBill = new JMenuItem("Generate Bill");
        genBill.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon genBillImg = new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image genBillImage = genBillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        genBill.setIcon(new ImageIcon(genBillImage));
        bill.add(genBill);

        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(utility);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon notepadImg = new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image notepadImage = notepadImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadImage));
        utility.add(notepad);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon calculatorImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calculatorImage = calculatorImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorImage));
        utility.add(calculator);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(exit);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon exitImg = new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image exitImage = exitImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        exitItem.setIcon(new ImageIcon(exitImage));
        exit.add(exitItem);

        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        new MainClass();
    }
}
