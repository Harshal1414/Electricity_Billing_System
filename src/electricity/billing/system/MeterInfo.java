package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class MeterInfo extends JFrame {
    Choice meterLocCho, meterTypCho, phaseCodeCho, billTypCho;
    JButton submit;
    MeterInfo() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(252, 186, 3));
        add(panel);

        JLabel heading = new JLabel("Meter Information");
        heading.setBounds(100, 10, 200, 20);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(heading);

        JLabel meterNumber = new JLabel("Meter Number");
        meterNumber.setBounds(50, 80, 100, 20);
        panel.add(meterNumber);

        JLabel meterNumberText = new JLabel();
        meterNumberText.setBounds(180, 80, 100, 20);
        panel.add(meterNumberText);

        JLabel meterLoc = new JLabel("Meter Location");
        meterLoc.setBounds(50, 120, 100, 20);
        panel.add(meterLoc);

        meterLocCho = new Choice();
        meterLocCho.add("Outside");
        meterLocCho.add("Inside");
        meterLocCho.setBounds(180,120, 150,20);
        panel.add(meterLocCho);

        JLabel meterType = new JLabel("Meter Type");
        meterType.setBounds(50, 160, 100, 20);
        panel.add(meterType);

        meterTypCho = new Choice();
        meterTypCho.add("Electric");
        meterTypCho.add("Solar");
        meterTypCho.add("Smart Meter");
        meterTypCho.setBounds(180,160, 150,20);
        panel.add(meterTypCho);

        JLabel phaseCode = new JLabel("Phase Code");
        phaseCode.setBounds(50, 200, 100, 20);
        panel.add(phaseCode);

        phaseCodeCho = new Choice();
        phaseCodeCho.add("011");
        phaseCodeCho.add("022");
        phaseCodeCho.add("033");
        phaseCodeCho.add("044");
        phaseCodeCho.add("055");
        phaseCodeCho.add("066");
        phaseCodeCho.add("077");
        phaseCodeCho.add("088");
        phaseCodeCho.add("099");
        phaseCodeCho.setBounds(180,200, 150,20);
        panel.add(phaseCodeCho);

        JLabel billType = new JLabel("Bill Type");
        billType.setBounds(50, 240, 100, 20);
        panel.add(billType);

        billTypCho = new Choice();
        billTypCho.add("Normal");
        billTypCho.add("Industrial");
        billTypCho.setBounds(180,240, 150,20);
        panel.add(billTypCho);

        JLabel day = new JLabel("30 Days Billing Time...");
        day.setBounds(50, 280, 150, 20);
        panel.add(day);

        JLabel note = new JLabel("Note:-");
        note.setBounds(50, 320, 100, 20);
        panel.add(note);

        JLabel note1 = new JLabel("By default bill is calculated for 30 days only.");
        note1.setBounds(50, 340, 250, 20);
        panel.add(note1);

        submit = new JButton("Submit");
        submit.setBounds(230, 390, 100, 25);
        submit.setForeground(Color.black);
        submit.setForeground(Color.white);
        panel.add(submit);

        setLayout(new BorderLayout());
        add(panel, "Center");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/details.png"));
        Image i2 = i1.getImage().getScaledInstance(230, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imgLabel = new JLabel(i3);
        add(imgLabel, "East");

        setSize(700, 500);
        setLocation(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MeterInfo();
    }
}
