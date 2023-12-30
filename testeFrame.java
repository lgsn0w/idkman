import javax.swing.*;
import java.awt.*;

public class testeFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(612, 312);

        ImageIcon Osaka = new ImageIcon("osaka2.png");
        frame.setIconImage(Osaka.getImage());

        //TODO usar um construtor de JLabel que aceite um ImageIcon como argumento(?)
        //TODO o método deixa a imagem meio cagada??? 🤣🤣🤣🤣
        ImageIcon background = new ImageIcon("background.png");
        frame.setContentPane(new JLabel(background));

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 10, 80, 25);
        frame.add(usernameLabel);

        JTextField usernameText = new JTextField(20);
        usernameText.setBounds(100, 10, 160, 25);
        frame.add(usernameText);

        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(10,70,80,25);
        frame.add(passwordLabel);

        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(100,70,160,25);
        frame.add(passwordText);


        JButton loginButton = new JButton("Login");
        loginButton.setBounds(80, 170, 80, 25);
        frame.add(loginButton);

        ImageIcon Konata = new ImageIcon("popupKonata.png");

        loginButton.addActionListener(e -> {
            JLabel konataLabel = new JLabel("", Konata, JLabel.CENTER);
            JOptionPane.showMessageDialog(frame, konataLabel, "Login Successful", JOptionPane.INFORMATION_MESSAGE);
        });

        frame.setLayout(null);
        frame.setVisible(true);

    }
}
