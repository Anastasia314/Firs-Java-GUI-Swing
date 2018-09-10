import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Server
{
    public int testDatabase(String log,String pas)
    {
        try {
            String url = "jdbc:mysql://localhost:3306/users";
            String login = "root";
            String password = "";
            Connection con=DriverManager.getConnection(url,login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM login");
                while (rs.next()) {
                    String str1 = rs.getString("login");
                    String str2=rs.getString("password");
                    if(str1.equals(log) && str2.equals(pas)){
                        rs.close();
                        return 1;
                    }
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Registrate(String log,String pas)
    {
        try {
            String url = "jdbc:mysql://localhost:3306/users";
            String login = "root";
            String password = "";
            Connection con=DriverManager.getConnection(url,login, password);
            try {
                Statement stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO login(login,password) VALUES ('"+log+"','"+pas+"')");
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

}