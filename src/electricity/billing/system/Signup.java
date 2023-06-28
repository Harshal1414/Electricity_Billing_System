package electricity.billing.system;

import javax.swing.*;

public class Signup extends JFrame {
    Signup(){
        super("Signup Page");

        JLabel createAs = new JLabel("Create Account As")

        setSize(600,300);
        setLocation(500, 200);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup();
    }
}
