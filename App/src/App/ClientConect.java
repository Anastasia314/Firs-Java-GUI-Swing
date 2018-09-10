package App;


import java.io.*;
import java.net.*;

public class ClientConect {
    public int clientConection (String login, String password) throws IOException {

            Socket fromserver = null;

            fromserver = new Socket("localhost", 1024);
            BufferedReader in = new
                    BufferedReader(new
                    InputStreamReader(fromserver.getInputStream()));
            PrintWriter out = new
                    PrintWriter(fromserver.getOutputStream(), true);
            BufferedReader inu = new
                    BufferedReader(new InputStreamReader(System.in));

            String fserver;

            out.println("login");
            out.println(login);
            out.println(password);
            fserver = in.readLine();
            if (fserver.equals("1"))
                return 1;


            out.close();
            in.close();
            inu.close();
            fromserver.close();
            return 0;
        }
        public int ClientReg (String login, String password) throws IOException {
                Socket fromserver = null;
                fromserver = new Socket("localhost", 1024);
                BufferedReader in = new
                        BufferedReader(new
                        InputStreamReader(fromserver.getInputStream()));
                PrintWriter out = new
                        PrintWriter(fromserver.getOutputStream(), true);

                String fserver;

                out.println("registration");
                out.println(login);
                out.println(password);
                fserver = in.readLine();
                if (fserver.equals("1"))
                        return 1;


                out.close();
                in.close();
                fromserver.close();
                return 0;
        }
        public String[][] watchUsers() throws IOException{
                Socket fromserver = null;
                fromserver = new Socket("localhost", 1024);
                BufferedReader in = new
                        BufferedReader(new
                        InputStreamReader(fromserver.getInputStream()));
                PrintWriter out = new
                        PrintWriter(fromserver.getOutputStream(), true);

                String[][] users=new String[20][2];
                out.println("watchUsers");
                int i=0;
                do{
                        users[i][0]= in.readLine();
                        if(!users[i][0].equals(" "))
                        users[i][1]= in.readLine();
                        i++;
                }while(!users[i-1][0].equals(" "));
                out.close();
                in.close();
                fromserver.close();
                return users;
        }


    }