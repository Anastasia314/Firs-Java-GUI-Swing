import java.io.*;
import java.net.*;

public class ServerConection {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Server side");
        BufferedReader in = null;
        PrintWriter    out= null;
        ServerSocket servers = null;
        Socket  fromclient = null;            // create server socket
        try {
            servers = new ServerSocket(4444);
        } catch (IOException e) {
            System.out.println("Couldn't listen to port 4444");
            System.exit(-1);
        }
        while(true){
            try {
                System.out.print("Waiting for a client...");
                fromclient= servers.accept();
                System.out.println("Client connected");
            } catch (IOException e) {
                System.out.println("Can't accept");
                System.exit(-1);
            }



            in  = new BufferedReader(new InputStreamReader(fromclient.getInputStream()));
            out = new PrintWriter(fromclient.getOutputStream(),true);

            String task;
            task=in.readLine();
            if(task.equals("login"))
            {
                String  login,password;
                login = in.readLine();
                if(login.equals("exit")){break;}
                password = in.readLine();
                Server m = new Server();
                if (m.testDatabase(login, password) == 1) {
                    out.println(1);
                } else out.println(0);
            }

            if(task.equals("registration"))
            {
                String  login,password;
                login = in.readLine();
                password = in.readLine();
                Server m = new Server();
                if (m.Registrate(login, password) == 1) {
                    out.println(1);
                } else out.println(0);
            }
        }


        out.close();
        in.close();
        fromclient.close();
        servers.close();
    }

}
