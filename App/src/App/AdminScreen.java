package App;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class AdminScreen extends JFrame implements ActionListener {

    JButton watchUsers, testTask, deleteUser, exit;

    public AdminScreen (String name)
    {
        super(name);
        watchUsers=new JButton("Просмотр всех пользователей");
        testTask=new JButton("Протестировать метод");
        deleteUser=new JButton("Удалить пользователя");
        exit=new JButton("Выход");

        this.setLayout(null);

        watchUsers.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                ClientConect c =new ClientConect();
                try{
                    String[][] array= c.watchUsers();
                    String[] columnNames = {
                            "Login",
                            "Password"
                    };
                    JTable table = new JTable(array,columnNames);
                    JScrollPane scrollPane = new JScrollPane(table);
                    JFrame frame = new JFrame("База пользователей");
                    frame.getContentPane().add(scrollPane);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                    scrollPane.setVisible(true);
                    }
                catch(IOException ie) {
                    JOptionPane.showMessageDialog(null, "Возникли проблемы с подключением к серверу");
                }

            }
        });

        testTask.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                Task task=new Task("Решение задачи");
            }
        });
        deleteUser.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                ClientConect c =new ClientConect();
                DeleteUserScreen delete=new DeleteUserScreen("Удаление пользователя");
                }
        });
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                setVisible(false);
            }
        });
        watchUsers.setBounds(50,10,250,20);
        deleteUser.setBounds(50,40,250,20);
        testTask.setBounds(50,70,250,20);
        exit.setBounds(50,100,250,20);

        this.add(watchUsers);
        this.add(deleteUser);
        this.add(testTask);
        this.add(exit);

        this.setSize(350,160);
        setLocationRelativeTo(null);
        this.setVisible(true);


    }
    public void actionPerformed(ActionEvent e) {

    }
}
