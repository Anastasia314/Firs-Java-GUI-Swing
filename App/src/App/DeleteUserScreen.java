package App;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

public class DeleteUserScreen extends JFrame implements ActionListener {
    public DeleteUserScreen(String NAME){
        super(NAME);
        JTextField user = new JTextField();
        JButton ok = new JButton("OK");
        JLabel name = new JLabel("Логин");
        ok.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                String name = user.getText();
                try {
                    Socket fromserver = null;
                    fromserver = new Socket("localhost", 1024);
                    BufferedReader in = new
                            BufferedReader(new
                            InputStreamReader(fromserver.getInputStream()));
                    PrintWriter out = new
                            PrintWriter(fromserver.getOutputStream(), true);
                    String fserver;
                    out.println("deleteUser");
                    out.println(name);
                    fserver = in.readLine();
                    if (fserver.equals("1"))
                        JOptionPane.showMessageDialog(null, "Удаление прошло успешно");
                    else JOptionPane.showMessageDialog(null, "Произошла ошибка удаления");
                    out.close();
                    in.close();
                    fromserver.close();
                    setVisible(false);
                } catch (IOException ie){}
            }
        });
        this.setLayout(null);
        this.setSize(320, 100);
        this.setLocationRelativeTo(null);
        name.setBounds(20, 10, 40, 20);
        user.setBounds(80, 10, 170, 20);
        ok.setBounds(80, 30, 60, 20);
        this.add(ok);
        this.add(name);
        this.add(user);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {

    }
}
