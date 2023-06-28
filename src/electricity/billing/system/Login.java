package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JTextField userText, passText;
    Choice loginChoice;
    JButton loginButton, cancelButton, signupButton;
    Login(){
        super("Login");
        getContentPane().setBackground(Color.gray);
        JLabel userName = new JLabel("UserName");
        userName.setBounds(300, 60, 100, 20);
        add(userName);

        userText = new JTextField();
        userText.setBounds(400, 60, 150, 20);
        add(userText);

        JLabel password = new JLabel("Password");
        password.setBounds(300, 100, 100, 20);
        add(password);

        passText = new JTextField();
        passText.setBounds(400, 100, 150, 20);
        add(passText);

        JLabel loggin = new JLabel("Loggin In As");
        loggin.setBounds(300, 140, 100, 20);
        add(loggin);

        loginChoice = new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400, 140, 150, 20);
        add(loginChoice);

        loginButton = new JButton("Login");
        loginButton.setBounds(310, 180,100,20);
        add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(435,180,100,20);
        add(cancelButton);

        signupButton = new JButton("Sign-up");
        signupButton.setBounds(373, 212,100,20);
        add(signupButton);

        ImageIcon profileOne = new ImageIcon(ClassLoader.getSystemResource("Icon/profile.png"));
        Image profileTwo = profileOne.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon profile1 = new ImageIcon((profileTwo));
        JLabel profileLable = new JLabel((profile1));
        profileLable.setBounds(10,5,250,250);
        add(profileLable);

        setSize(640, 300);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
