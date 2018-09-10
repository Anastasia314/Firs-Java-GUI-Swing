package App;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class LoginScreen extends JFrame implements ActionListener {

    JButton btnlogin,btnreset,btnexit,reg;
    JTextField jtfuser;
    JPasswordField jpfpass;
    JLabel jlabuser, jlabpass;

    public LoginScreen(String name) {
        super(name);
        btnlogin = new JButton("Вход");
        btnreset = new JButton("Сброс");
        btnexit = new JButton("Выход");
        reg = new JButton("Регистрация");

        jtfuser = new JTextField();
        jpfpass = new JPasswordField();

        jlabuser = new JLabel("Имя:   ");
        jlabpass = new JLabel("Пароль:");

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnlogin.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                ClientConect c =new ClientConect();
                try {
                    if (c.clientConection(jtfuser.getText(),jpfpass.getText())==1){

                        if(jtfuser.getText().equals("Admin") && jpfpass.getText().equals("Admin")){
                            JOptionPane.showMessageDialog(null, "Выполнен вход администратора");
                            AdminScreen Admin=new AdminScreen("Работа администратора");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Вход выполнен");
                            Task task=new Task("Решение задачи");
                        }

                    }
                    else JOptionPane.showMessageDialog(null, "Вход НЕ выполнен");
                }
                catch(IOException ie) {
                    JOptionPane.showMessageDialog(null, "Возникли проблемы с подключением к серверу");
                }
            }
        });

        reg.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
               RegistrationScreen reg=new RegistrationScreen("Регистрация пользователя");
            }
        });
        btnreset.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                jtfuser.setText("");
                jpfpass.setText("");
            }
        });

        btnexit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                System.exit(0);
            }
        });

        jlabuser.setBounds(10,10,120,20);
        jlabpass.setBounds(10,30,120,20);

        jtfuser.setBounds(95,10,205,20);
        jpfpass.setBounds(95,30,205,20);

        btnlogin.setBounds(95,55,65,20);
        btnreset.setBounds(155,55,72,20);
        btnexit.setBounds(225,55,75,20);
        reg.setBounds(95,85,110,20);

        this.add(jlabuser);
        this.add(jlabpass);
        this.add(jtfuser);
        this.add(jpfpass);
        this.add(btnlogin);
        this.add(btnreset);
        this.add(btnexit);
        this.add(reg);

        this.setSize(350,150);
        setLocationRelativeTo(null);
        this.setVisible(true);


    }
    public void actionPerformed(ActionEvent e) {

    }
}
