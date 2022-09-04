import java.sql.Connection;
import java.sql.SQLException;

public class MyThread extends Thread {
    Connection connection = DbConnection.getConnection();

    public MyThread() throws SQLException {
    }

    public void run(String var) throws SQLException {
        DbConnection.insert(connection,"Thread="+var,"Thread= "+var);
    }
}
