
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.*;

public class DbConnection {

    private static volatile Connection connection = null;
    private static String conString = "jdbc:sqlserver://DESKTOP-C2BM7MQ;databaseName=user;encrypt=true;trustServerCertificate=true;user=TBC;password=asdasd123";

    public static Connection getConnection() throws SQLException {
            synchronized (DbConnection.class){
                DriverManager.registerDriver(new SQLServerDriver());
                connection = DriverManager.getConnection(conString);
                connection.setAutoCommit(true);
            }
        return connection;
    }
    public static int insert(Connection connection,String name,String surname) throws SQLException {
        Connection conn = connection;
        Statement statement =  conn.createStatement();
        return statement.executeUpdate("INSERT INTO [User].[dbo].[Users] (name,surname) values ('"+name+"','"+surname+"')");
    }



}