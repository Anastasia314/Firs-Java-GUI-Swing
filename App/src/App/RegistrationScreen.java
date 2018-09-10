package App;


import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class RegistrationScreen extends JFrame implements ActionListener
{
    JButton ok,btnreset,exit;
    JTextField jtfuser;
    JPasswordField jpfpass;
    JLabel jlabuser, jlabpass;

    public RegistrationScreen(String name)
    {
        super(name);
        ok=new JButton("Ok");
        btnreset=new JButton("Сброс");
        exit=new JButton("Выход");

        jtfuser=new JTextField();
        jpfpass=new JPasswordField();

        jlabuser=new JLabel("Имя:   ");
        jlabpass=new JLabel("Пароль:");

        this.setLayout(null);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ok.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                ClientConect c =new ClientConect();
                try{
                    if (c.ClientReg(jtfuser.getText(),jpfpass.getText())==1){
                        JOptionPane.showMessageDialog(null, "Регистрация выполнена");
                        }
                    else JOptionPane.showMessageDialog(null, "Ошибка регистрации");
                }
                catch(IOException ie) {
                    JOptionPane.showMessageDialog(null, "Возникли проблемы с подключением к серверу");
                }
            setVisible(false);
            }
        });

        btnreset.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                jtfuser.setText("");
                jpfpass.setText("");
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                setVisible(false);
            }
        });

        jlabuser.setBounds(10,10,120,20);
        jlabpass.setBounds(10,30,120,20);

        jtfuser.setBounds(95,10,205,20);
        jpfpass.setBounds(95,30,205,20);

        ok.setBounds(95,55,65,20);
        btnreset.setBounds(155,55,72,20);
        exit.setBounds(225,55,75,20);

        this.add(jlabuser);
        this.add(jlabpass);
        this.add(jtfuser);
        this.add(jpfpass);
        this.add(ok);
        this.add(btnreset);
        this.add(exit);

        this.setSize(350,120);
        setLocationRelativeTo(null);
        this.setVisible(true);


    }
    public void actionPerformed(ActionEvent e) {

    }
}
