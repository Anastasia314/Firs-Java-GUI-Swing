package App;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Task extends JFrame implements ActionListener
{
    JButton ok,exit,reset;
    JTextField jTextField1,jTextField2,jTextField3,jTextField4,jTextField5,jTextField6,
            jTextField7,jTextField8,jTextField9,jTextField10,jTextField11,jTextField12,
            jTextField13,jTextField14,jTextField15,jTextField16,jTextField17,jTextField18,b1,b2,b3;
    JLabel M1,m1,m2,m3,M2,M3,m11,m22,m33,B1,B2,B3,
            r1,r2,r3,R1,R2,R3,
            D1,D2,D3,Ck1,Ck2,Ck3, Dc1,Dc2,Dc3,
          text1,text2,text3,text4,text5,text6, BB1,BB2,BB3;
    JSpinner jSpinner1, jSpinner2, jSpinner3, jSpinner4, jSpinner5,
            jSpinner6,jSpinner7,jSpinner8,jSpinner9,jSpinner10,
            jSpinner11,jSpinner12,jSpinner13,jSpinner14,jSpinner15;



    public Task(String name)
    {
        super(name);
        ok=new JButton("Ок");
        exit=new JButton("Выход");
        reset=new JButton("Сброс");
        jSpinner1 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner2 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner3 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner4 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner5 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner6 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner7 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner8 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner9 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner10 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner11 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner12 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner13 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner14 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        jSpinner15 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));

        jTextField1=new JTextField();
        jTextField2=new JTextField();
        jTextField3=new JTextField();
        jTextField4=new JTextField();
        jTextField5=new JTextField();
        jTextField6=new JTextField();
        jTextField7=new JTextField();
        jTextField8=new JTextField();
        jTextField9=new JTextField();
        jTextField10=new JTextField();
        jTextField11=new JTextField();
        jTextField12=new JTextField();
        jTextField13=new JTextField();
        jTextField14=new JTextField();
        jTextField15=new JTextField();
        jTextField16=new JTextField();
        jTextField17=new JTextField();
        jTextField18=new JTextField();
        b1=new JTextField();
        b2=new JTextField();
        b3=new JTextField();
        BB1=new JLabel("B1");
        BB2=new JLabel("B2");
        BB3=new JLabel("B3");

        m1=new JLabel("Э1");
        m2=new JLabel("Э2");
        m3=new JLabel("Э3");
        m11=new JLabel("Э1");
        m22=new JLabel("Э2");
        m33=new JLabel("Э3");
        M1=new JLabel("Э1");
        M2=new JLabel("Э2");
        M3=new JLabel("Э3");
        B1=new JLabel("B1");
        B2=new JLabel("B2");
        B3=new JLabel("B3");
        r1=new JLabel("r1");
        r2=new JLabel("r2");
        r3=new JLabel("r3");
        R1=new JLabel("<R1>");
        R2=new JLabel("<R2>");
        R3=new JLabel("<R3>");
        D1=new JLabel(" D1");
        D2=new JLabel(" D2");
        D3=new JLabel(" D3");
        Ck1=new JLabel("Ck1");
        Ck2=new JLabel("Ck2");
        Ck3=new JLabel("Ck3");
        Dc1=new JLabel("Dc1");
        Dc2=new JLabel("Dc2");
        Dc3=new JLabel("Dc3");
        text1=new JLabel("Матрица взаимных оценок компетентности экспертов:");
        text2=new JLabel("Матрица оценок конкурирующих вариантов системы:");
        text3=new JLabel("Оценки компетентности экспертов:");
        text4=new JLabel("Дисперсия оценок экспертов:");
        text5=new JLabel("Коэффициенты предпочтительности вариантов:");
        text6=new JLabel("Дисперсия оценок вариантов:");


        this.setLayout(null);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ok.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent event) {
                int R12 = (int) jSpinner1.getValue();
                int R13 = (int) jSpinner2.getValue();
                int R21 = (int) jSpinner3.getValue();
                int R23 = (int) jSpinner4.getValue();
                int R31 = (int) jSpinner5.getValue();
                int R32 = (int) jSpinner6.getValue();

                int C11 = (int) jSpinner7.getValue();
                int C12 = (int) jSpinner8.getValue();
                int C13 = (int) jSpinner9.getValue();
                int C21 = (int) jSpinner10.getValue();
                int C22 = (int) jSpinner11.getValue();
                int C23 = (int) jSpinner12.getValue();
                int C31 = (int) jSpinner13.getValue();
                int C32 = (int) jSpinner14.getValue();
                int C33 = (int) jSpinner15.getValue();
                double r1 = (double) (R12 + R13) / (R12 + R13 + R21 + R23 + R31 + R32);
                double r2 = (double) (R21 + R23) / (R12 + R13 + R21 + R23 + R31 + R32);
                double r3 = (double) (R31 + R32) / (R12 + R13 + R21 + R23 + R31 + R32);
                jTextField4.setText(String.valueOf(Math.rint(100.0 * r1) / 100.0));
                jTextField5.setText(String.valueOf(Math.rint(100.0 * r2) / 100.0));
                jTextField6.setText(String.valueOf(Math.rint(100.0 * r3) / 100.0));
                double R1 = (double) (R12 + R13) / 2;
                double R2 = (double) (R21 + R23) / 2;
                double R3 = (double) (R31 + R32) / 2;
                jTextField7.setText(String.valueOf(R1));
                jTextField8.setText(String.valueOf(R2));
                jTextField9.setText(String.valueOf(R3));
                double D1 = Math.pow((R12 - R1), 2) + Math.pow((R13 - R1), 2);
                double D2 = Math.pow((R21 - R2), 2) + Math.pow((R23 - R2), 2);
                double D3 = Math.pow((R31 - R3), 2) + Math.pow((R32 - R3), 2);
                jTextField10.setText(String.valueOf(D1));
                jTextField11.setText(String.valueOf(D2));
                jTextField12.setText(String.valueOf(D3));
                double C1 = (C11 * r1 + C12 * r1 + C13 * r1) /
                        ((C11 * r1 + C12 * r1 + C13 * r1) +
                                (C21 * r1 + C22 * r1 + C23 * r1) +
                                (C31 * r1 + C32 * r1 + C33 * r1));
                double C2 = (C21 * r2 + C22 * r2 + C23 * r2) /
                        ((C11 * r2 + C12 * r2 + C13 * r2) +
                                (C21 * r2 + C22 * r2 + C23 * r2) +
                                (C31 * r2 + C32 * r2 + C33 * r2));
                double C3 = (C31 * r3 + C32 * r3 + C33 * r3) /
                        ((C11 * r3 + C12 * r3 + C13 * r3) +
                                (C21 * r3 + C22 * r3 + C23 * r3) +
                                (C31 * r3 + C32 * r3 + C33 * r3));
                DecimalFormatSymbols s = new DecimalFormatSymbols();
                s.setDecimalSeparator('.');
                DecimalFormat f = new DecimalFormat("0.000", s);
                C1 = Double.valueOf(f.format(C1));
                C2 = Double.valueOf(f.format(C2));
                C3 = Double.valueOf(f.format(C3));
                jTextField13.setText(String.valueOf(C1));
                jTextField14.setText(String.valueOf(C2));
                jTextField15.setText(String.valueOf(C3));
                double sC1 = (double) (C11 + C12 + C13) / 3;
                double sC2 = (double) (C21 + C22 + C23) / 3;
                double sC3 = (double) (C31 + C32 + C33) / 3;
                System.out.println(sC1);
                double Dc1 = Math.pow((C11 - sC1), 2) + Math.pow((C12 - sC1), 2) + Math.pow((C13 - sC1), 2);
                double Dc2 = Math.pow((C21 - sC2), 2) + Math.pow((C22 - sC2), 2) + Math.pow((C23 - sC2), 2);
                double Dc3 = Math.pow((C31 - sC3), 2) + Math.pow((C32 - sC3), 2) + Math.pow((C33 - sC3), 2);
                System.out.println(Dc1);
                System.out.println(Math.pow((C11 - sC1), 2)+" " +Math.pow((C12 - sC1), 2) +" " + Math.pow((C13 - sC1), 2));
                jTextField16.setText(String.valueOf(Math.rint(10.0 * Dc1) / 10.0));
                jTextField17.setText(String.valueOf(Math.rint(10.0 * Dc2) / 10.0));
                jTextField18.setText(String.valueOf(Math.rint(10.0 * Dc3) / 10.0));
                List<Double> lst = new ArrayList();
                lst.add(C1);
                lst.add(C2);
                lst.add(C3);
                Double max = Collections.max(lst);
                int index = lst.indexOf(max) + 1;
                String title = "Рациональный вариант системы";
                String msg = "Наилучший вариант B" + index + " = " + max;
                JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);

                String fileName="D:\\IDEA\\App\\results.txt";
                try{
                    Date date = new Date();
                    FileWriter file = new FileWriter(fileName, true);
                    file.write("\r\nОтчет о результатах "+ date.toString()+"\r\n");
                    file.write("Наилучший вариант B" + index + " = " + max + "\r\n" );
                    file.write("Рассматривались альтернативы:  "+"\r\n1 "+ b1.getText()+"\r\n2 "+ b2.getText()+"\r\n3 "+ b3.getText()+"\r\n");
                    file.close();
                }
                catch(FileNotFoundException e){
                    System.out.println("It's impossible to write to file:"+fileName);
                }
                catch (IOException ex) {
                    System.out.println("Input/output error:");
                }
            }
        });

        reset.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent event)
            {
                jTextField1.setText("  -");
                jTextField2.setText("  -");
                jTextField3.setText("  -");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
                jTextField16.setText("");
                jTextField17.setText("");
                jTextField18.setText("");
                b1.setText("");
                b2.setText("");
                b3.setText("");

            }
        } );

        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                setVisible(false);
            }
        });


        text1.setBounds(10,10,350,20);
        text2.setBounds(350,10,350,20);
        m1.setBounds(60,30,20,20);
        m2.setBounds(120,30,20,20);
        m3.setBounds(180,30,20,20);
        m11.setBounds(30,50,20,20);
        m22.setBounds(30,80,20,20);
        m33.setBounds(30,110,20,20);
         jTextField1.setBounds(50,50,40,20);
        jSpinner1.setBounds(110,50,40,20);
        jSpinner2.setBounds(170,50,40,20);

        jSpinner3.setBounds(50,80,40,20);
        jTextField2.setBounds(110,80,40,20);
        jSpinner4.setBounds(170,80,40,20);

        jSpinner5.setBounds(50,110,40,20);
        jSpinner6.setBounds(110,110,40,20);
        jTextField3.setBounds(170,110,40,20);

        B1.setBounds(380,50,20,20);
        B2.setBounds(380,80,20,20);
        B3.setBounds(380,110,20,20);
        M1.setBounds(410,30,20,20);
        M2.setBounds(470,30,20,20);
        M3.setBounds(530,30,20,20);
        jSpinner7.setBounds(400,50,40,20);
        jSpinner8.setBounds(460,50,40,20);
        jSpinner9.setBounds(520,50,40,20);
        jSpinner10.setBounds(400,80,40,20);
        jSpinner11.setBounds(460,80,40,20);
        jSpinner12.setBounds(520,80,40,20);
        jSpinner13.setBounds(400,110,40,20);
        jSpinner14.setBounds(460,110,40,20);
        jSpinner15.setBounds(520,110,40,20);
        text3.setBounds(210,135,250,20);
        r1.setBounds(10,165,20,20);
        r2.setBounds(230,165,20,20);
        r3.setBounds(450,165,20,20);
        jTextField4.setBounds(35,165,100,20);
        jTextField5.setBounds(255,165,100,20);
        jTextField6.setBounds(475,165,100,20);
        text4.setBounds(225,200,200,20);
        R1.setBounds(5,230,30,20);
        R2.setBounds(225,230,30,20);
        R3.setBounds(445,230,30,20);
        jTextField7.setBounds(35,230,100,20);
        jTextField8.setBounds(255,230,100,20);
        jTextField9.setBounds(475,230,100,20);
        D1.setBounds(10,255,20,20);
        D2.setBounds(230,255,20,20);
        D3.setBounds(450,255,20,20);
        jTextField10.setBounds(35,255,100,20);
        jTextField11.setBounds(255,255,100,20);
        jTextField12.setBounds(475,255,100,20);
        text5.setBounds(180,300,300,20);
        Ck1.setBounds(5,330,25,20);
        Ck2.setBounds(225,330,25,20);
        Ck3.setBounds(445,330,25,20);
        jTextField13.setBounds(35,330,100,20);
        jTextField14.setBounds(255,330,100,20);
        jTextField15.setBounds(475,330,100,20);
        text6.setBounds(230,370,200,20);
        Dc1.setBounds(5,400,25,20);
        Dc2.setBounds(225,400,25,20);
        Dc3.setBounds(445,400,25,20);
        jTextField16.setBounds(35,400,100,20);
        jTextField17.setBounds(255,400,100,20);
        jTextField18.setBounds(475,400,100,20);
        ok.setBounds(350,450,75,20);
        reset.setBounds(440,450,75,20);
        exit.setBounds(530,450,75,20);
        b1.setBounds(610,50,250,20);
        b2.setBounds(610,80,250,20);
        b3.setBounds(610,110,250,20);
        BB1.setBounds(590,50,20,20);
        BB2.setBounds(590,80,20,20);
        BB3.setBounds(590,110,20,20);

        jTextField1.setText("  -");
        jTextField2.setText("  -");
        jTextField3.setText("  -");
        this.add(text1);
        this.add(text2);
        this.add(text3);
        this.add(text4);
        this.add(text5);
        this.add(text6);
        this.add(m1);         this.add(m2);         this.add(m3);
        this.add(m11);        this.add(m22);        this.add(m33);
        this.add(M1);         this.add(M2);         this.add(M3);
        this.add(B1);         this.add(B2);         this.add(B3);
        this.add(r1);         this.add(r2);         this.add(r3);
        this.add(R1);         this.add(R2);         this.add(R3);
        this.add(D1);         this.add(D2);         this.add(D3);
        this.add(Ck1);        this.add(Ck2);        this.add(Ck3);
        this.add(Dc1);        this.add(Dc2);        this.add(Dc3);
        this.add(jSpinner1);
        this.add(jSpinner2);
        this.add(jSpinner3);
        this.add(jSpinner4);
        this.add(jSpinner5);
        this.add(jSpinner6);
        this.add(jSpinner7);
        this.add(jSpinner8);
        this.add(jSpinner9);
        this.add(jSpinner10);
        this.add(jSpinner11);
        this.add(jSpinner12);
        this.add(jSpinner13);
        this.add(jSpinner14);
        this.add(jSpinner15);
        this.add(jTextField1);
        this.add(jTextField2);
        this.add(jTextField3);
        this.add(jTextField4);
        this.add(jTextField5);
        this.add(jTextField6);
        this.add(jTextField7);
        this.add(jTextField8);
        this.add(jTextField9);
        this.add(jTextField10);
        this.add(jTextField11);
        this.add(jTextField12);
        this.add(jTextField13);
        this.add(jTextField14);
        this.add(jTextField15);
        this.add(jTextField16);
        this.add(jTextField17);
        this.add(jTextField18);
        this.add(reset);
        this.add(exit);
        this.add(ok);
        this.add(b1); this.add(b2); this.add(b3);
        this.add(BB1); this.add(BB2); this.add(BB3);
        this.setSize(900,510);
        setLocationRelativeTo(null);
        this.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {  }

}